package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class ConfiguredServlet extends HttpServlet 
{

    @Override
    protected void doGet(javax.servlet.http.HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        response.setContentType("text/html");

        try (PrintWriter out = response.getWriter()) 
        {
            out.println("<html>");
            out.println("<head><title>Configured Servlet</title></head>");
            out.println("<body>");
            out.println("<h1>Hello from Configured Servlet</h1>");
            out.println("<p>This servlet is configured via web.xml.</p>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}

