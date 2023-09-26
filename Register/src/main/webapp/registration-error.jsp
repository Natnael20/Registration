<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Error</title>
</head>
<style>
	.container {
		display:flex;
		justify-content:center;
		align-items:center;
		height:100vh;
	}
</style>
<body>
	<div class="container">
		<div class="center">
			 <h1>Registration Error</h1>
    		 	<p>${errorMessage}</p>
    		<	p><a href="register.jsp">Go back to registration</a></p>
		</div>
	</div>
</body>
</html>
