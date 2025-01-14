package com.Servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;

@SuppressWarnings("serial")
@WebServlet("/GetDataServlet")
public class GetDataServlet extends HttpServlet 
{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        // Get the ServletContext
        ServletContext context = getServletContext();

        // Retrieve the shared data from the ServletContext
        String sharedData = (String) context.getAttribute("sharedData");

        // Send the data as a response
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h2>Shared Data: " + sharedData + "</h2>");
    }
}
