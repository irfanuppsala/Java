<%-- 
    Document   : success
    Created on : 2016-jun-29, 13:25:02
    Author     : elev4
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<title>Insert title here</title>
</head>
<body>
 
	Welcome ${requestScope['user'].username}. 
 
</body>
</html>
