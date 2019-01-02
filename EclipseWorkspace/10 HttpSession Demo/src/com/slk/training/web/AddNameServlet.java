package com.slk.training.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/add-name")
public class AddNameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// For GET requests, render the form
		request.getRequestDispatcher("/WEB-INF/pages/name-form.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");
		// session scope
		HttpSession session = request.getSession();
		
		// application scope
		// this method is inherited from GenericServlet
		ServletContext ctx = getServletContext(); 
		
		// for testing purposes, let's log some information about the session
		System.out.println("session.isNew() = " + session.isNew());
		System.out.println("session.getId() = " + session.getId());
		System.out.println();

		List<String> namesList = (List<String>) session.getAttribute("names");
		List<String> namesList2 = (List<String>) ctx.getAttribute("names");
		
		if (namesList == null) {
			namesList = new ArrayList<String>();
			session.setAttribute("names", namesList);
		} 
		
		if (namesList2 == null) {
			namesList2 = new ArrayList<String>();
			ctx.setAttribute("names", namesList2);
		}

		namesList.add(name);
		namesList2.add(name);
		response.sendRedirect("./");
	}

}
