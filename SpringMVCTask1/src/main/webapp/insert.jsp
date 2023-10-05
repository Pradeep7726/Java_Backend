<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert Page</title>
</head>
<body>
 <form action="insert" method="post"> 
<input type="text" name="Medicine" placeholder="Medicine" />
<input type="date" name="ExpiryDate" placeholder="ExpiryDate" />
<input type="number" name="Cost" placeholder="Cost" />
<input type="number" name="Quantity" placeholder="Quantity" />
<input type="number" name="Codeno" placeholder="Codeno" />
<input type="submit" value="insert"/><br/>
<input type="reset" value="reset"/><br/>
</form>
</body>
</html>
