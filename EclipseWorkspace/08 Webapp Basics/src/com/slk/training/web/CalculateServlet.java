package com.slk.training.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalculateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String input;
		input = req.getParameter("num1");
		double n1 = Double.parseDouble(input);
		input = req.getParameter("num2");
		double n2 = Double.parseDouble(input);
		input = req.getParameter("operation");

		String result = "";
		switch (input) { // operation
		case "add":
			result = String.format("%.2f + %.2f = %.2f", n1, n2, n1 + n2);
			break;
		case "sub":
			result = String.format("%.2f - %.2f = %.2f", n1, n2, n1 - n2);
			break;
		case "mul":
			result = String.format("%.2f X %.2f = %.2f", n1, n2, n1 * n2);
			break;
		case "div":
			result = String.format("%.2f / %.2f = %.2f", n1, n2, n1 / n2);
		}
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		RequestDispatcher rd = req.getRequestDispatcher("home.html");
		
		rd.include(req, resp);
		out.println("<h3>"+result+"</h3>");
		out.close();
		
	}

}







