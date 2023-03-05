<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<title>Index</title>
</head>
<body class="container" style="background-color: #2C3639;">

	<a href="VotoFormulario" class="btn btn-info my-4 border border-primary"
		style=" padding: 10px 20px; font-size: 40px; border-radius: 10px; margin-left: 8.5em;">¡Vota
		por un equipo!</a>
	<br />
	<a href="/listEquipos">Equipos PRUEBA</a>
	<br />
	<br />

	<div class="card-deck">
		<div class="card text-white border " style="background-color:#3F4E4F; border-color: #A27B5C">
			<div class="card-body border border-info">
				<h5 class="card-header mb-3" style="background-color: #262B30">EQUIPO 1</h5>
				<h5 class="card-title mb-3">ODOO</h5>
				<p class="card-text">PERSONA 1<br/>PERSONA 2<br/>PERSONA 3<br/>PERSONA 4</p>
				<p class="card-text">
					<small class="text-muted">Last updated 3 mins ago</small>
				</p>
			</div>
		</div>
<!-- 		Las dos últimas tarjetas son de prueba. Para generar las otras tarjetas -->
<!-- 		se hará con el forEach de listEquipos.jsp -->
		<div class="card">
			<div class="card-body">
				<h5 class="card-title">Card title</h5>
				<p class="card-text">This card has supporting text below as a
					natural lead-in to additional content.</p>
				<p class="card-text">
					<small class="text-muted">Last updated 3 mins ago</small>
				</p>
			</div>
		</div>
		<div class="card">
			<div class="card-body">
				<h5 class="card-title">Card title</h5>
				<p class="card-text">This is a wider card with supporting text
					below as a natural lead-in to additional content. This card has
					even longer content than the first to show that equal height
					action.</p>
				<p class="card-text">
					<small class="text-muted">Last updated 3 mins ago</small>
				</p>
			</div>
		</div>
	</div>
</body>
</html>