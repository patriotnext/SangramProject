<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<%--  <%@include file="Master.jsp" %> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Location Register</title>
</head>
<body background="2.jpg">
<%@include file="Master.jsp" %>
<center>
<div style="background-color: silver; color: red;"><marquee behavior="scroll"><h2>Location Register</h2></marquee></div></center><hr>

	<form action="saveLoc" method="post">
		<table border="1" align="center">
			<tr>
				<td>Location Id</td>
				<td><input type="text" name="locId" placeholder="location id" required></td>
			</tr>
			<tr>
				<td>Location Code</td>
				<td><input type="text" name="locCode" placeholder="Location code" required></td>
			</tr>
			<tr>
				<td>Location Name</td>
				<td><input type="text" name="locName" placeholder="location name" required></td>
			</tr>
			<tr>
				<td>Location Type</td>
				<td><input type="radio" name="locType" value="rural">Rural<br>
					<input type="radio" name="locType" value="urban"> Urban</td>
			</tr>
			<tr>
				<td><input type="submit" value="clear"></td>
				<td><input type="submit" value="Insert"></td>
				</tr>
				<tr>
				<td><a href="getLoc">view your record</a></td>
				<td><a href="getAllLoc">View All Record</a>
		</table>
	</form>
	${msg}
</body>
</html>