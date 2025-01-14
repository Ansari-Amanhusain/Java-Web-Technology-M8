package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CGIServlet")
public class CGIServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public CGIServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		   response.setContentType("text/html");

	        // Retrieve form parameters
	        String name = request.getParameter("name");
	        String email = request.getParameter("email");

	        // Generate response HTML
	        try (PrintWriter out = response.getWriter()) 
	        {
	            out.println("<html>");
	            out.println("<head><title>Form Response</title></head>");
	            out.println("<body>");
	            out.println("<h1>User Input</h1>");

	            if (name != null && email != null) 
	            {
	                out.println("<p><strong>Name:</strong> " + name + "</p>");
	                out.println("<p><strong>Email:</strong> " + email + "</p>");
	            } 
	            else 
	            {
	                out.println("<p>Error: Missing input values!</p>");
	            }

	            out.println("</body>");
	            out.println("</html>");
	        }
	}

}
