<%-- 
    Document   : firstjsp
    Created on : Jul 15, 2023, 9:28:02 PM
    Author     : leola
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>This is JSP</h1>
        <% response.sendRedirect("https://www.zktutorials.com"); %> <!-- using response object -->
    </body>
</html>
