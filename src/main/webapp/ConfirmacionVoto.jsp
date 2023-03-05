<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Confirma tu voto</title>
</head>
<body class="container" style="background-color: #2C3639;">
	<div class="card mx-auto my-2" style="width: 25rem;">
  <div class="card-body text-white" style="background-color:#3F4E4F; border-color: #A27B5C; width: 25rem; margin: auto;">
    <h5 class="card-title text-info" style="margin-left:4em;">¡VOTO REALIZADO!</h5>
    <p class="card-text" style="margin-right: 1em">Ahora puedes volver a la página de equipos o realizar otro voto.</p>
    <a href="VotoFormulario.jsp" class="card-link">Emitir otro voto</a>
    <a href="index.jsp" class="card-link" style="margin-left:10.5em;">Volver</a>
  </div>
</div>
</body>
</html>