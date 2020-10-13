<%@page import="br.ucsal.neutron.user.User"%>
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
					<td><a href="/user/delete?id=${ u.id }">Excluir</a>
						<a href="/user/view?id=${ u.id }">Visualizar</a> <a
						href="/user/form?id=${ u.id }">Editar</a></td>
				</tr>
			</c:forEach>
		</tbody>

	</table>
<a href="/user/logout"><button>Voltar</button></a>

</body>
</html>