<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>index page</title>
</head>
<body align="center">
<form action="insert" method="post">
<h2>
<caption>Cart</caption>
</h2>
<hr>
<table align="center" border=2>
<br>
<br>
<br>
<br>
<tr>
<td>ProductName</td>
<td>Price</td>
<td>Quantity</td>
<td>total</td>
</tr>
<tr>
<td><input type="text" name="ProductName" /></td>
<td><input type="number" name="Price" /></td>
<td><input type="number" name="Quantity" /></td>
<td><input type="number" name="Total" /></td>
</tr>
</table>
<br> <input type="submit" value="submit" />
<br><br>
Apply coupon <input type="number" name="coupon"/>
<input type="submit" value="apply here">
</form>
</body>
</html>