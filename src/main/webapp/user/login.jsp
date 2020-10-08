<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Usuarios</title>


</head>
<body>
<form action="/user/LoginController" method="post">

  <h5>Para logar a nível de teste use o exemplo <br> Exemplo: Usuario: Teste senha: 123<h5>
   <table>
   <tr>
      <td><font face="verdana" size="5px">Username:</font></td>
      <td><input type="text" name="userName"></td>
   </tr>
   <tr>
      <td><font face="verdana" size="5px">Password:</font></td>
      <td><input type="password" name="userPassword"></td>
   </tr>
   </table>
    <button >Login</button> 
</form>

</body>

</html>