<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Item Register</title>
</head>
<body>
<%@include file="Master.jsp" %>
	<h1 align="center" style="color: white; background-color: black;">
		<marquee behavior="scroll"> Welcome to Item Register</marquee>
	</h1>

	<form action="saveItm" method="post">
		<table align="center" border="1">
			<tr>
				<td>Item Id</td>
				<td><input type="text" name="itmId"></td>
			</tr>
			<tr>
				<td>Item Code</td>
				<td><input type="text" name="itmCode"></td>
			</tr>
			<tr>
				<td>Item Name</td>
				<td><input type="text" name="itmName"></td>
			</tr>
			<tr>
				<td>Cost</td>
				<td><input type="text" name="itmCost"></td>
			</tr>
			<tr>
				<td>BarCode</td>
				<td><input type="text" name="barcode"></td>
			</tr>
			<tr>
				<td>Discount</td>
				<td><input type="text" name="discount"></td>
			</tr>
			<tr>
				<td>Manufactured</td>
				<td><input type="date" name="mfd"></td>
			</tr>
			<tr>
				<td><input type="reset" value="clear"></td>
				<td><input type="submit" value="Register"></td>
			</tr>
			<tr>
				<td colspan="2"><a href="getAllItm">view All Record</a></td>

			</tr>
		</table>
		<h1 align="center" style="color: white;background-color: black;">${msg}</h1>
	</form>
</body>
</html>