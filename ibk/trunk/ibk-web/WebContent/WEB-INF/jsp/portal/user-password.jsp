<!DOCTYPE html>
<%@page import="cl.buildersoft.framework.util.BSWeb"%>
<html lang="es">
<head>
<meta charset="utf-8">
<title>Nuevo proyecto con Bootstrap 2.0</title>
<meta name="description"
	content="Artículo en GenbetaDev sobre Bootstrap 2.0">
<meta name="author" content="Ricardo Borillo">
<!—[if lt IE 9]>
<script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
<![endif]—>
<link href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<style>
body {
	padding-top: 60px;
}
</style>
<link href="${pageContext.request.contextPath}/bootstrap/css/bootstrap-responsive.min.css" rel="stylesheet">
</head>
<body>
	<script
		src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
	<script src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.min.js"></script>


	<form
		action="${pageContext.request.contextPath}/servlet/login/ValidateUserPassword?<%=BSWeb.randomString() %>"
		method="post">
		Usuario: <input type="text" name="user"><br> Clave: <input
			type="password" name="password"> <br> <input
			type="submit">
	</form>



</body>
</html>













