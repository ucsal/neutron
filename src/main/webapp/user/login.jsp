<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Usuarios</title>


</head>
<body>
	<form action="/user/login" method="post">

		<h5>
			Para logar a nível de teste use o exemplo <br> Exemplo: Usuario:
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
			</tr>

			<%
						String[] erros = { "Login e/ou senha inválidos!", "Você não está logado!" };
						String erro = request.getParameter("erro");

						if (erro != null) {
					%>

			<tr>

				<td><%=erros[Integer.parseInt(erro) - 1]%></td>

			</tr>
			<%
						}
					%>

			<tr>
		</table>
		<button>Login</button>
	</form>
	<br>
	<a href="/user/cadastro.jsp">Criar uma conta</a>
	<br>
	<a href="/user/UserTestarLista">Criar alguns users</a>
	<br>${ mensagem }

</body>

</html>