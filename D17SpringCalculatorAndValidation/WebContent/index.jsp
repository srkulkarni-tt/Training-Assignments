<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Landing Page</title>
</head>
<body>
<form action="handle">
	<input type="text" name="yourname">
	<input type="submit" value="Submit">
</form>

<form action="login" method="post">
	<input type="text" name="username">
	<input type="password" name="password">
	<input type="submit" value="Submit">
</form>
<%= request.getAttribute("errorMsg")%>
</body>
</html>