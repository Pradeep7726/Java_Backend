<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body  style="background-color: DimGrey" />
<center>

<h1>Enter User Credentials</h1>
<img src="https://png.pngtree.com/png-vector/20191110/ourmid/pngtree-avatar-icon-profile-icon-member-login-vector-isolated-png-image_1978396.jpg" /><br><br>
<form action="LoginValid" method="post">
<input type="text" name="Username" required="true" placeholder="Username" /><br />  
<input type="password" name="Password" required="true"  placeholder="Password" /><br /><br>
<input type="submit" value="Login"/>
</form>
</center>
</body>
</html>