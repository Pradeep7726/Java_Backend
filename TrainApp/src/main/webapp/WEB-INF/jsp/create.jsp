<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>
</head>
<center>
<h1>Registration Form</h1>
	<body style="background-color: LightGray" />
	<form action="Acc" method="post">
		<input type="text" name="Username" required="true" placeholder="Username" /><br /> 
		<input type="password" name="Password" required="true" placeholder="Password" /><br /> 
		<input type="Email" name="Email" required="true" placeholder="E-mail" /><br /><br>
		<input type="submit" value="Submit" /><br />

	</form>
</center>
</body>
</html>