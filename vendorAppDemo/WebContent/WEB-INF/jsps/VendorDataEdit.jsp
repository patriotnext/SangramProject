<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
.fontStyle {
	font-weight: bold;
}
</style>

<body background="../images/2.jpg">
<%@include file="Master.jsp" %>
	<h1 align="center " style="color: cyan">
		<marquee behavior="scroll">Welcome to Vendor Data Edit</marquee>
	</h1>
	<form action="updatVen" method="post">
		<table align="center">
			<tr>
				<td class="fontStyle">Vendor Id:</td>
				<td><input type="text" name="venId" value="${van.venId}"
					readonly="readonly"></td>
			</tr>
			<tr>
				<td class="fontStyle">Vendor Name:</td>
				<td><input type="text" name="venName" value="${van.venName}"></td>
			</tr>
			<tr>
				<td class="fontStyle">Vendor Code:</td>
				<td><input type="text" name="venCode" value="${van.venCode}"></td>
			</tr>
			<tr>
				<td class="fontStyle">Vendor Type:</td>

				<td>
				  <select name="vanType">
				  <c:choose>
						<c:when test="${van.venType eq 'regular'}">
							<option value="regular" selected="selected">Regular</option>
							<option value="contract">Contract</option>
						</c:when>
						<c:otherwise>
							<option value="regular">Regular</option>
							<option value="contract" selected="selected">Contract</option>
						</c:otherwise>
					</c:choose>
				</select>
				</td>
			<tr>
				<td class="fontStyle">Email:</td>
				<td><input type="text" name="venEmail" value="${van.venEmail}"></td>
			</tr>
			<tr>
				<td class="fontStyle">Mobile:</td>
				<td><input type="text" name="venContact"
					value="${van.venContact}"></td>
			</tr>
			<tr>
				<td class="fontStyle">Enter Address:</td>
				<td><textarea rows="5" cols="30" name="venAddr">
						${van.venAddr }
</textarea></td>
			</tr><tr>
			<td></td>
			<td><input type="submit" value="Insert"></td>
			</tr>
</body>
</html>