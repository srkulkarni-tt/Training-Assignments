<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dictionary</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<style>
	.button{
		width: 25%;
	}
	
	.main-block{
		display: flex;
		flex-direction: column;
		justify-content: center;
	}
	
	.b1{
		background-color: red;
	}
	
	.b2{
		background-color: yellow;
	}
</style>

</head>
<body>
	<div class="row">
		<div class="col-lg-6 b1">
			<h2>Find the meaning of words by searching for them</h2>	
			<div style="width: 25vw;">
				<form action="MainControllerServlet" method="post">
					<input type="text" name="searchedWord" placeholder="Search word...">
					<input class="button" type="submit" value="Search">
				</form>
				<div>
					<%=request.getAttribute("word")%>
				</div>
			</div>
		</div>
		
		<div class="col-lg-6 b2">
			<h2>Add your word if it doesn't exist in the dictionary</h2>
			<form action="MainControllerServlet" method="get">
				<input type="text" name="addedWord" placeholder="Enter word...">
				<input type="text" name="addedMeaning" placeholder="Enter meaning...">
				<input class="button" type="submit" value="Add">
			</form>
			<div>
				<%=request.getAttribute("message")%>
			</div>	
		</div>
	</div>
	
	<br />
				
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>