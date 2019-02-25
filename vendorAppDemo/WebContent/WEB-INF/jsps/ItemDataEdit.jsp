<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Item Edit</title>
</head>
<body>
<%@include file="Master.jsp" %>
<form action="updateItm" method="post">
<h1 align="center" style="color: white; background-color: black;">
		<marquee behavior="scroll"> Welcome to Item Register</marquee>
	</h1>
		<table align="center" border="1">
			<tr>
				<td>Item Id</td>
				<td><input type="text" name="itmId" value="${itm.itmId}"></td>
			</tr>
			<tr>
				<td>Item Code</td>
				<td><input type="text" name="itmCode" value="${itm.itmCode}"></td>
			</tr>
			<tr>
				<td>Item Name</td>
				<td><input type="text" name="itmName" value="${itm.itmName}"></td>
			</tr>
			<tr>
				<td>Cost</td>
				<td><input type="text" name="itmCost" value="${itm.itmCost}"></td>
			</tr>
			<tr>
				<td>BarCode</td>
				<td><input type="text" name="barcode" value="${itm.barcode}"></td>
			</tr>
			<tr>
				<td>Discount</td>
				<td><input type="text" name="discount" value="${itm.discount}"></td>
			</tr>
			<tr>
				<td>Manufactured</td>
				<td><input type="text" name="mfd" value="${itm.mfd}"></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="Insert"></td>
			
			</tr>
</table>
</form>
</body>
</html>