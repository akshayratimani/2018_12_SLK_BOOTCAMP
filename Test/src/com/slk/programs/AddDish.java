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
import com.sun.org.apache.xerces.internal.parsers.IntegratedParserConfiguration;

@WebServlet("/AddDish")
public class AddDish extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("./WEB-INF/classes/AddDish.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int tno = Integer.parseInt(request.getParameter("tn"));
		String dish = request.getParameter("dish");
		
		
		OrdersClass obj = new OrdersClass();
		
		obj.setTableNumber(tno);
		obj.setDish(dish);
		
		Manager ob = new Manager();
		ob.addOrder(obj);
		
		
		RequestDispatcher rd = request.getRequestDispatcher("./WEB-INF/classes/AddDish.jsp");
		rd.forward(request, response);
		

	}

}
