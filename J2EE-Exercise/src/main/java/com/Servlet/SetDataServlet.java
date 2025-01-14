package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SetDataServlet
 */
@WebServlet("/SetDataServlet")
public class SetDataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public SetDataServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        // Get the ServletContext
        ServletContext context = getServletContext();

        // Set some data in the ServletContext
        context.setAttribute("sharedData", "This is shared data across multiple servlets.");

        // Send a response to indicate data has been set
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h2>Data has been set in the ServletContext.</h2>");
        out.println("<a href='GetDataServlet'>Go to GetDataServlet</a>");
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}

}
