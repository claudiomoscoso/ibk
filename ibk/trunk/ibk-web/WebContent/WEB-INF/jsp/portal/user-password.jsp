<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	request.getSession().invalidate();
%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>${applicationScope.bankName}</title>

<!-- Bootstrap -->
<link
	href="${pageContext.request.contextPath}/bootstrap-3/css/bootstrap.min.css"
	rel="stylesheet">
<link href="${pageContext.request.contextPath}/css/signin/signin.css"
	rel="stylesheet">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="${pageContext.request.contextPath}/bootstrap-3/ie/html5shiv.js"></script>
      <script src="${pageContext.request.contextPath}/bootstrap-3/ie/respond.min.js"></script>
    <![endif]-->
</head>
<body>

	<div class="container">

		<form class="form-signin"
			action="${pageContext.request.contextPath}/servlet/login/ValidateUserPassword?"
			method="post">
			<h2 class="form-signin-heading">${applicationScope.bankName}</h2>
			<input type="text" name="user" class="form-control"
				placeholder="Identificador de Usuario" required autofocus> <input
				type="password" name="password" class="form-control"
				placeholder="Clave secreta" required>

			<button class="btn btn-lg btn-primary btn-block btn-success"
				type="submit">Entrar</button>
		</form>

		<div class="row">
			<div class="col-xs-4">&nbsp;</div>
			<div class="col-xs-4 text-center">
				<a href="#" class="btn btn-warning" role="button">Olvid&oacute;
					su clave?</a>
			</div>
			<div class="col-xs-4">&nbsp;</div>
		</div>


		<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
		<script
			src="${pageContext.request.contextPath}/bootstrap-3/jquery/jquery.min.js"></script>
		<!-- Include all compiled plugins (below), or include individual files as needed -->
		<script
			src="${pageContext.request.contextPath}/bootstrap-3/js/bootstrap.min.js"></script>
</body>
</html>