<html>
<title>User Registration</title>
<body align="center">
<pre>
<h1><b>User Registration</b></h1>
<form action="create" method="post">
Full name:<input type="text" name="name"/>
E-mail:<input type="email" name="email"/>
Password:<input type="password" name="password"/>
Birthday(yyyy-mm-dd):<input type="date" name="date"/>
Gender:<input type="radio" name="gender" value="male">Male</input><input type="radio" name="gender" value="female">Female</input>
Profession:<select name="profession">
<option value="developer">Developer</option>
<option value="teamlead">Team Lead</option>
<option value="manager">Manager</option>
</select>
Married?<input type="radio" name="married" value="married"/>
Note:<textarea rows="5" cols="10"></textarea>
<input type="submit" value="Register"/>
</form>
</pre>
</body>
</html>