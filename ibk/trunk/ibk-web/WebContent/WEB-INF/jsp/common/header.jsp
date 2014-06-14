<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>${applicationScope.bankName}</title>

<link
	href="${pageContext.request.contextPath}/bootstrap-3/css/bootstrap.min.css"
	rel="stylesheet">


<!--[if lt IE 9]>
      <script src="${pageContext.request.contextPath}/bootstrap-3/ie/html5shiv.js"></script>
      <script src="${pageContext.request.contextPath}/bootstrap-3/ie/respond.min.js"></script>
    <![endif]-->
</head>
<body>

	<div class="page-header">
		<div class="row" id="header">
			<div class="col-xs-6 btn-info" id="bankInfo">Bank Info</div>
			<div class="col-xs-5 btn-success" id="userInfo">User Info</div>
			<div class="col-xs-1 btn-info" id="logout">Salir</div>
		</div>
		<div class="row"></div>
		<div id="menu-1">menu 1</div>
	</div>