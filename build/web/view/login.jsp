<%-- 
    Document   : login
    Created on : Feb 20, 2024, 5:08:41 PM
    Author     : tranm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h4 style="color: red">${requestScope.error}</h4>
        <form action="login" method="post">
            Username:<input type="text" name="username"/></br>
            Password:<input type="text" name="password"/></br>
            <input type="submit" value="Login"/>
        </form>
    </body>
</html>
