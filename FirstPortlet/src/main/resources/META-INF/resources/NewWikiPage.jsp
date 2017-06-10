<%@ include file="/init.jsp" %>
<%--<%=request.getParameter("NodeId")%> --%>

<div class="container" style="margin-left:20px;margin-right:20px;">
<div class="row">
<br/>

<div class="col-md-12">
<div class="conatiner">
  <div class="row">
    <br/>
    <div class="col-md-12">
       <center>
       <input type="hidden" id="nodeID" value="<%=request.getParameter("NodeId")%>"/>
         <table>
           <tr>
             <td>Enter Page Name<span style="color:red;font-size:25px">*</span></td>
             <td><input id="txt-page"  class="form-control"/><span id="txt-page-valid" style="display:none;color:red">Please Enter Page Name</span></td>
           </tr>
           <tr>
             <td><br/></td>
           </tr>
           <tr>
             <td>Enter Description</td>
             <td><textarea id="txt-des"  class="form-control" style="text-align:left"></textarea></td>
           </tr>
           <tr>
             <td><br/></td>
           </tr>
           <tr>
             <td colspan="2" style="text-align:right">
               <span class="btn btn-primary" id="btn-addpage"> Add Page</span>
             </td>
           </tr>
           
         </table>
      </center>
    </div>
  </div>
</div>
</div>
</div>
</div>

<portlet:resourceURL var="newWikipage" id="newWikipage">
</portlet:resourceURL>

<script>

$("#btn-addpage").click(function(){
 
	var NodeID=$("#nodeID").val();
	var txt_page=$("#txt-page").val();
 	var txt_des=$("#txt-des").val();
  if(txt_page.length===0)
    {
    $("#txt-page-valid").show();   
      return;
    }

	//Ajax
	AUI().use('aui-base','aui-io-request', function(A){
		//aui ajax call to get updated content
		A.io.request('<%=newWikipage%>',{
		dataType: 'json',
		method: 'GET',
		data: { 
			'<portlet:namespace />NodeID': NodeID,
			'<portlet:namespace />pageName': txt_page,
			'<portlet:namespace />pageDescription':txt_des },
		on: {
 			 success: function() {
 				var data=this.get('responseData');
 				A.Array.each(data, function(obj, idx){
 					alert(obj.msg);
 					if(obj.msg=="Sorry! You page is exists")
 						{
 						return;
 						}
 					$("#txt-page").val('');
 					$("#txt-des").val('');
 					$("#txt-page-valid").hide();
 					alert(obj.msg);
 					closeLiferayPopUP();
 				});
  		}
		}
		});
		});
	//Ajax End
 
});

//Close to window
function closeLiferayPopUP()
 {  
      var data = ''; 
      //Both line can close popup windows but after window close I need different task so that i have two method
      //Liferay.Util.getOpener().<portlet:namespace/>closeYourPopUp(data, '<portlet:namespace/>addNewWikiPagedialog');
	  Liferay.Util.getOpener().<portlet:namespace/>closeYourPopUp_wikipage(data, '<portlet:namespace/>addNewWikiPagedialog');
}
</script>

