/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.*;

public class GenServlet extends GenericServlet {

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        
        //business logic
        
        //used to construct a response
        res.setContentType("text/html"); //this means the response will have text and html
        PrintWriter out = res.getWriter();
        
        out.println("<h1>It's a Generic Servlet...not an HTTP Servlet</h1>");
        
        
        
    }

   
}
