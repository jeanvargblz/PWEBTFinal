<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="es">
<head>
<title>Ingreso</title>
<meta name="google-signin-scope" content="profile email">
<meta name="google-signin-client_id"
	content="139878915322-udt6t70orjvs790mgfjph1s8poll1u75.apps.googleusercontent.com">
<script src="https://apis.google.com/js/platform.js" async defer></script>
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

	<div class="container">

		<!-- Static navbar -->
			<div class="container-fluid">
				<div id="topPan">
					<a href="#"><img src="images/logo.jpg" alt="Education Zone"
						width="245" height="37" border="0" class="logo"
						title="Education Zone" /></a>
					<p></p>
					<div id="topContactPan"></div>
					<div id="topMenuPan">
						<div id="topMenuLeftPan"></div>
						<div id="topMenuMiddlePan">
							<ul>
								<li><a href="Pagina.html">Home</a></li>
								<li><a href="QuienesSomos.html">About</a></li>
								<li><a href="Login.jsp">Notes</a></li>
								<li><a href="Profesores.html">Teachers</a></li>
								<li><a href="Pagina.html">Activity</a></li>
							</ul>
						</div>
					</div>
					<div class="inner_copy"></div>
				</div>
				<!--/.nav-collapse -->
			</div>
			<!--/.container-fluid -->
		<br>
		<!-- Main component for a primary marketing message or call to action -->
		<div class="panel panel-primary">
			<div class="panel-heading">Ingreso</div>
			<div class="panel-body">
				<div class="container">
					<div id="bodyLeftPan">
						<div class="g-signin2" data-onsuccess="onSignIn" data-theme="dark"></div>
						<script type="text/javascript">
							function onSignIn(googleUser) {
								// Useful data for your client-side scripts:
								var profile = googleUser.getBasicProfile();
								console.log("ID: " + profile.getId()); // Don't send this directly to your server!
								console.log('Full Name: ' + profile.getName());
								console.log('Given Name: '
										+ profile.getGivenName());
								console.log('Family Name: '
										+ profile.getFamilyName());
								console.log("Image URL: "
										+ profile.getImageUrl());
								console.log("Email: " + profile.getEmail());

								// The ID token you need to pass to your backend:
								var id_token = googleUser.getAuthResponse().id_token;
								console.log("ID Token: " + id_token);
								var redirectUrl = '/gmail';

								//using jquery to post data dynamically
								var form = $('<form action="' + redirectUrl + '" method="post">'
										+ '<input type="text" name="id_token" value="'
										+ googleUser.getAuthResponse().id_token
										+ '" />' + '</form>');
								$('body').append(form);
								form.submit();
							};
						</script>
						<br> <a href="http://1-dot-profar-167808.appspot.com" onclick="signOut();">Sign out</a>
						<script>
							function signOut() {
								var auth2 = gapi.auth2.getAuthInstance();
								auth2.signOut().then(function() {
									console.log('User signed out.');
								});
							}
						</script>
					</div>
				</div>
				<!-- /container -->
			</div>
		</div>
</body>

</html>