<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cursos</title>
<!-- CSS only -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
	crossorigin="anonymous">
</head>
<body>
<div class="container">
		<h1>Cursos</h1>

		<br> <a href="/course/form.jsp" class="btn btn-primary">Cadastrar
			Curso</a> <br>
			
		<c:if test="${save_feedback != null && save_feedback == true}">
		<br>	
		<div class="alert alert-success" role="alert">
		Curso cadastrado com sucesso!
		</div>
		<br>
		<c:set var="save_feedback" scope="session" value="null"></c:set>
		</c:if>

	
		
		<table class="table table-striped">
			<thead>
				<tr>
					<th>NOME</th>
					<th>COORDENADOR</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
			
				<c:forEach var="c" items="${courses}">
				<tr>
					<td>${c.name}</td>
					<td>${c.coordinator}</td>
					<td>
					
					<a href="/course/view?id=${c.id}">Visualizar&nbsp;</a>
					<a href="/course/edit?id=${c.id}">Editar&nbsp;</a>
					<a href="/coursedelet?id=${c.id}">Excluir</a>
					
					</td>			
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