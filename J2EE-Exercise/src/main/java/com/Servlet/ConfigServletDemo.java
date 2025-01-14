package com.Servlet;

import javax.servlet.Servlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.ServletConfig;

public class ConfigServletDemo implements Servlet
{
	private ServletConfig config;
	// web container will call this 
	// method by passing ServletConfig 
	public void init(ServletConfig config)
	{
		this.config=config;
	}

	public void service(ServletRequest request, ServletResponse response)
	{
		// pass <param-name> to get <param-value>
		String firstname=config.getInitParameter("fistname"); // xyz
		String lastname=config.getInitParameter("lastname"); // welcome@123
		System.out.println(firstname);
		System.out.println(lastname);

	}

	public void destroy()
	{

	}

	public ServletConfig getServletConfig()
	{
		return config;
	}

	public String getServletInfo()
	{
		return this.getClass().getName();
	}

}

