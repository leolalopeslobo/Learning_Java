<%-- 
    Document   : index.jsp
    Created on : Jul 15, 2023, 8:44:07 PM
    Author     : leola
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>  <%-- page directive --%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello! Welcome to JSP</h1>
        
        <%-- Expression --%>
        <h1 style="color:maroon">Today is: <%=new java.util.Date() %> </h1> <%-- no need to give semi-colon since this owuld be part of the println statement and there we don't give a semi-colon --%>
        
        
        <%-- Scriptlet --%>
        <% String name = request.getParameter("uname");%>
        <br>
        <h1><%= "Hello Mr./Ms. "+name %></h1>
        
        
        <%-- Declaration --%>
        <%! int x=123,y=321; %>
        <h2>Addition of 2 nums = <%= x+y %></h2>
        
        <%-- Declaration - method --%>
        <%! int cube(int n) {
            return n*n*n;
        } %>
        <h1>Cube of 25 = <%= cube(25) %></h1>
    </body>
</html>
