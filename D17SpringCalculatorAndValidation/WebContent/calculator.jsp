<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calculator</title>
</head>
<body>
	<form action="calculate">
		<select name="operation">
			<option value="add">+</option>
			<option value="sub">-</option>
			<option value="mul">*</option>
			<option value="div">/</option>
		</select>
		
		<input type="text" name="firstNum">
		<input type="text" name="secondNum">
		<input type="submit" value="Calculate">
	</form>
	<%= request.getAttribute("ans") %>
</body>
</html>