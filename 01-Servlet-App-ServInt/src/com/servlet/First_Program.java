package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class First_Program implements Servlet {

	
	ServletConfig con;

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init method call");
		con=arg0;
		
	}

	
	
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("service method call");
		arg1.setContentType("text/html");
		PrintWriter out=arg1.getWriter();
		out.println("Welcome to Server");
		out.println("Today "+ new Date().toString());
		
		System.out.println(getServletConfig());
		System.out.println(getServletInfo());
		
		
	}
	
	
	
	@Override
	public void destroy() {
		System.out.println("destroy method call");

		
	}
	
	
	
	

	
	@Override
	public ServletConfig getServletConfig() {
		
	
		return con;
	}

	@Override
	public String getServletInfo() {
		
		return "My first Servlet Program";
	}


}
