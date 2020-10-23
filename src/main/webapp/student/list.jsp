<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<title> Student </title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
		integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>

<body>
	<div class="container">
		<h1> Student Form </h1>
		<br> <a href="/student/form.jsp" class="btn btn-primary"> Cadastrar Aluno </a> <br>

		<c:if test="${salvo != null && salvo == true}"><br>
			<div class="alert alert-success" role="alert"> ALUNO CADASTRADO </div>
			<br>
			<c:set var="salvo" scope="session" value="null"></c:set>
		</c:if>


			<table class="table table-striped">
				<thead>

					<tr>
						<th>ID</th>
						<th>NOME</th>
						<th>MATRICULA</th>

						<th></th>
					</tr>
				</thead>
				<tbody>



					<c:forEach var="st" items="${students}">
						<tr>
							<td>${st.id}</td>
							<td>${st.name}</td>
							<td>${st.enrollment}</td>

							<td><a href="./studentremove?id=${st.id}">Excluir</a>
							</td>
						</tr>
					</c:forEach>

				</tbody>

			</table>

	</div>

	<!-- JS, Popper.js, and jQuery -->
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
		integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous">
	</script>
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"
		integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous">
	</script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"
		integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous">
	</script>
</body>

</html>