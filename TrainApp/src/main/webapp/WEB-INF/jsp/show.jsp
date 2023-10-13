<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Details</title>
</head>
<body style="background-color: Lavender" />
<center>
	<form action="src" method="post" />
	<h1>Search your Train here</h1>
	Source<select name="source">
		<option>Enter Source Station</option>
		<option value="Visakhapatnam">Visakhapatnam</option>
		<option value="Khammam">Khammam</option>
	</select><br><br>
	Destination <select name="destination">
		<option>Enter Destination Station</option>
		<option value="Khammam">Khammam</option>
		<option value="Visakhapatnam">Visakhapatnam</option>
	</select><br><br>
	<input type="submit" value="search">
	</pre>
	</form>
</center>
</body>
</html>