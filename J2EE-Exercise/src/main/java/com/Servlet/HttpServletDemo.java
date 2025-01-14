package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@javax.servlet.annotation.WebServlet("/HttpServletDemo")
public class HttpServletDemo extends HttpServlet 
{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        response.setContentType("text/html");

        try (PrintWriter out = response.getWriter()) 
        {
            out.println("<html>");
            out.println("<head><title>HttpServlet Example</title></head>");
            out.println("<body>");
            out.println("<h1>Hello from HttpServlet</h1>");
            out.println("<p>This servlet uses the HttpServlet class and handles HTTP-specific methods like GET and POST.</p>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}