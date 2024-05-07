<%-- 
    Document   : home
    Created on : Feb 20, 2024, 9:23:56 PM
    Author     : tranm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="model.Survey"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            List<Survey> list = (List<Survey>)request.getAttribute("data");
            if(list == null) {
                out.println("<h1>No survey</h1>");
            } else {
                int i = 0;
                for(Survey s : list) {
                out.println("<h1>Details Entered " + (++i) +": </h1>");
                out.println("<span>Full Name: " + s.getFirstName() + " " + s.getLastName() + "</span></br>");
                out.println("<span>Email: " + s.getEmial() + "</span></br>");
                out.println("<span>Address: " + s.getAddress() + "</span></br>");
                out.println("<span>City: " + s.getCitty() + "</span></br>");
                out.println("<span>Country: " + s.getCountry() + "</span></br>");
                out.println("<span>Zip: " + s.getZip() + "</span></br>");
                out.println("<span>Have purchased books in campus bookstore?: " + s.getBookStore() + "</span></br>");
                out.println("<span>which bookstore do you shop in?: " + s.getShopIn() + "</span></br>");
                out.println("<span> Have you ever purchased books on the internet?: " + s.getShopOnline() + "</span></br>");
                out.println("<span>Comment: " + s.getComment() + "</span></br>");
                }
            }
            
        %>
        </br>
        </br>

        <a  style="display: block; color: black"href="logout">LOGOUT</a>

    </body>
</html>
