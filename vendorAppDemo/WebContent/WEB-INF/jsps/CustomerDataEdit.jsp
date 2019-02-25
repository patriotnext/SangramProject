<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Data Edit</title>
</head>
<body>
<%@include file="Master.jsp" %>
<h1>Customer Data Edit</h1>
<form action="updatecus" method="post">
<table align="center" border="1">

<tr>
				<td>Customer Id</td>
				<td><input type="text" name="cusId" value="cusId" readonly="readonly"></td>
			</tr>
			<tr>
				<td>Customer Code</td>
				<td><input type="text" name="cusCode" value="cusCode"></td>
			</tr>
			<tr>
				<td>Customer Name</td>
				<td><input type="text" name="cusName" value="cusName"></td>
			</tr>
			<tr>
				<td>Contract Time</td>
				<td><input type="text" name="cntTime" value="cntTime"></td>
			</tr>
			<tr>
				<td>Percent</td>
				<td><input type="text" name="percent" value="percent"></td>
			</tr>
			<tr>
				<td>Customer Mode</td>
				
				<td>
			<c:choose>
			<c:when test="${cus.cusType eq 'enable'}">
			<input type="radio" name="cusMode" id="cusMode" value="enable" checked="checked/">enable&nbsp;
					<input type="radio" name="cusMode" id="cusMode" value="desable"/>Desable
			
			</c:when>
			<c:otherwise>
				<input type="radio" name="cusMode" id="cusMode" value="enable"/>enable&nbsp;
					<input type="radio" name="cusMode" id="cusMode" value="desable" checked="checked"/>Desable
					</c:otherwise>
					</c:choose>
					</td>
			
			
			</tr>
			<tr>
				<td>Customer Email</td>
				<td><input type="text" name="cusMail" value="cusMail"></td>
			</tr>
			<tr>
				<td>Customer Type</td>
				<td>
				
				<select name="cusType">
				<c:choose>
				<c:when test="${cus.cusType eq 'consumer'}">
						<option value="consumer" selected="selected">Consumer</option>
						<option value="producer">Producer</option>
				</c:when>
				<c:otherwise>
				<option value="consumer">Consumer</option>
						<option value="producer" selected="selected">Producer</option>
				</c:otherwise>
				</c:choose>
				</select>
				
				</td>
			</tr>
			<tr>
				<td>Customer Address</td>
				<td><textarea rows="5" cols="30" name="custAddr">
				${cus.custAddr}
				</textarea></td>
			</tr>
			<tr>
				<td>Description</td>
				<td><textarea rows="5" cols="30" name="cusDesc">
				${cus.cusDesc}
				</textarea></td>
			</tr>
<tr>
<td colspan="2" align="center"><input type="submit" value="Insert"></td>
</tr>
</table>
</form>
</body>
</html>