<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="Master.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Document page</title>
</head>
<body style="background-color: black; color: white;">
<%-- 	<%@include file="Master.jsp"%> --%>
	<h1 align="center">
		<marquee behavior="scroll">Upload Document</marquee>
	</h1>
	<form action="uploadDoc" method="post" enctype="multipart/form-data">
		<table align="center">
			<tr>
				<td>Id</td>
				<td><input type="text" name="fId"></td>
			</tr>
			<tr>
				<td>Doc</td>
				<td><input type="file" name="fObj"></td>
			</tr>
			<tr>
				<td></td><td><input type="submit" value="upload"></td>
		</table><hr style="color: red;">
	</form>
	<table align="center" border="1">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Link</th>
			<th>Delete</th>
		</tr>
		<c:forEach items="${list}" var="ob">
			<tr>
				<td><c:out value="${ob[0]}" /></td>
				<td><c:out value="${ob[1]}" /></td>
				<td><a href="downloadDoc?docId=${ob[0]}">Download</a></td>
				<td><a href="delectLoc?locId=${ob[0]}"><img src="../images/delete4.jpg" width="30" height="30"></a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>