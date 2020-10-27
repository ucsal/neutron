<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<jsp:include page="../header.jsp" />

</head>
<body>

<jsp:include page="../navbar.jsp" />


<div class="container">
<h1>Professores</h1>

<table class="table table-striped">
  <thead>

<tr>
<th>ID</th>
<th>NOME</th>
<th>TITULAÇÃO</th>

<th></th>
</tr>
</thead>
<tbody>



<c:forEach var="t" items="${teachers}">
	<tr>
		<td>${t.id}</td>
		<td>${t.name}</td>
		<td>${t.degree.name}</td>
		
		<td><a href="#" >Excluir</a>
			<a href="#" >Visualizar</a>
			<a href="#" >Editar</a>
		</td>
	</tr>
</c:forEach>

</tbody>

</table>


</div>

<jsp:include page="../scripts.jsp"/>
</body>
</html>