<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dashboard</title>
</head>
<body>
	<h3>Olá <%=((br.ucsal.neutron.user.User)session.getAttribute("usuario")).getUsername() %>, você está logado no Dashboard!</h3>
</body>
</html>