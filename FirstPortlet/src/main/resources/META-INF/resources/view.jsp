<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
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
<input type="hidden" name="<portlet:namespace />Pageversion" id="Pageversion" value="0">
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

<portlet:resourceURL var="save_data" id="save_data">
</portlet:resourceURL>
<script>
$("#table-newWikiNode").click(function(){
	/* alert("Wiki Node"); */
	var portletURL = Liferay.PortletURL.createRenderURL();
 	portletURL.setWindowState('<%=LiferayWindowState.POP_UP.toString() %>');
   // portletURL.setParameter('data', pagedata);    
    portletURL.setPortletId("<%=themeDisplay.getPortletDisplay().getId() %>");
    portletURL.setParameter('mvcPath', '/NewWikiNode.jsp');
    // Now we can use the URL
  // alert(portletURL.toString());
   Liferay.Util.openWindow({
		dialog: {
		centered: true,
		cssClass: 'my-liferay-popup',
		constrain2view: true,
		modal: true,
		width: 500,
		height:300
		},
		id: '<portlet:namespace/>addNewWikiNodedialog',
		title: 'New Wiki Node' ,
		uri:  portletURL.toString()
		});

});

$("#table-newWikiPage").click(function(){
	//alert("Wiki Page");
	var node=$("#select-wikinode").val();
	if(node.length===0||node=='-Select-'){
		alert("please Page or Add new NODE");
		return;
	}
	var portletURL = Liferay.PortletURL.createRenderURL();
 	portletURL.setWindowState('<%=LiferayWindowState.POP_UP.toString() %>');
    portletURL.setParameter('NodeId', node);    
    portletURL.setPortletId("<%=themeDisplay.getPortletDisplay().getId() %>");
    portletURL.setParameter('mvcPath', '/NewWikiPage.jsp');
    // Now we can use the URL
  // alert(portletURL.toString());
   Liferay.Util.openWindow({
		dialog: {
		centered: true,
		cssClass: 'my-liferay-popup',
		constrain2view: true,
		modal: true,
		width: 500,
		height:400
		},
		id: '<portlet:namespace/>addNewWikiPagedialog',
		title: 'New Wiki Page' ,
		uri:  portletURL.toString()
		});
});

$("#table-wikiSubmit").click(function(){
	var version=$("#Pageversion").val();
	if( version.length === 0 ) {
       version="1";
    }
	else{
		version=(parseInt(version)+1);
	}
	var node=$("#select-wikinode").val();
	if(node.length===0||node=='-Select-'){
		alert("please Page or Add new NODE");
		return;
	}
	var selectpage=$("#select-wikipage").val();
	if(selectpage==null||selectpage=='-Select-'){
		alert("There is NO page please Add new page");
		return;
	}
	var pagedata =window.<portlet:namespace />pageData.getHTML();
	if(pagedata.length===0){
		alert("please input data");
		return;
	}
	//alert(version+"-"+node+"-"+selectpage+"-"+pagedata);
	//Ajax
	AUI().use('aui-base','aui-io-request', function(A){
		//aui ajax call to get updated content
		A.io.request('<%=save_data%>',{
  		dataType: 'json',
  		method: 'GET',
  		data: { '<portlet:namespace />version': version,
  			'<portlet:namespace />node': node,
  			'<portlet:namespace />selectpage': selectpage,
  			'<portlet:namespace />data-value':pagedata },
  		on: {
   			 success: function() {
   				var data=this.get('responseData');
   				A.Array.each(data, function(obj, idx){
   					$("#Pageversion").val(obj.version);
   					alert(obj.msg);
   				});
    		}
  		}
		});
		});
	//Ajax End
	
});

$(".table-wikiPreview").click(function(){
	var pagedata =window.<portlet:namespace />pageData.getHTML();
	if(pagedata.length===0){
		alert("please input data");
		return;
	}
	var portletURL = Liferay.PortletURL.createRenderURL();
 	portletURL.setWindowState('<%=LiferayWindowState.POP_UP.toString() %>');
    portletURL.setParameter('data', pagedata);    
    portletURL.setPortletId("<%=themeDisplay.getPortletDisplay().getId() %>");
    portletURL.setParameter('mvcPath', '/preview.jsp');
    // Now we can use the URL
  // alert(portletURL.toString());
   Liferay.Util.openWindow({
		dialog: {
		centered: true,
		cssClass: 'my-liferay-popup',
		constrain2view: true,
		modal: true,
		width: 950
		},
		id: '<portlet:namespace/>editdialog',
		title: 'Wiki Preview' ,
		uri:  portletURL.toString()
		});
});

$("#select-wikinode").change(function(){
	$("#select-wikipage").empty();
	window.<portlet:namespace />pageData.setHTML('');
	var data=$(".select-wikinode").val();
	if(data==null||data=='-Select-'){
		alert("There is NO page please Add new page");
		return;
	}
	
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
	if(selectpage==null||selectpage=='-Select-'){
		alert("There is NO page please Add new page");
		return;
	}
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

<%--
Single function can close all type of popup window but I need different work on window close so
for this purpose I will have to made two close method
 --%>
<aui:script> 
Liferay.provide(window,'<portlet:namespace/>closeYourPopUp', function(data, dialogId) 
		{ 
	var A = AUI(); 
	var dialog = Liferay.Util.Window.getById(dialogId); 
	dialog.destroy();
	location.reload();
	}, 
	['liferay-util-window'] 
	); 
</aui:script>

<aui:script> 
Liferay.provide(window,'<portlet:namespace/>closeYourPopUp_wikipage', function(data, dialogId) 
		{ 
	var A = AUI(); 
	var dialog = Liferay.Util.Window.getById(dialogId); 
	dialog.destroy();
	//Start
	$("#select-wikipage").empty();
	window.<portlet:namespace />pageData.setHTML('');
	var data=$(".select-wikinode").val();
	if(data==null||data=='-Select-'){
		alert("There is NO page please Add new page");
		return;
	}
	
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
	//end
	}, 
	['liferay-util-window'] 
	); 
</aui:script>
