<%@page import="java.util.List"%>
<%@page import="com.daffo.wiki_node_tableservice.service.wiki_pagedata_tableLocalServiceUtil"%>
<%@page import="com.daffo.wiki_node_tableservice.model.wiki_pagedata_table"%>
<%@page import="com.daffo.wiki_node_tableservice.service.wiki_page_tableLocalServiceUtil"%>
<%@page import="com.daffo.wiki_node_tableservice.model.wiki_page_table"%>
<%@page import="com.daffo.wiki_node_tableservice.model.wiki_node_table"%>
<%@page import="com.daffo.wiki_node_tableservice.service.wiki_node_tableLocalServiceUtil"%>
<%@ include file="/init.jsp" %>
<%
List<wiki_node_table> wnt=wiki_node_tableLocalServiceUtil.getwiki_node_tables(0, wiki_node_tableLocalServiceUtil.getwiki_node_tablesCount());
List<wiki_page_table> wpt=wiki_page_tableLocalServiceUtil.getwiki_page_tables(0, wiki_page_tableLocalServiceUtil.getwiki_page_tablesCount());
List<wiki_pagedata_table>wdt=wiki_pagedata_tableLocalServiceUtil.getwiki_pagedata_tables(0, wiki_pagedata_tableLocalServiceUtil.getwiki_pagedata_tablesCount());
%>
<style>
 .incr {
    font-size: 20px;
}
.incrli {
    font-size: 16px;
}
 .list-display{
 list-style:none;
 }
 .inner-page{
 cursor:pointer;
 }
</style>
<div class="container-fluid-1280">
<div class="row">
<div class="col-md-3">
<table>
<tbody>
<tr>
<td style="text-align:center"><img src="<%=request.getContextPath()%>/images/Wikipedia_Logo_1.0.png" width="150" height="150"/></td>
</tr>
<tr>
<td>
<ul class="list-display">
<%
for(wiki_node_table wn:wnt){
	%>
	<li class="outer-node"  data-nodeid="<%=wn.getNodeID()%>"><span class="glyphicon glyphicon-folder-open incr"> <%=wn.getNodeName()%></span></li>
		<ul class="list-display">
	<%
	for(wiki_page_table wp:wpt){
		if(wp.getNodeID()==wn.getNodeID()){
		%>
		<li class="inner-page" data-node_page_id="<%=wn.getNodeID()%>" data-pageid="<%=wp.getPageID()%>" > <span class="glyphicon glyphicon-file incrli"><%=wp.getPageName()%></span></li>
		<%	
		}
	}
	%>
	</ul>
	<%
}
%>
</ul>
</td>
</tr>
</tbody>
</table>
</div>
<div class="col-md-9">
<div style="background-color:#8EB7FD; height:38px;"><h1 style="margin-left:5px">Wiki Page - <span  id="wiki-id"></span></h1></div>
<div style="margin-left:3px;border:1px solid black;"><div id="data-show"></div></div>
</div>
</div>
</div>
<portlet:resourceURL var="select_wikiPageData" id="select_wikiPageData">
</portlet:resourceURL>
<script>
$('.outer-node').click(function(){
	   var data_nodeid = $(this).attr('data-nodeid');
	   alert(data_nodeid);
	});
$('.inner-page').click(function(){
	   var data_pageid = $(this).attr('data-pageid');
	   var data_node_pageid = $(this).attr('data-node_page_id');
	 //Ajax
		AUI().use('aui-base','aui-io-request', function(A){
			//aui ajax call to get updated content
			A.io.request('<%=select_wikiPageData%>',{
	  		dataType: 'json',
	  		method: 'GET',
	  		data: { '<portlet:namespace />data-pageid':data_pageid,'<portlet:namespace />data-node_page_id':data_node_pageid},
	  		on: {
	   			 success: function() {
	   				var data=this.get('responseData');
	   				A.Array.each(data, function(obj, idx){
	   				$("#wiki-id")[0].innerHTML=obj.pagename;
	   				$("#data-show")[0].innerHTML=obj.Pagedata;
	   				//alert(obj.version+" "+obj.Pagedata);
	   				});
	    		}
	  		}
			});
			});
		//Ajax End
	});
</script>
