<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/user/save" method="post">
  <label for="userName">USERNAME:</label>
  <input type="text" id="userName" name="userName" required="required"><br><br>
  <label for="passWord">PASSWORD:</label>
  <input type="password" id="passWord" name="passWord" required="required"><br><br>
  <input type="submit" value="Submit">
</form>
   <a href="/user"><button>Listar usuarios</button></a>
</body>
</html>