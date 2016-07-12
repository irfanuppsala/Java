<%-- 
    Document   : main
    Created on : 2016-jul-11, 14:07:55
    Author     : elev4
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="springform"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <springform:form method="post" action="HelloSpring/createUser" commandName="user">
        Email:
        <spring:bind path="user.email">
            <input type="text" name="${status.expression}" value="${status.value}" id="email"> 
        </spring:bind>
        Password:
        <spring:bind path="user.password">
            <input type="password" name="${status.expression}" value="${status.value}" id="password"> 
        </spring:bind>
        
        <button type="submit">Submit</button>
    </springform:form>
    </body>
</html>
