package com.slk.training.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns="/hello", loadOnStartup=1) // maps a url path "/hello" to this servlet object
public class HelloServlet implements Servlet {
	
	private ServletConfig config;
	
	public HelloServlet() {
		System.out.println("HelloServlet instantiated!");
	}

	@Override
	public void destroy() {
		System.out.println("HelloServlet.destroy() called");
	}

	@Override
	public ServletConfig getServletConfig() {
		return this.config;
	}

	@Override
	public String getServletInfo() {
		return "HelloServlet created by Vinod";
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		this.config = config;
		System.out.println("HelloServlet.init() called");
	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("Got a request from some client");
		
		// get an output stream to write on the response
		PrintWriter out = response.getWriter();
		out.println("<h1>Hello from Servlet</h1><hr/>");
		out.close();
		
	}

}









