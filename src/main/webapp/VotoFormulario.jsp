<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Emite tu voto</title>
</head>
<body class="container" style="background-color: #2C3639;">
	<div class="card text-white border my-2" style="background-color:#3F4E4F; border-color: #A27B5C; width: 25rem; margin: auto;">
	    <h5 class="card-header">
	    	<a class="" style="margin:5.7em;">Emite tu voto</a>
	    </h5>
	  <div class="card-body">
	    <div class="form-group">
	    	<label for="Nomrbre">Nombre</label>
		   <input type="text" class="form-control " id="NombreVotante" placeholder="Introduce tu nombre" style="background-color: #2C3639; color: #F2F2F2 ;border-color: #334041">
		</div>
	    <div class="form-group">
    		<label for="Seleccion">Equipo</label>
    		<select class="form-control" id="Seleccion" style="background-color: #2C3639; border-color: #334041">
    			<c:forEach var="equipo" items="${lista}" varStatus="indice">
    				<option>${equipo.getNombreEquipo()}</option>
    			</c:forEach>
		   </select>
	  	</div>
	  	<form action="#" method="post">
	  		<input type="hidden" name="id" value="${equipo.getId()}"/>
	    	<a href="ConfirmacionVoto.jsp" class="btn btn-info" style="margin-left: 9em">¡Vota!</a>
			<!-- hay que quitar el .jsp y añadir la introduccion de los datos -->
	    </form>
	 </div>
	</div>
</body>
</html>