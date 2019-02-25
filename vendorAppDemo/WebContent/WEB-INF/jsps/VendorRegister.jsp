<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Vender Register</title>
</head>
<style>
.fontStyle{
font-weight:bold;

}
</style>

<body background="../images/2.jpg">
<%@include file="Master.jsp" %>
	<h1 align="center" style="color:cyan" ><marquee behavior="scroll">Welcome to Vendor Register</marquee></h1>
	<form action="saveVen" method="post" enctype="multipart/form-data">
		<table align="center">
			<tr>
				<td class="fontStyle">Vendor Id:</td>
				<td><input type="text" name="venId"
					placeholder="Enter Vender Id" required></td>
			</tr>
			<tr>
				<td class="fontStyle">Vendor Name:</td>
				<td><input type="text" name="venName"
					placeholder="Enter Vender Name" required></td>
			</tr>
			<tr>
				<td class="fontStyle">Vendor Code:</td>
				<td><input type="text" name="venCode"
					placeholder="Enter Vender Code" required></td>
			</tr>
			<tr>
				<td class="fontStyle">Vendor Type:</td>
				<td><select name="venType">
						<option>**select**</option>
						<option value="regular">Regular</option>
						<option value="contract">Contract</option>
				</select></td>
			<tr>
				<td class="fontStyle">Email:</td>
				<td><input type="text" name="venEmail"
					placeholder="Enter your email" required></td>
			</tr>
			<tr>
				<td class="fontStyle">Mobile:</td>
				<td><input type="text" name="venContact"
					placeholder="Enter your mobile number" required></td>
			</tr>
			<tr>
				<td class="fontStyle">Enter Address:</td>
				<td><textarea rows="5" cols="30" name="venAddr">
</textarea></td>
			</tr>
			<tr><td>Select:</td>
			<td><input type="file" name="fobj"></td>
			</tr>
			<tr>
				<td><input type="reset" value="clear"></td>
				<td><input type="submit" value="Register"></td>
			</tr>
			<tr>
			<td></td>
			<td><a href="getAllVendor">AllRecord</a>
			</td>
			</tr>
			
		</table>
		
	</form>
	
<h1 align="center" style="color: red;">${msg}</h1>
</body>
</html>