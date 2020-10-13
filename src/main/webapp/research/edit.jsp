
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Editar</title>
<!-- CSS only -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
	crossorigin="anonymous">

</head>
<body>
	<div class="container-fluid">
		<h1>Editar pesquisa</h1>

		<form action="/research/edit" method="post">

			<input type="hidden" name="id" value="${research.id}">

			<div class="form-group">
				<label for="Name">Nome</label> <input type="text"
					class="form-control" name="name" id="name" value="${research.name}"
					placeholder="Nome da pesquisa" required>
			</div>

			<div class="form-group">
				<label for="Description">Descrição</label>
				<textarea class="form-control" name="description" id="description" 
				placeholder="Descrição da pesquisa" rows="3" required>${research.description}</textarea>

			</div>

			<button type="submit" class="btn btn-primary">Salvar</button>
			<br>
		</form>

		<br> <a href="/research" class="btn btn-secondary">Voltar</a>

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