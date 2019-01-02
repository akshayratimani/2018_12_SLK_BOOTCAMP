package com.slk.training.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.slk.training.entity.Person;

@WebServlet("/DisplayPersonsServlet")
public class DisplayPersonsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setAttribute("title", "Welcome to JSTL Demo"); // string
		request.setAttribute("p1", new Person("Vinod", "Kumar", "Bangalore")); // object
		
		List<String> names = new ArrayList<>();
		names.add("John");
		names.add("Miller");
		names.add("Smith");
		request.setAttribute("names", names); // list of strings
		
		
		List<Person> people = Arrays.asList(
				new Person("Ramesh", "Iyer", "Chennai"),
				new Person("Raj", "Kumar", "Bangalore"),
				new Person("Kishore", "Kumar", "Mumbai"),
				new Person("Chandra", "Shekhar", "Mangalore"));
		request.setAttribute("people", people); // list of objects
		
		request.getRequestDispatcher("/show.jsp").forward(request, response);
		
	}

}
