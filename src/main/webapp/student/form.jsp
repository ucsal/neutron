<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

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
		<form action="/student/save" method="post">
			<div class="form-group">
				<label for="name"> Nome </label>
				<input type="text" class="form-control" name="name" id="name" placeholder="Nome do aluno" required>
</div>

				<div class="form-group">
					<label for="course"> Curso </label>
					<input type="text" class="form-control" name="course" id="course" placeholder="Nome do curso" required>
</div>

					<div class="form-group">
						<label for="email"> Email </label>
						<input type="text" class="form-control" name="email" id="email" placeholder="Email do aluno" required>
</div>

						<div class="form-group">
							<label for="enrollment"> Matrícula </label>
							<input type="text" class="form-control" name="enrollment" id="enrollment" placeholder="Número de matrícula do aluno" required>
</div>

							<button type="submit" class="btn btn-primary">Salvar</button> <br>


</div>
							<!-- JS, Popper.js, and jQuery -->
							<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
								integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
								crossorigin="anonymous"></script>
							<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"
								integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN"
								crossorigin="anonymous"></script>
							<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"
								integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV"
								crossorigin="anonymous"></script>
</body>





</htlm>