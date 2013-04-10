<%@page import="cl.buildersoft.ibk.bean.business.Bank"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<%
	Bank bank = (Bank) request.getSession(false).getAttribute("Bank");
%>

<table border="0">
	<tr>
		<td><img src="data:image/png;base64,<%=bank.getLogo()%>" /></td>
		<td valign="center"><%=bank.getName()%></td>
	</tr>
</table>
