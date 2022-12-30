<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>User Details</h1>

	<form action="User" method="post">
		ID:<input type="text" name="userId" /><br> Age:<input
			type="text" name="age" /><br> Name:<input type="text"
			name="name" /><br> Gender:<input type="text" name="gender" /><br>
		Number:<input type="number" name="number" /><br> Password:<input
			type="password" name="password" /><br> Email:<input type="text"
			name="email" /><br> City:<input type="text" name="city" /><br>
		Country:<input type="text" name="country" /><br> <input
			type="hidden" name="shadi" value="user" /><br> <input
			type="submit" value="submit" />

	</form>
</body>
</html>