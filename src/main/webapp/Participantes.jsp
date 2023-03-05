<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Crea un equipo</title>
</head>
<body class="container" style="background-color: #2C3639;">
	<form action="DetallesEquipos" method="get">
		<div class="card text-white border my-2" style="background-color:#3F4E4F; border-color: #A27B5C; width: 25rem; margin: auto;">
			<h5 class="card-header">
				<a class="" style="margin:5.7em;">Añade un participante</a>
			</h5>
		<div class="card-body">
			<div class="form-group">
				<label for="Integrante1">Integrante 1</label>
			<input type="text" class="form-control " name="Integrante1" placeholder="Introduce el nombre" style="background-color: #2C3639; color: #F2F2F2 ;border-color: #334041">
			<input type="hidden" name="id" value="${idEquipo}"/>
			<input type="submit" class="btn btn-info mt-2" style="margin-left: 9em"/>
	    </form>
	 </div>
	</div>
</body>
</html>