<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="utilidades.*"%>
<%@ page import="estructura.Correos"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Alumno</title>
<script src="https://code.jquery.com/jquery-3.2.1.js"
	integrity="sha256-DZAnKJ/6XZ9si04Hgrsxu/8s717jcIzLy3oi35EouyE="
	crossorigin="anonymous"></script>
<meta charset="utf-8">
<link href="style.css" rel="stylesheet">
<!-- Bootstrap core CSS -->
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">

<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<link href="bootstrap/css/ie10-viewport-bug-workaround.css"
	rel="stylesheet">

<!-- Custom styles for this template -->
<link href="navbar.css" rel="stylesheet">
</head>
<body>
	<% String req = request.getParameter("correo"); %>
	<% String correo="Ingrese correo"; %>
	<% Correos pas; %>
	<% if(req!=null){
			correo=req;
			pas=CorreoUtilidades.buscarCorreo(CorreoUtilidades.getEntries(), correo);
			%>
	<center>
	<form role="form" action="/modificarCorreo" method="post">
		<input type="hidden" value="<%=req %>" name="co">
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		
		<div class="form-group">
			<label for="ejemplo_email_1">Email</label> <input type="text"
				class="form-control" id="ejemplo_email_1"
				placeholder="<% pas.getCorreo(); %>" name="correo">
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
		<label class="radio-inline"> <input type="radio"	name="condicion" value="true">
		Activo
		</label> <label class="radio-inline"> <input type="radio"
			name="condicion" value="false">Inactivo
		</label>

		<button type="submit" class="btn btn-sm btn-primary">Enviar</button>
	</form>

	<% } else { %>
	<form role="form" action="/editarOption" method="post">
		<div class="form-group">
			<label>Correo</label>
			<input type="text" class="form-control"	id="ejemplo_email_1" placeholder="<%=correo%>" name="correo">
		</div>
		<button type="submit" class="btn btn-sm btn-primary">Enviar</button>
	</form>
	</center>
	<%}%>

</body>
</html>