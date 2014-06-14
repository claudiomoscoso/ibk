<%@ include file="/WEB-INF/jsp/common/header.jsp"%>

<script
	src="${pageContext.request.contextPath}/js/login/main.js?<%=Math.random()%>"></script>

<div class="container">
	<div class="row">
		<div class="col-xs-12">
			<h1>Mis Cuentas</h1>
		</div>
	</div>
	<div class="row">
		<div class="col-xs-12">
			<table class="table table-bordered table-hover table-condensed">
				<thead>
					<tr>
						<td>Cuenta</td>
						<td>Moneda</td>
						<td>Saldo Actual</td>
						<td>Saldo Disponible</td>
						<td>Acciones</td>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>xxx4500</td>
						<td>USD</td>
						<td>600</td>
						<td>610</td>
						<td><select /></td>
					</tr>
					<tr>
						<td>xxx4500</td>
						<td>USD</td>
						<td>600</td>
						<td>610</td>
						<td><select /></td>
					</tr>
					<tr>
						<td>xxx4500</td>
						<td>USD</td>
						<td>600</td>
						<td>610</td>
						<td><select /></td>
					</tr>

				</tbody>
				<tfoot>
					<tr>
						<td colspan="5">Totales</td>
					</tr>
				</tfoot>
			</table>
		</div>
	</div>
	<div class="row">
		<div class="col-xs-12">
			<span>"Saldo actual" es el saldo después de todas las
				transacciones contabilizadas al final del día hábil anterior. "Saldo
				disponible" es el "saldo actual" + depósitos de hoy - se retira
				pendientes - los fondos en espera. Fondos en espera suelen estar
				relacionados con los cheques depositados que no han 'liberados'.</span>
		</div>
	</div>

	<%@ include file="/WEB-INF/jsp/common/footer.jsp"%>