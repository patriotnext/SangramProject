<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Item Data</title>
<style>
table tr th {
	color: white;
	background-color: black;
}
</style>
</head>
<body>
<%@include file="Master.jsp" %>
	<h1 align="center" style="color: white; background-color: black;">
		<marquee behavior="scroll">Welcome to Item Data</marquee>
	</h1>
	<hr>
	<a href="itmExcel">Excel Esport</a> | <a href="itmPdf">Pdf Export</a>
	<table align="center" border="1">
		<tr>
			<th>**Id**</th>
			<th>**Code**</th>
			<th>**Name**</th>
			<th>**Cost**</th>
			<th>**Barcode**</th>
			<th>**Discount**</th>
			<th>**MFD**</th>
			<th colspan="2">**OPERATION**</th>
		</tr>
		<c:forEach items="${list}" var="itm">
			<tr>
				<td><c:out value="${itm.itmId}"></c:out></td>
				<td><c:out value="${itm.itmCode}"></c:out></td>
				<td><c:out value="${itm.itmName}"></c:out></td>
				<td><c:out value="${itm.itmCost}"></c:out></td>
				<td><c:out value="${itm.barcode}"></c:out></td>
				<td><c:out value="${itm.discount}"></c:out></td>
				<td><c:out value="${itm.mfd}"></c:out></td>

				<td><a href="deleteitm?itmId=${itm.itmId}"><img
						src="../images/delete1.jpg" width="30" height="30"></a></td>
				<td><a href="edititm?itmId=${itm.itmId}"><img
						src="../images/edit.jpg" width="30" height="30"></a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>