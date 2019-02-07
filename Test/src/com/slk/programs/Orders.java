package com.slk.programs;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.slk.dao.Manager;
import com.slk.entity.OrdersClass;

@WebServlet("/Orders")
public class Orders extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		OrdersClass obj[];
		Manager m = new Manager();
		obj=m.displayOrders();
		
		
		request.setAttribute("orders", obj);

		RequestDispatcher rd = request.getRequestDispatcher("./WEB-INF/classes/OrdersHomePage.jsp");
		rd.forward(request, response);
	}
}
