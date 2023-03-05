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
	<form action="CrearEquipo" method="post">
		<div class="card text-white border my-2" style="background-color:#3F4E4F; border-color: #A27B5C; width: 25rem; margin: auto;">
			<h5 class="card-header">
				<a class="" style="margin:5.7em;">Emite tu voto</a>
			</h5>
		<div class="card-body">
			<div class="form-group">
				<label for="Nombre">Nombre de equipo</label>
			<input type="text" class="form-control " name="nombre_equipo" placeholder="Introduce el nombre del equipo" style="background-color: #2C3639; color: #F2F2F2 ;border-color: #334041">
			</div>
			<div class="form-group">
				<label for="Integrante1">Integrante 1</label>
			<input type="text" class="form-control " id="Itegrante1" placeholder="Introduce el nombre" style="background-color: #2C3639; color: #F2F2F2 ;border-color: #334041">
			</div>
			<div class="form-group">
				<label for="Integrante2">Integrante 2</label>
			<input type="text" class="form-control " id="Itegrante2" placeholder="Introduce el nombre" style="background-color: #2C3639; color: #F2F2F2 ;border-color: #334041">
			</div>
			<div class="form-group">
				<label for="Integrante2">Integrante 3</label>
			<input type="text" class="form-control " id="Itegrante3" placeholder="Introduce el nombre" style="background-color: #2C3639; color: #F2F2F2 ;border-color: #334041">
			</div>
			<div class="form-group">
				<label for="Integrante2">Integrante 4</label>
			<input type="text" class="form-control " id="Itegrante4" placeholder="Introduce el nombre" style="background-color: #2C3639; color: #F2F2F2 ;border-color: #334041">
			</div>
			
			<input type="submit" class="btn btn-info" style="margin-left: 9em"/>
	    </form>
	 </div>
	</div>
</body>
</html>