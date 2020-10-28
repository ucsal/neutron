<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<link rel="stylesheet" href="/css/login.css"> 
</head>
<body>

<div class="container" >

	<form class="form-signin" action="/login" method="post">

		<div class="text-center mb-4">
			<h1>NEUTRON</h1>
		</div>

	<div class="form-label-group">
  	  	<input type="text" name="username" class="form-control" id="username" placeholder="Username" required="required">
   	 	<label for="username">Username</label>

  	</div>

	<div class="form-label-group">
  	  	<input type="password" name="userpassword" class="form-control" id="userpassword" placeholder="Password" required="required">
     	<label for="username">Password</label>
  
  	</div>
  	<p class="text-danger">${ erro }</p>
	
	<button class="btn btn-primary" type="submit">Login</button>
	
	<a href="/user/cadastro.jsp">Criar uma conta</a>
	
	</form>
	<br>
	
</div>

</body>

</html>