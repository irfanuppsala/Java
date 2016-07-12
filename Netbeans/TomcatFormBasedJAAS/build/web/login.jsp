<%-- 
    Document   : login
    Created on : 2016-jun-30, 10:21:22
    Author     : elev4
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 
	<form method=post action="j_security_check">
		<p>
			<span>Username:</span> <br /> <input type="text" name="j_username">
		</p>
		<p>
			<span>Password:</span> <br /> <input type="password"
				name="j_password">
		</p>
		<p>
			<input type="submit" value="Login">
		</p>
	</form>
 
 
</body>
</html>
