<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Anata no namae wa <%=request.getAttribute("name") %> desu</title>
</head>
<body>
	<h1>Inside yourname.jsp</h1>
	<h1><%=request.getAttribute("name") %></h1>
	
	<h2>POST method handled</h2>
	<h3><%= request.getAttribute("username") %></h3>
	<h3><%= request.getAttribute("password") %></h3>
</body>
</html>