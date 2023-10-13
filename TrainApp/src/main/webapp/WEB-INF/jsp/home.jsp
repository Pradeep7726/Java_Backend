<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<body style="background-color: LightGray" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Enquiry</title>
</head>

<body>
	<center>
		<form action="traindetails" method="post">
			Ticket Booking <a href="https://www.irctc.co.in/nget/train-search"
				target="_blank">IRCTC</a><br>
			<br>
			<br> Enter Train No <input type="number" name="trainno"
				required="true"> <input type="submit" value="search">
		</form>
		<br>
		<form action="details" method="post">
			<input type="submit" value="Find Trains">
		</form>
		<br>
		<form action="out">
			<input type="submit" value="Logout">
		</form>
	</center>
</body>
</html>