<%@page import="cl.buildersoft.ibk.bean.Bank"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	Bank bank = (Bank) request.getSession(false).getAttribute("Bank");
%>
<img src="data:image/png;base64,<%=bank.getLogo()%>" /><%=bank.getName()%>
