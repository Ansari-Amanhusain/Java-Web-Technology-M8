package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ParameterHandlingServlet")
public class ParameterHandlingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ParameterHandlingServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		  response.setContentType("text/html");

	        // Get parameters from the request
	        String name = request.getParameter("name");
	        String age = request.getParameter("age");

	        // Generate response HTML
	        try (PrintWriter out = response.getWriter()) {
	            out.println("<html>");
	            out.println("<head><title>Parameter Handling</title></head>");
	            out.println("<body>");
	            out.println("<h1>Response</h1>");

	            if (name != null && age != null) {
	                out.println("<p><strong>Name:</strong> " + name + "</p>");
	                out.println("<p><strong>Age:</strong> " + age + "</p>");
	            } else {
	                out.println("<p>Missing parameters! Please provide both name and age.</p>");
	            }

	            out.println("</body>");
	            out.println("</html>");
	        }
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}

}
