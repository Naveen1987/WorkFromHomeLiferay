<%@ include file="/init.jsp" %>
<portlet:actionURL var="addURL" name="newWikiNode">
<portlet:param name="mvcPath" value="/NewWikiNode.jsp" />
</portlet:actionURL>
<div class="container" style="margin-left:20px;margin-right:20px;">
<div class="row">
<br/>

<div class="col-md-12">
<div class="conatiner">
  <div class="row">
    <br/>
    <div class="col-md-12">
       <center>
         <table>
           <tr>
             <td>Enter Node Name<span style="color:red;font-size:25px">*</span></td>
             <td><input id="txt-node"  class="form-control"/><span id="txt-node-valid" style="display:none;color:red">Please Enter Node Name</span></td>
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
               <span class="btn btn-primary" id="btn-addNode"> Add node</span>
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

<portlet:resourceURL var="newWikiNode" id="newWikiNode">
</portlet:resourceURL>

<script>

$("#btn-addNode").click(function(){
 var txt_node=$("#txt-node").val();
 var txt_des=$("#txt-des").val();
  if(txt_node.length===0)
    {
    $("#txt-node-valid").show();   
      return;
    }

	//Ajax
	AUI().use('aui-base','aui-io-request', function(A){
		//aui ajax call to get updated content
		A.io.request('<%=newWikiNode%>',{
		dataType: 'json',
		method: 'GET',
		data: { 
			'<portlet:namespace />NodeName': txt_node,
			'<portlet:namespace />NodeDescription':txt_des },
		on: {
 			 success: function() {
 				var data=this.get('responseData');
 				A.Array.each(data, function(obj, idx){
 					alert(obj.msg);
 					if(obj.msg=="Sorry! You Node is exists")
 						{
 						return;
 						}
 					$("#txt-node").val('');
 					$("#txt-des").val('');
 					$("#txt-node-valid").hide();
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
	  Liferay.Util.getOpener().<portlet:namespace/>closeYourPopUp(data, '<portlet:namespace/>addNewWikiNodedialog');
}
</script>

