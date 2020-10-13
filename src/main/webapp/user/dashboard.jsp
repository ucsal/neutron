<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dashboard</title>
</head>
<body>
	<h3>Olá ${ user.username }, você está logado no Dashboard!</h3>
	<br>
	<p>
		<a href="/user"><button>Listar usuarios</button></a> <br> 
		<a href="/user/logout"><button>Logout</button></a> <br> 
		<input type="button" value="Voltar" onClick="history.go(-1)">

	</p>
</body>
</html>