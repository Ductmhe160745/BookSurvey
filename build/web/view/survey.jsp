<%-- 
    Document   : survey
    Created on : Feb 20, 2024, 5:11:57 PM
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

        <h1>Bookstore Survey</h1>

        <%
          String message = (String)request.getAttribute("message");
          if(request.getAttribute("message") != null) {
           out.println("<h5>" + message +"</h5>");
           }
        %>
        <form action="survey" method="post">
            First name: <input type="text" name="first"/>
            Last name: <input type="text" name="last"/></br>
            Email Address: <input type="email" name="email"/>
            Address: <input type="text" name="address"/></br>
            City: <input type="text" name="city"/>
            Country: <input type="text" name="country"/>
            Zip: <input type="number" name="zip"/></br>
            Have purchased books in campus bookstore?
            <input type="radio" name="bookstore" value="0"/>Yes
            <input type="radio" name="bookstore" value="1"/>No</br>
            which bookstore do you shop in?
            <select name ="op">
                <option>Goodwill Store</option>
                <option>Good Store</option>
                <option>Sun Store</option>
            </select></br>
            Have you ever purchased books on the internet?
            <input type="radio" name="internet" checked value="0"/>Yes
            <input type="radio" name="internet" value="1"/>No</br>         
            How does shopping on the internet compared to shopping in a campus bookstore?</br>
            <textarea rows="9" cols="70" name="comment"> 
            </textarea>
            <input type="submit" value="SEND"/>
        </form>
        <a  style="display: block; color: black"href="logout">LOGOUT</a>
    </body>
</html>
