<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Vendor Data</title>
<style>
table tr th {
	color: white;
	background-color: black;
}
</style>
</head>
<body background="../images/2.jpg">
<%@include file="Master.jsp" %>
	<h1 align="center" style="color: purple; background-color: green;">
		<marquee behavior="scroll">Welcome To LocationData</marquee>
	</h1><hr>
	<a href="vanExcel">Excel Export</a> | <a href="vanPdf">Pdf Export</a>
		<table align="center" border="1">
			<tr>
				<th>**ID**</th>
				<th>**Name**</th>
				<th>**Code**</th>
				<th>**Type**</th>
				<th>**Email**</th>
				<th>**Mobile**</th>
				<th>**Address</th>
				<th colspan="2">**OPERATION**</th>
			</tr>
			<c:forEach items="${list}" var="van">
				<tr>
					<td><c:out value="${van.venId}" /></td>
					<td><c:out value="${van.venName}" /></td>
					<td><c:out value="${van.venCode}" /></td>
					<td><c:out value="${van.venType}" /></td>
					<td><c:out value="${van.venEmail}" /></td>
					<td><c:out value="${van.venContact}" /></td>
					<td><c:out value="${van.venAddr}" /></td>
					<td><a href="deleteVan?venId=${van.venId}"><img
							src="../images/delete4.jpg" width="30" height="30"></a></td>
					<td><a href="editVan?venId=${van.venId}"><img
							src="../images/edit.jpg" width="30" height="30"></a></td>
				</tr>
			</c:forEach>
			</table>
</body>
</html>