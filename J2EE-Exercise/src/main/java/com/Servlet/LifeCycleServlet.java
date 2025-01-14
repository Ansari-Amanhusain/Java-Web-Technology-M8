package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/LifeCycleServlet")
public class LifeCycleServlet extends HttpServlet 
{

    @Override
    public void init() throws ServletException 
    {
        // Log a message when the servlet is initialized
        System.out.println("Servlet is being initialized.");
    }

    @Override
    protected void doGet(javax.servlet.http.HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        // Log a message when the doGet method is called
        System.out.println("doGet method is called.");

        // Set response content type
        response.setContentType("text/html");

        try (PrintWriter out = response.getWriter()) {
            out.println("<html>");
            out.println("<head><title>Lifecycle Logger</title></head>");
            out.println("<body>");
            out.println("<h1>GET Request Handled</h1>");
            out.println("<p>This response is generated by the doGet method.</p>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doPost(javax.servlet.http.HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        System.out.println("doPost method is called.");
        response.setContentType("text/html");

        try (PrintWriter out = response.getWriter()) 
        {
            out.println("<html>");
            out.println("<head><title>Lifecycle Logger</title></head>");
            out.println("<body>");
            out.println("<h1>POST Request Handled</h1>");
            out.println("<p>This response is generated by the doPost method.</p>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    public void destroy() 
    {
        System.out.println("Servlet is being destroyed.");
    }
}
