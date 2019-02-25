<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Registration</title>
<script type="text/javascript">
function validate() {
	
	var uId=document.user.uId.value.trim();
	var uName=document.user.uName.value.trim();
	var uemail=document.user.uemail.value.trim();
	var uContact=document.user.uId.uContact.trim();
	var uPwd=document.user.uPwd.value.trim();
	var uPwd1=document.user.uPwd1.value.trim();
	var uAddress=document.user.uAddress.value.trim();
	
	if(uId=="" || uId==null){
		alert("Id must be required");
		return false;
	}
	if(uName=="" || uName==null){
		alert("Name must be required");
		return false;
	}
	if(uemail=="" || uemail==null){
		alert("Email must be required");
		return false;
	}
	if(uContact=="" || uContact==null){
		alert("Mobile number must be required");
		return false;
	}
	else if(uContact<10){
		alert("mobile number should be 10-digit !!  not less than 10 digit");
		return false;
	}
	else if(uContact>10){
		alert("mobile number should be 10-digit !!  not greter than 10 digit");
		return false;
	}
	if(uPwd=="" || uPwd==null){
		alert("password must be required");
		return false;
	}
	if(uPwd1=="" || uPwd1==null){
		alert("Re-Enter password must be required");
		return false;
	}
	else if(uPwd!=uPwd1){
		alert("password should be match");
		return false;
	}
	if(uAddress=="" || uAddress==null){
		alert("Addrss must be required");
		return false;
	}
	
}

</script>
</head>
<body style="background-color: maroon; color: gray;">
	<%@ include file="Master.jsp"%>
	<h1 align="center" style="background-color: captiontext; color: blue;">
		<marquee behavior="alternate">User Registeration</marquee>
	</h1>
	<center>
		<form name="user" action="saveUser" method="post" onsubmit="return validate()">
			<table border="2" cellpadding="2" cellspacing="2">
				<tr>
					<td>**ID**</td>
					<td><input type="text" name="uId"></td>
				</tr>

				<tr>
					<td>**Name**</td>
					<td><input type="text" name="uName"></td>
				</tr>

				<tr>
					<td>**Email**</td>
					<td><input type="email" name="uemail"></td>
				</tr>

				<tr>
					<td>**Mobile**</td>
					<td><input type="number" name="uContact"></td>
				</tr>

				<tr>
					<td>**password**</td>
					<td><input type="password" name="uPwd"></td>
				</tr>

				<tr>
					<td>**Re-Enter password**</td>
					<td><input type="password" name="uPwd1"></td>
				</tr>

				<tr>
					<td>**Address**</td>
					<td><textarea rows="6" cols="10" name="uAddress"></textarea></td>
				</tr>

				<tr>
					<td><input type="reset" value="cleare"></td>
					<td><input type="submit" value="register"></td>
				</tr>
			</table>
			<h1 align="center" style="background-color: yellow; color: red;">
				${msg}</h1>
		</form>
	</center>
</body>
</html>