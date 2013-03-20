<%@page import="cl.buildersoft.ibk.bean.Customer"%>
<%@page import="cl.buildersoft.ibk.bean.Bank"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	Bank mainBank = (Bank) request.getSession().getAttribute("MainBank");
Customer customerUser =(Customer) request.getSession().getAttribute("Customer");
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<LINK rel="stylesheet" type="text/css"
	href="x${pageContext.request.contextPath}/css/style.css?<%=Math.random() %>" />
<LINK rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/layout.css?<%=Math.random() %>" />

<title><%=mainBank == null ? "" : mainBank.getName()%></title>
</head>
<body>

	<div id="mainContainer">
		<div id="header">
		
			<div id="bankInfo">
			<!-- 
				<img id="logoBank"
					src="data:image/jpeg;charset=utf-8;base64, < % = mainBank.getLogo()% >">
				< %=mainBank.getName()% >
				-->
			</div>
			
			<div id="userInfo"><!-- < %=customerUser.getName()% > --></div>
			
		</div>
		<div id="menu-1">menu 1</div>
 
		<div id="content">
		
		
		