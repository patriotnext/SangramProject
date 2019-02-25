<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Data</title>
<style>
table tr th {
	color: white;
	background-color: black;
}
</style>
</head>
<body>
<%@include file="Master.jsp" %>
	<h1>Customer Data</h1>
	<hr>
	<a href="cusExcel">Excel Export</a> | <a href="cusPdf">Pdf Export</a>
	<table align="center" border="1">
		<tr>
			<th>**ID**</th>
			<th>**Code**</th>
			<th>**Name**</th>
			<th>**Contract Time**</th>
			<th>**Percent**</th>
			<th>**Mode**</th>
			<th>**Email**</th>
			<th>**Type**</th>
			<th>**Address**</th>
			<th>**Description**</th>
			<th colspan="2">**OPERATION**</th>
		</tr>
		<c:forEach items="${list}" var="cus">
			<tr>
				<td><c:out value="${cus.cusId}"></c:out></td>
				<td><c:out value="${cus.cusCode}"></c:out></td>
				<td><c:out value="${cus.cusName}"></c:out></td>
				<td><c:out value="${cus.cntTime}"></c:out></td>
				<td><c:out value="${cus.percent}"></c:out></td>
				<td><c:out value="${cus.cusMode}"></c:out></td>
				<td><c:out value="${cus.cusMail}"></c:out></td>
				<td><c:out value="${cus.cusType}"></c:out></td>
				<td><c:out value="${cus.custAddr}"></c:out></td>
				<td><c:out value="${cus.cusDesc}"></c:out></td>
				<td><a href="deletecus?cusId=${cus.cusId}"><img
						src="../images/delete1.jpg" width="30" height="30"></a></td>
				<td><a href="editcus?cusId=${cus.cusId}"><img
						src="../images/edit.jpg" width="30" height="30"></a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>