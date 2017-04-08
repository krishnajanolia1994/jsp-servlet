<%-- 
    Document   : welcom
    Created on : Apr 8, 2017, 10:52:10 AM
    Author     : student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>well come</title>
    </head>
    <body>
        <%
            if(session.getAttribute("uname")==null)
            {
                response.sendRedirect("index.html");
            }
        %>
        <h1>well come page</h1>
        <a href="video.jsp">video</a>
        <form action="logout">
            <input type="submit" value="logout">
        </form>
    </body>
</html>
