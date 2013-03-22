<%@page import="cl.buildersoft.ibk.bean.User"%>
<%@page import="cl.buildersoft.ibk.bean.Customer"%>
<%@page import="cl.buildersoft.ibk.bean.Bank"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	//Customer customer = (Customer) request.getSession().getAttribute("Customer");
	//User user = (User) request.getSession().getAttribute("User");
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<LINK rel="stylesheet" type="text/css"
	href="x${pageContext.request.contextPath}/css/style.css?<%=Math.random() %>" />
<LINK rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/layout.css?<%=Math.random() %>" />

<script type="text/javascript">
var contextPath = "${pageContext.request.contextPath}";
</script>

<script src="${pageContext.request.contextPath}/js/lib/jquery/jquery-1.8.1.min.js"></script>
<script src="${pageContext.request.contextPath}/js/home/main.js"></script>

<title><%=getBankName(request)%></title>


</head>
<body onload="javascript:loadBankInfo();">

	<div id="mainContainer">
		<div id="header">

			<div id="bankInfo">
				<!-- 
				<img id="logoBank"
					src="data:image/jpeg;charset=utf-8;base64, < % = mainBank.getLogo()% >">
				< %=mainBank.getName()% >
				-->
			</div>

			<div id="userInfo">
				<!-- < %=customerUser.getName()% > -->
			</div>

		</div>
		<div id="menu-1">menu 1</div>

		<div id="content">


			<%!private String getBankName(HttpServletRequest request) {
		Bank mainBank = (Bank) request.getSession().getAttribute("MainBank");
		String out = mainBank == null ? "" : mainBank.getName();

		return out;
	}
	%>