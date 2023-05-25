package com.servlet;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Second_Program extends GenericServlet{

	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Generic service method call");
		
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		out.println("Welcome to Generic Server");
		out.println("Today "+ new Date().toString());
		
				
	}
}
