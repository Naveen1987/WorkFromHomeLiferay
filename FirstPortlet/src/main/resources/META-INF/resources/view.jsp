<%@page import="com.daffo.wiki_node_tableservice.model.wiki_node_table"%>
<%@page import="com.daffo.wiki_node_tableservice.service.wiki_comment_tableLocalServiceUtil"%>
<%@page import="com.daffo.wiki_node_tableservice.service.wiki_pagedata_tableLocalServiceUtil"%>
<%@page import="com.daffo.wiki_node_tableservice.service.wiki_page_tableLocalServiceUtil"%>
<%@page import="com.daffo.wiki_node_tableservice.service.wiki_node_tableLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.UnicodeFormatter"%>
<%@page import="com.liferay.portal.kernel.model.Portlet"%>
<%@page import="com.liferay.portal.kernel.model.LayoutTypePortlet"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@page import="com.liferay.portal.kernel.model.Group"%>
<%@page import="com.liferay.portal.kernel.service.UserServiceUtil"%>
<%@page import="com.liferay.portal.kernel.model.User"%>
<%@page import="com.liferay.portal.kernel.service.RoleLocalServiceUtil"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.liferay.portal.kernel.model.Role"%>
<%@page import="java.util.List"%>
<%@ include file="/init.jsp" %>
<%--<%User me=user; %>
<%
System.out.println(me.getFullName());
for(Role r:me.getRoles()){
	System.out.println(r.getName());
}
%>
--%>
<%--
<%
List<String> portletIdList = themeDisplay.getLayoutTypePortlet().getPortletIds();
for(String s:portletIdList){
	if(s.contains("com_liferay_wiki_web_portlet_WikiDisplayPortlet")){
		%>
		
		<%
		out.println(s);
	}
}

/* LayoutTypePortlet layoutTypePortlet = (LayoutTypePortlet) themeDisplay.getLayoutTypePortlet().getLayoutType();
List<Portlet> portletList = layoutTypePortlet.getAllPortlets();
out.println(portletList); */
%>
 --%>
<%--
<%

ThemeDisplay themeDisp = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
System.out.println("ID : " + themeDisp.getPortletDisplay().getId());

System.out.println("InstanceID: " + themeDisp.getPortletDisplay().getInstanceId());
System.out.println("Portlet Name: " + themeDisp.getPortletDisplay().getPortletName());
    
    %>
--%>
<%--
<aui:field-wrapper label="description">
    <liferay-ui:input-editor name="descriptionEditor" toolbarSet="liferay-article" initMethod="initEditor" width="200" />
    <script type="text/javascript">
        function <portlet:namespace />initEditor() { return "<%= UnicodeFormatter.toString("default content") %>"; }
    </script>
</aui:field-wrapper>
 --%>
 <%--
<aui:form name="fm" cssClass="inline-3D">
<liferay-ui:input-editor name="testEditor" height="100"/>
<input name="<portlet:namespace />htmlCodeFromEditorPlacedHere" type="hidden" value="" />
<input type="button" onclick="<portlet:namespace />extractCodeFromEditor()" value="Submit"/>
</aui:form>
<script type="text/javascript">
            function <portlet:namespace />initEditor() {
                        return '<font style="font-weight: bold">scott was here</font>';
            }

            function <portlet:namespace />extractCodeFromEditor() {
                        var x = document.<portlet:namespace />fm.<portlet:namespace />htmlCodeFromEditorPlacedHere.value = window.<portlet:namespace />testEditor.getHTML();
 
                        alert(x);
            }
</script>
 --%>
<%--<%=wiki_node_tableLocalServiceUtil.getwiki_node_table(1) %>
<%=wiki_page_tableLocalServiceUtil.getwiki_page_table(1) %>
<%=wiki_pagedata_tableLocalServiceUtil.getwiki_pagedata_table(1)%>
<%=wiki_comment_tableLocalServiceUtil.getwiki_comment_table(1) %>
--%>

<div class="container">
<%--First Row --%>
<div class="row">
<br/>
<div class="col-md-12">
<div class="row" style="margin-left:50px">
<div class="col-md-2">Select Wiki Node </div>
<div  class="col-md-6">
<select id="select-wikinode" class="select-wikinode form-control" >
<option selected>-Select-</option>
<%
List<wiki_node_table> wnt=wiki_node_tableLocalServiceUtil.getwiki_node_tables(0, wiki_node_tableLocalServiceUtil.getwiki_node_tablesCount());
for(wiki_node_table wn:wnt){
	%>
	<option value="<%= wn.getNodeID()%>"><%= wn.getNodeName()%></option>
	<%
}
%>
</select>
</div>
<div  class="col-md-3">
<span id="table-newWikiNode"  class="table-newWikiNode btn btn-primary" style="color:white">Add New Wiki Node</span> 
</div>
</div>
</div>
</div>
<%--Second Row --%>
<div class="row">
<br/>
<div class="col-md-12">
<div class="row" style="margin-left:50px">
<div class="col-md-2">Select Wiki Page </div>
<div  class="col-md-6">
<select width="300px" id="select-wikipage" class="select-wikipage form-control">
<option selected>-Select-</option>
</select></div>
<div  class="col-md-3">
<span id="table-newWikiPage"  class="table-newWikiPage btn btn-primary" style="color:white">Add New Wiki Page</span> 
</div>
</div>
</div>
</div>
<%--Three Row --%>
<div class="row">
<br/>
<div class="col-md-12">
<table width="100%">
<tbody>
<tr>
<td><span  id="table-wikiload" class="table-wikiload btn btn-warning" style="color:white">&nbsp;&nbsp;&nbsp;&nbsp;Load&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>
<td style="text-align:right"><span id="table-wikiPreview"  class="table-wikiPreview btn btn-primary">Wiki Preview</span></td>
</tr>
</tbody>
</table>
<input type="hidden" name="Pageversion" id="<portlet:namespace />Pageversion" value="">
<aui:field-wrapper label="Wiki Page Content">
<liferay-ui:input-editor name="pageData" toolbarSet="liferay-article" initMethod="initEditor" width="100%" height="100%" />
    <script type="text/javascript">
        function <portlet:namespace />initEditor() { return "<%= UnicodeFormatter.toString("") %>"; }
    </script>
</aui:field-wrapper>
</div>
</div>

<%--four Row --%>
<div class="row">
<br/>
<div class="col-md-12">
<span  id="table-wikiSubmit" class="table-wikiSubmit btn btn-warning" style="color:white">&nbsp;&nbsp;Submit&nbsp;&nbsp;&nbsp;</span> 
</div>
</div>
</div>

<portlet:resourceURL var="select_wikipage" id="select_wikipage">
</portlet:resourceURL>

<portlet:resourceURL var="load_data" id="load_data">
</portlet:resourceURL>

<script>
$("#table-newWikiNode").click(function(){
	alert("Wiki Node");
});

$("#table-newWikiPage").click(function(){
	alert("Wiki Page");
});

$("#table-wikiSubmit").click(function(){
	var version=$("#Pageversion").val(); 
	var node=$("#select-wikinode").val();
	var selectpage=$("#select-wikipage").val();
	var pagedata =window.<portlet:namespace />pageData.getHTML();
	
});

$(".table-wikiPreview").click(function(){
	alert("Wiki Preview");
});

$("#select-wikinode").change(function(){
	var data=$(".select-wikinode").val();
	$("#select-wikipage").empty(); 
	//Ajax
	AUI().use('aui-base','aui-io-request', function(A){
		//aui ajax call to get updated content
		A.io.request('<%=select_wikipage%>',{
  		dataType: 'json',
  		method: 'GET',
  		data: { '<portlet:namespace />data-value': data},
  		on: {
   			 success: function() {
   				var data=this.get('responseData');
   				A.Array.each(data, function(obj, idx){
   					$("#select-wikipage").append(
        $('<option>', {
            value: obj.pageID,
            text: obj.PageName
        }, '</option>'));
   				});
    		}
  		}
		});
		});
	//Ajax End
});

$("#table-wikiload").click(function(){
	var node=$("#select-wikinode").val();
	var selectpage=$("#select-wikipage").val();
	//Ajax
	AUI().use('aui-base','aui-io-request', function(A){
		//aui ajax call to get updated content
		A.io.request('<%=load_data%>',{
  		dataType: 'json',
  		method: 'GET',
  		data: { '<portlet:namespace />nodeID': node,'<portlet:namespace />pageID':selectpage},
  		on: {
   			 success: function() {
   				var data=this.get('responseData');
   				A.Array.each(data, function(obj, idx){
   					$("#Pageversion").val(obj.version);
   					window.<portlet:namespace />pageData.setHTML(obj.Pagedata);
   				});
    		}
  		}
		});
		});
	//Ajax End
});

</script>

