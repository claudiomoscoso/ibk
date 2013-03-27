<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/common/header.jsp"%>

<script
	src="${pageContext.request.contextPath}/js/login/main.js?<%=Math.random() %>"></script>
<h1>Mis Cuentas</h1>
<table border="1" style="width: 100%">
	<tr>
		<td>Cuenta</td>
		<td>Moneda</td>
		<td>Saldo Actual</td>
		<td>Saldo Disponible</td>
		<td>Acciones</td>
	</tr>
</table>

<span>"Saldo actual" es el saldo después de todas las
	transacciones contabilizadas al final del día hábil anterior. "Saldo
	disponible" es el "saldo actual" + depósitos de hoy - se retira
	pendientes - los fondos en espera. Fondos en espera suelen estar
	relacionados con los cheques depositados que no han 'liberados'.</span>

<%@ include file="/WEB-INF/jsp/common/footer.jsp"%>


