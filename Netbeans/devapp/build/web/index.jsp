<%-- 
    Document   : index
    Created on : 2016-jun-28, 12:16:39
    Author     : elev4
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hello world (JSP Page)</title>
        <link href="resources/css/bootstrap.min.css" rel="stylesheet" type="text/css">
        <link href="resources/css/bootstrap-navbar.css" rel="stylesheet" type="text/css">
        <link href="resources/css/carousel.css" rel="stylesheet" type="text/css">
    </head>
    <body>
    <%@include file="header.jsp"%>
    <div class="container">
        <div class="row"><div class="col-md-12"><br><br><br></div></div>
        <div class="row">
            <div class="col-md-4">
            <h1>Hello World (JSP Page)! </h1>
            <form action="LoginController" method="post" class="navbar-form navbar-right">
            <div class="form-group">
                <input name="username" type="text" placeholder="Email" class="form-control">
            </div>
            <div class="form-group">
              <input name="password" type="password" placeholder="Password" class="form-control">
            </div>
            <br><br>
            <button type="submit" class="btn btn-success">Sign in</button>
            </form>
    </div>
    </div> 
    <%@include file="footer.jsp"%>
    </div>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script src="resources/js/bootstrap.min.js"></script>
    </body>
</html>
