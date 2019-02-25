<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CustomerEDRData</title>
</head>
<body>
<h1 align="center"> Welcome to CustomerEDR Data</h1>
<%@ include file="Master.jsp" %>
<hr>

<table align="center" border="1">
<tr>
<th>**ID**</th>
<th>**NAME**</th>
<th>**EMAIL**</th>
<th>**TYPE**</th>
<th>**ADDRESS**</th>
<th>**PASSWORD**</th>
<th>**TOCKEN**</th>
</tr>
<c:forEach items="{}" var="ced">


</c:forEach>
</table>

</body>
</html>