<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<jsp:include page="../header.jsp" />
 </head>
<body>

<jsp:include page="../navbar.jsp" />

<div class="container">
<h3>Olá ${ user.username }, você está logado no Dashboard!</h3>

	
<jsp:include page="../scripts.jsp" />
</div>
</body>
</html>