<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update User</title>
</head>
<body>
<form action="/user/form" method="post">
  <label for="id">ID:</label>
  <input type="text" id="id" name="id" value="${user.id}"  disabled=""><br><br>
  <label for="userName">USERNAME:</label>
  <input type="text" id="userName" name="userName" value="${user.username}"><br><br>
  <label for="passWord">PASSWORD:</label>
  <input type="password" id="passWord" name="passWord" value="${user.password}"><br><br>
  <input type="submit" value="Submit">
  <a href="/user/logout"><button>Voltar</button></a>
  <a href="/user"><button>Listar usuarios</button></a>
</form>
</body>
</html>