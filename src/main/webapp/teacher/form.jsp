<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Teacher</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">

</head>
<body>
<div class="container">
<h1>Professores</h1>


<form action="/teacher/form" method="post">

 <input type="hidden" name="id" value="${teacher.id}">

  <div class="form-group">
   	<label for="name">Name</label>
   	<input type="text" class="form-control" name="name" value="${teacher.name}" id="titulo" placeholder="Nome da Tarefa"  required>
  </div>
  	  <div class="form-group">
   	<label for="course">Course</label>
   	<input type="text" class="form-control" name="course" value="${teacher.course}" id="titulo" placeholder="Nome da Tarefa"  required>
  </div>
    	  <div class="form-group">
   	<label for="email">Email</label>
   	<input type="text" class="form-control" name="email" value="${teacher.email}" id="titulo" placeholder="Nome da Tarefa"  required>
  </div>
  
  <div class="form-group">
   	<label for="research">Research</label>
   	<input type="text" class="form-control" name="research" value="${teacher.research}" id="titulo" placeholder="Nome da Tarefa"  required>
  </div>
  
  
   <div class="form-group">
      	<label for="degree">Degrees</label>
   		<select type="text" class="form-control" name="degree" id="degree" required>
   			<option value="">Selecione</option>
   			<c:forEach var="d" items="${degrees}">
   				<option value="${d.id}">${d.name}</option>
  			</c:forEach>
   		</select>
   </div>
 

  <button type="submit" class="btn btn-primary">Salvar</button><br>
</form>


</div>
<!-- JS, Popper.js, and jQuery -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
</body>
</html>