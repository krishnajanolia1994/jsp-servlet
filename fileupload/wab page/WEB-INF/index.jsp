
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World! this is my first maven project</h1>
        <form action="submit_file" method="post" enctype="multipart/form-data">
            <input type="file" name="file" multiple>
            <input type="submit" value="submit">
        </form>   
    </body>
</html>
