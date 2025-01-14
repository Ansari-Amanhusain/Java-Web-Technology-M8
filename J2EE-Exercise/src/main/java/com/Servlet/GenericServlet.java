package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


@SuppressWarnings("serial")
@WebServlet("/GenericServlet")
public class GenericServlet extends javax.servlet.GenericServlet 
{

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException 
    {
        response.setContentType("text/html");

        try (PrintWriter out = response.getWriter()) 
        {
            out.println("<html>");
            out.println("<head><title>GenericServlet Example</title></head>");
            out.println("<body>");
            out.println("<h1>Hello from GenericServlet</h1>");
            out.println("<p>This servlet uses the GenericServlet class.</p>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
