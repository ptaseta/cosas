<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Lista de equipos</title>
</head>
<body class="container" style="background-color: #2C3639;">
	<div class="row card-deck mt-3">
		<c:forEach var="equipo" items="${lista}" varStatus="indice">
			<div class="card text-white border " style="background-color:#3F4E4F; border-color: #A27B5C; ">
				<div class="card-header text-center" style="background-color: #262B30">
					<h2 class="card-title">
						<c:out value="${equipo.getNombreEquipo()}"/>
					</h2>
				</div>
				<!-- card body -->
				<div class="card-body">
					<p class="card-text text-center" style="font-size:x-small">Número de participantes: <c:out value="${equipo.getNumero_participantes()}"/></>
					</br>
					<p class="card-text ml-3 text-center" style="font-size:x-large">VOTOS:</p>
					<p class="card-text ml-3 text-center " style="font-size:70px; color:rgb(25,210,115);"><c:out value="${equipo.getVoto_equipo()}"/></p>
				</div>
				<!-- footer -->
				<div class="card-footer text-muted text-center">
					<!-- cambiar este href por un form con inputs hidden para obtener el id del equipo y pasarlo 
						a los detalles para displayear atributos -->
					<form method="get" action="DetallesEquipos" >
						<input type="hidden" name="idEquipo" value="${equipo.getId()}"/>
						<input type="submit" value="Detalles" class="btn btn-primary "/>
					</form>
					<!-- cambiar el .jsp -->
				</div>
			</div>
		</c:forEach>
	</div>
	<a href="FormularioCrearEquipo.jsp" class="btn btn-info my-4 border border-primary"
	style=" padding: 10px 20px; font-size: 40px; border-radius: 10px; margin-left: 8.5em;">¡Crea un equipo!</a>
</body>
</html>