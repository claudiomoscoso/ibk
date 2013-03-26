<%@page import="cl.buildersoft.ibk.bean.User"%>
<%@page import="cl.buildersoft.ibk.bean.Customer"%>
<%@page import="cl.buildersoft.ibk.bean.Bank"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<LINK rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/style.css?<%=Math.random() %>" />

<LINK rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/layout.css?<%=Math.random() %>" />


<script type="text/javascript">
	var contextPath = "${pageContext.request.contextPath}";
</script>

<script
	src="${pageContext.request.contextPath}/js/lib/jquery/jquery-1.8.1.min.js"></script>
<title>Bienvenidos</title>
<script language="javascript">
	function initPage() {
		try {
			onLoadPage();
		} catch (e) {

		}
	}
</script>
</head>

<body onload="javascript:initPage();">

	<div id="main">
		<div id="header">
			 
			<div id="bankInfo"></div>
			<div id="userInfo"></div>
			 <div id="logout">Salir</div>
		</div>


		<div id="menu-1">menu 1</div>

		<div id="content">
		