<%@page import="br.ucsal.neutron.user.model.User"%>
<%@page import="br.ucsal.neutron.user.dao.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Listar Usuarios</title>
</head>
<body>
	<table class="table table-striped">
		<thead>
			<tr>
				<th>ID</th>
				<th>USERNAME</th>
				<th></th>
			</tr>
		</thead>

		<tbody>
			<c:forEach var="u" items="${users}">
				<tr>
					<td>${u.id}</td>
					<td>${u.username}</td>
					<td><a href="/user/DeleteUserController?id=${ u.id }">Excluir</a>
						<a href="/user/UserListadoController?id=${ u.id }">Visualizar</a> <a
						href="/user/UpdateController?id=${ u.id }">Editar</a></td>
				</tr>
			</c:forEach>
		</tbody>

	</table>

</body>
</html>