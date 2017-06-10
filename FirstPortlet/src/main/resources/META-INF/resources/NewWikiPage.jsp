<%@ include file="/init.jsp" %>
<%--<%=request.getParameter("NodeId")%> --%>
<liferay-ui:success key="success" message="Record Updated successfully!"/>

<portlet:actionURL var="addURL" name="newWikiPage">
<portlet:param name="NodeID" value="<%=request.getParameter("NodeId")%>"/>
<portlet:param name="mvcPath" value="/NewWikiPage.jsp" />
</portlet:actionURL>
<div class="container" style="margin-left:20px;margin-right:20px;">
<div class="row">
<br/>

<div class="col-md-12">
<aui:form action="${addURL}" method="post" name="name">
<aui:input name="PageName"  label="Enter New WikiPage"  placeholder="Wiki Page Name">
<aui:validator name="required" errorMessage="Please enter Instruction"></aui:validator>
</aui:input>
<aui:input name="PageDescription" type="textarea"  label="Enter Description"  placeholder="Wiki Page Discription">
<%--<aui:validator name="required" errorMessage="Please enter Instruction"></aui:validator> --%>
</aui:input>
<aui:button name="name" type="submit" value="Add New Wiki" />
</aui:form>
</div>
</div>
</div>