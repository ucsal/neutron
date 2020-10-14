<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View</title>
</head>
<body>
	<table class="table table-striped">
		<thead>
			<tr>
				<th>ID</th>
				<th>USERNAME</th>
			</tr>
		</thead>

		<tbody>
			<tr>
				<td>${user.id}</td>
				<td>${user.username}</td>
			</tr>
		</tbody>

	</table>
	<input type="button" value="Voltar" onClick="history.go(-1)">
</body>
</html>