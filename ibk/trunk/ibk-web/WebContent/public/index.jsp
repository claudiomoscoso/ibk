<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>
	<form
		action="${pageContext.request.contextPath}/servlet/login/Validate"
		method="post">
		Usuario: <input type="text" name="user"><br> Clave: <input
			type="password" name="password"> <br> <input
			type="submit">
	</form>
</body>
</html>