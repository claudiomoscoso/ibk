<%@page import="cl.buildersoft.framework.util.BSWeb"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	request.getSession().invalidate();
%>


<!DOCTYPE html>
<html lang="es">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<link
	href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.css"
	rel="stylesheet">


<style type="text/css">
.form-signin {
	max-width: 300px;
	padding: 19px 29px 29px;
	margin: 0 auto 20px;
	background-color: #fff;
	border: 1px solid #e5e5e5;
	-webkit-border-radius: 5px;
	-moz-border-radius: 5px;
	border-radius: 5px;
	-webkit-box-shadow: 0 1px 2px rgba(0, 0, 0, .05);
	-moz-box-shadow: 0 1px 2px rgba(0, 0, 0, .05);
	box-shadow: 0 1px 2px rgba(0, 0, 0, .05);
}

.form-signin .form-signin-heading,.form-signin .checkbox {
	margin-bottom: 10px;
}

.form-signin input[type="text"],.form-signin input[type="password"] {
	font-size: 16px;
	height: auto;
	margin-bottom: 15px;
	padding: 7px 9px;
}
</style>
<title>Ingreso de usuario</title>
</head>
<body>

	<div class="container">

		<div class="row">&nbsp;</div>
		<div class="row">&nbsp;</div>

		<form class="form-signin"
			action="${pageContext.request.contextPath}/servlet/login/ValidateUserPassword?<%=BSWeb.randomString() %>"
			method="post">
			<h2 class="form-signin-heading">My Bank</h2>

			<input type="text" name="user" class="input-block-level"
				placeholder="User id"> <input type="password"
				name="password" class="input-block-level" placeholder="Clave de acceso">

			<button class="btn btn-large btn-primary" type="submit">Acceder...</button>

		</form>

	</div>
</body>

</html>



<!-- 
<!DOCTYPE html>
< % @page import="cl.buildersoft.framework.util.BSWeb" % >
<html lang="es">
<head>
<meta charset="utf-8">
<title>Acceso de usuario</title>
<![if lt IE 9]>
<script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
<![endif]>
<link
	href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<style>
body {
	padding-top: 60px;
}
</style>
<link
	href="${pageContext.request.contextPath}/bootstrap/css/bootstrap-responsive.min.css"
	rel="stylesheet">
</head>
<body>
	<script
		src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.min.js"></script>


	<form
		action="${pageContext.request.contextPath}/servlet/login/ValidateUserPassword?<%=BSWeb.randomString() %>"
		method="post">
		Usuario: <input type="text" name="user"><br> Clave: <input
			type="password" name="password"> <br> <input
			type="submit">
	</form>
</body>
</html>
-->


