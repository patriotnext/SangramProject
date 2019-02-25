<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Register</title>
</head>
<body>
<%@include file="Master.jsp" %>
	<h1>Welcome to Customer Registration page</h1>
	<form action="savecus" method="post">
		<table align="center" border="1">
			<tr>
				<td>Customer Id</td>
				<td><input type="text" name="cusId"></td>
			</tr>
			<tr>
				<td>Customer Code</td>
				<td><input type="text" name="cusCode"></td>
			</tr>
			<tr>
				<td>Customer Name</td>
				<td><input type="text" name="cusName"></td>
			</tr>
			<tr>
				<td>Contract Time</td>
				<td><input type="text" name="cntTime"></td>
			</tr>
			<tr>
				<td>Percent</td>
				<td><input type="text" name="percent"></td>
			</tr>
			<tr>
				<td>Customer Mode</td>
				<td><input type="radio" name="cusMode" value="enable">Enable<br>
					<input type="radio" name="cusMode" value="desable">Desable</td>
			</tr>
			<tr>
				<td>Customer Email</td>
				<td><input type="text" name="cusMail"></td>
			</tr>
			<tr>
				<td>Customer Type</td>
				<td><select name="cusType">
						<option>**select**</option>
						<option value="consumer">Consumer</option>
						<option value="producer">Producer</option>
				</select></td>
			</tr>
			<tr>
				<td>Customer Address</td>
				<td><textarea rows="5" cols="30" name="custAddr"></textarea></td>
			</tr>
			<tr>
				<td>Description</td>
				<td><textarea rows="5" cols="30" name="cusDesc"></textarea></td>
			</tr>
			<tr>
				<td><input type="reset" value="clear"></td>
				<td><input type="submit" value="Register"></td>
				</tr>
				<tr><td colspan="2"><a href="getAllCus">view All Record</a></td>
		</table>
		
	</form>
	<h1 align="center" style="color: red;">${msg}</h1>
</body>
</html>