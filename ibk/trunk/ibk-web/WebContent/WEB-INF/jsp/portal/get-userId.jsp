<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="cl.buildersoft.framework.util.BSWeb"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<META HTTP-EQUIV="expires" CONTENT="Wed, 26 Feb 2004 08:21:57 GMT">

<title>Login</title>
</head>
<body>
	<form
		action="${pageContext.request.contextPath}/servlet/login/ValidateUser?<%=BSWeb.randomString() %>"
		method="post">
		Usuario: <input type="text" name="user">  <input
			type="submit">
	</form>
</body>
</html>