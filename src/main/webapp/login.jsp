<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Usuarios</title>


</head>
<body>
	<form action="/login" method="post">
		<h5>
			Para logar cadastre um usuário e logue no sistema <br> Exemplo: Usuario:
			Teste senha: 123
		</h5>
		<table>
			<tr>
				<td><font face="verdana" size="5px">Username:</font></td>
				<td><input type="text" name="userName" required="required"></td>
			</tr>
			<tr>
				<td><font face="verdana" size="5px">Password:</font></td>
				<td><input type="password" name="userPassword"
					required="required"></td>
			</tr>

			<tr>

				<td>${ erro }</td>

			</tr>

		</table>
		<button>Login</button>
	</form>
	<br>
	<a href="/user/cadastro.jsp"><button>Criar uma conta</button></a>
	<br>
	<a href="/UserTestarLista"><button>Adicionar Usuarios Teste</button></a>
	<br>${ mensagem }

</body>

</html>