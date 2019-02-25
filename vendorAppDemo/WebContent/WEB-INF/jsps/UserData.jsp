<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Data</title>
</head>
<body style="background-color: yellow; color: green;">
	<h1 align="center" style="background-color: white; color: black;">User
		Data</h1>
	<table border="1">
		<tr>
			<th>**ID**</th>
			<th>**NAME**</th>
			<th>**EMAIL**</th>
			<th>**MOBILE**</th>
			<th>**PASSWORD**</th>
			<th>**ADDRESS**</th>
			<th colspan="2">OPERATION</th>
		</tr>
		<c:forEach items="{list}" var="user">
			<tr>
				<td><c:out value="${user.uId}"></c:out></td>
				<td><c:out value="${user.uName}"></c:out></td>
				<td><c:out value="${user.uemail}"></c:out></td>
				<td><c:out value="${user.uContact}"></c:out></td>
				<td><c:out value="${user.uPwd}"></c:out></td>
				<td><c:out value="${user.uAddress}"></c:out></td>
				<td><a href="deleteUser?uId=${user.uId}"><img
						src="../images/delete1.jpg" width="30" height="30"></a></td>
				<td><a href="editUser?uId=${user.uId}"><img
						src="../images/edit.jpg" width="30" height="30"></a></td>

			</tr>
		</c:forEach>
	</table>
</body>
</html>