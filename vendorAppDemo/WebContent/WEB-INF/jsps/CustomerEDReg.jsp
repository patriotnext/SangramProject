<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CutomerED Registration</title>
</head>
<body>
<%@ include file="Master.jsp" %>
	<h1 align="center">CustomerED Registraton</h1>
	<form action="saveCusED" method="post">
		<table align="center">
			<tr>
				<td>Customer Id:</td>
				<td><input type="text" name="cId"></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><input type="text" name="cEmail"></td>
			</tr>
			<tr>
				<td>Type:</td>
				<td><input type="radio" name="cType" value="producer">producer
					<input type="radio" name="cType" value="consumer">consumer</td>
			</tr>
			<tr>
				<td>Address:</td>
				<td><textarea rows="5" cols="30" name="cAddr"></textarea></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="text" name="password"></td>
			</tr>
			<tr>
				<td>Tocken:</td>
				<td><input type="text" name="accTock"></td>
			</tr>
			<tr>
				<td><input type="reset" value="clear"></td>
				<td><input type="submit" value="registr"></td>
			</tr>
		</table>
		${msg}
	</form>
</body>
</html>