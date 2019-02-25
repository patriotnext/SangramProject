<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LocationDataEdit</title>
</head>
<body>
<%@include file="Master.jsp" %>
<center>
	<h1>Welcome To DataEdit Page</h1>
	<form action="updateLoc" method="post">
		<table>
			<tr>
				<td>Location Id</td>
				<td><input type="text" name="locId" value="${loc.locId}"
					readonly="readonly"></td>
			</tr>
			<tr>
				<td>Location Code</td>
				<td><input type="text" name="locCode" value="${loc.locCode}"></td>
			</tr>
			<tr>
				<td>Location Name</td>
				<td><input type="text" name="locName" value="${loc.locName}"></td>
			</tr>
			<tr>
				<td><c:choose>
						<c:when test="${loc.locType eq urban }">
							<input type="radio" name="locType" value="urban"
								checked="checked">Urban<br>
							<input type="radio" name="locType" value="rural">Rural<br>
						</c:when>
						<c:otherwise>
							<input type="radio" name="locType" value="urban">urban<br>
							<input type="radio" name="locType" value="rural"
								checked="checked">Rural<br>
						</c:otherwise>
					</c:choose></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Insert"></td>
			</tr>
		</table>
	</form>
	</center>
</body>
</html>