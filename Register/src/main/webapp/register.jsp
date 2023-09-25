<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"></script>
<title>Register</title>
</head>
<style>

	body {
		background-color:lightgrey;
	}
	
	.container {
		display:flex;
		justify-content:center;
		align-items:center;
		height:100vh;
	}
	
	.content {
		display:block;
		line-height:20px;
		gap-column:20px;
	}
</style>
<body>
	<div class="container">
		<div class="content">
			 <form action="Servlet" method="get">
			 	<h2 class="w-100"> Registration form</h2>
		        Username: <input type="text" name="text" class="form-control" required><br>
		        Password: <input type="password" name="password" class="form-control" required><br>
		        <input type="submit" value="Register" class="form-control bg-dark text-light">
   			 </form>
		</div>
	</div>
</body>
</html>