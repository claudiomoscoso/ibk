<%@page import="cl.buildersoft.ibk.bean.CustomerUser"%>
<%@page import="cl.buildersoft.ibk.bean.Bank"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	Bank mainBank = (Bank) request.getSession().getAttribute("MainBank");
	CustomerUser customerUser = (CustomerUser) request.getSession().getAttribute("CustomerUser");
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<LINK rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/default.css?<%=Math.random() %>" />
<title><%=mainBank == null ? "" : mainBank.getName()%></title>
</head>
<body>