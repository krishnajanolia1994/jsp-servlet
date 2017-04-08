<%-- 
    Document   : video
    Created on : Apr 8, 2017, 10:52:32 AM
    Author     : student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>video page </title>
    </head>
    <body>
        <%
            if(session.getAttribute("uname")==null)
            {
                response.sendRedirect("index.html");
            }
        %>
        <h1>video page </h1>
        <a href="https://www.youtube.com/watch?v=TUWhcKiBb8k">tom and jerry</a>
        <form action="logout">
            <input type="submit" value="logout">
        </form>
    </body>
</html>
