<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Projetos</title>
<!-- CSS only -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
	crossorigin="anonymous">
</head>
<body>
<div class="container">
		<h1>Projetos</h1>

		<br> <a href="/project/form.jsp" class="btn btn-primary">Cadastrar
			Projeto</a> <br>
			
		<c:if test="${save_sucess!= null && save_sucess== true}">
		<br>	
		<div class="alert alert-success" role="alert">
		Projeto cadastrada com sucesso!
		</div>
		<br>
		<c:set var="save_sucess" scope="session" value="null"></c:set>
		</c:if>

	
		
		<table class="table table-striped">
			<thead>
				<tr>
					<th>TÍTULO</th>
					<th>DESCRIÇÃO</th>
				</tr>
			</thead>
			<tbody>
			
				<c:forEach var="p" items="${projects}">
				<tr>
					<td>${p.title}</td>
					<td>${p.description}</td>
					<td><a href="./projectdelete?id=${p.id}">Excluir</a></td>
				</tr>
				</c:forEach>
				
			</tbody>
		</table>
	</div>












<!-- JS, Popper.js, and jQuery -->
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
		integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"
		integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"
		integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV"
		crossorigin="anonymous"></script>

</body>
</html>