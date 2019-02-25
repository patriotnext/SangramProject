<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<title>Location Data</title>
<style type="text/css">
table tr th {
	color: white;
	background-color: black;
}
</style>
</head>


<c:set value="${requestScope.sData}" var="sdata"/>
<c:set value="${requestScope.iData}" var="idata"/>
${sdata[0]}
${sdata[1]}
${idata[0]}
${idata[1]}
${fn:length(sdata)}
<c:set value="${fn:length(sdata)}" var="lklklk"/>
${lklklk}
<c:set var="itype" value="${idata[0]} }"/>
<c:set var="sColor" value=""/>
<c:set var="sred" value=""/>
<c:set var="sButton" value=""/>
<c:if test="${idata[0]==11}">

${sdata[0]}

</c:if>

<c:choose>

<c:when test="${idata[0]==11}">
<c:set var="sColor" value="green"/>
</c:when>
<c:when test="${idata[0]==12}">
<c:set var="sred" value="red"/>
</c:when>
</c:choose>

<c:forEach var="x"  items="${requestScope.sData}">

<c:if test="${x==0}">

	<button style="background-color:${sColor}" > ${x}</button>
</c:if>
<c:if test="${x==1}">

	<button style="background-color:${sred}" > ${x}</button>
</c:if>


</c:forEach>






<body>
<%@include file="Master.jsp" %>
	<h1 align="center" style="color: purple; background-color: green;"><marquee behavior="scroll">Welcome To LocationData</marquee></h1>
	<center>
	<a href="locExcel">Excel Export</a> | <a href="locPdf">PDF Export</a>
		<table class="table table-striped table-dark border=1">
			<tr>
				<th>**ID**</th>
				<th>**CODE**</th>
				<th>**NAME**</th>
				<th>**TYPE**</th>
				<th colspan="2">**OPERATION**</th>
			</tr>
			<c:forEach items="${locs}" var="loc">
				<tr>
					<td><c:out value="${loc.locId}" /></td>
					<td><c:out value="${loc.locCode}" /></td>
					<td><c:out value="${loc.locName}" /></td>
					<td><c:out value="${loc.locType}" /></td>
					<td><a href="delectLoc?locId=${loc.locId}"><img src="../images/delete4.jpg" width="30" height="30"></a></td>
					<td><a href="editLoc?locId=${loc.locId}"><img src="../images/edit.jpg" width="30" height="30"></a></td>
				</tr>
			</c:forEach>
		</table>
	</center>
	
</body>
</html>