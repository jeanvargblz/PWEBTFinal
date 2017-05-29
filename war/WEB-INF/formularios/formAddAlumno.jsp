<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Alumno</title>
<script src="https://code.jquery.com/jquery-3.2.1.js"
	integrity="sha256-DZAnKJ/6XZ9si04Hgrsxu/8s717jcIzLy3oi35EouyE="
	crossorigin="anonymous"></script>
<meta charset="utf-8">

<!-- Bootstrap core CSS -->
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">

<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<link href="bootstrap/css/ie10-viewport-bug-workaround.css"
	rel="stylesheet">

<!-- Custom styles for this template -->
<link href="navbar.css" rel="stylesheet">
</head>
<body>
	<form role="form" action="/addAlumno" method="post">
		<div class="form-group">
			<label>Código </label> <input type="text"
				class="form-control" id="ejemplo_email_1"
				placeholder="Introduce los nombres">
		</div>
		<div class="form-group">
			<label>Nombres </label> <input type="text"
				class="form-control" id="ejemplo_email_1"
				placeholder="Introduce los nombres">
		</div>
		<div class="form-group">
			<label>Apellido Paterno </label> <input type="text"
				class="form-control" id="ejemplo_email_1"
				placeholder="Introduce Apellido Paterno">
		</div>
		<div class="form-group">
			<label>Apellido Materno </label> <input type="text"
				class="form-control" id="ejemplo_email_1"
				placeholder="Introduce los nombres">
		</div>
		<div class="form-group">
			<label>Nombres </label> <input type="text"
				class="form-control" id="ejemplo_email_1"
				placeholder="Introduce los nombres">
		</div>
		
		<div class="form-group">
			<label for="ejemplo_password_1">Tipo</label><select
				class="form-control" id="sel1" name="tipo">
				<option value="administrador">administrador</option>
				<option value="director">director</option>
				<option value="secretario">secretario</option>
				<option value="profesor">profesor</option>
				<option value="estudiante">estudiante</option>
			</select>
		</div>
		<label class="radio-inline"> <input type="radio"
			name="condicion" value="true">Activo
		</label> <label class="radio-inline"> <input type="radio"
			name="condicion" value="false">Inactivo
		</label>

		<button type="submit" class="btn btn-sm btn-primary">Enviar</button>
	</form>
</body>
</html>