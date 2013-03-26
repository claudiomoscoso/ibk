<%@page import="cl.buildersoft.framework.util.BSDateTimeUtil"%>
<%@page import="cl.buildersoft.ibk.bean.Antiphishing"%>
<%@page import="cl.buildersoft.ibk.bean.User"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<%
	User user = (User) request.getSession(false).getAttribute("User");
	Antiphishing antiphishing = (Antiphishing) request.getAttribute("Antiphishing");
%>

<table border="0">
	<tr>
		<td rowspan="4"><img
			src="data:image/png;base64,<%=antiphishing.getImage()%>" /></td>
	</tr>

	<tr>
		<td>Nombre:</td>
		<td><%=user.getName()%></td>
	</tr>
	<tr>
		<td>Último acceso válido:</td>
		<td><%=BSDateTimeUtil.date2LongString(BSDateTimeUtil.calendar2Date(user.getLastLoginSuccess()))%></td>
	</tr>
	<tr>
		<td>Último acceso invalido:</td>
		<td><%=BSDateTimeUtil.date2LongString(BSDateTimeUtil.calendar2Date(user.getLastLoginUnsuccess()))%></td>
	</tr>

</table>
