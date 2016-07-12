<%-- 
    Document   : protected
    Created on : 2016-jun-30, 10:19:32
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
 
Hello <%= request.getUserPrincipal().getName().toString() %>
You are able to view this page because you are authenticated user.
 
</body>
</html>
