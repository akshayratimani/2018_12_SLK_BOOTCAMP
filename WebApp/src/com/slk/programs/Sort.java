package com.slk.programs;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.slk.dao.ShowProductsManager;
import com.slk.entity.Products;

@WebServlet("/Sort")
public class Sort extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String n = request.getParameter("sort");
		
		System.out.println("N2:"+n);
		ShowProductsManager obj = new ShowProductsManager();
		List<Products> li = null;
		if(n.equals("name")){
			 li = obj.SortByName();
		}
		else if(n.equals("price")) {
			 li = obj.SortByPrice();
		}
		else if(n.equals("rating")) {
			 li = obj.SortByRating();
		}
		
		request.setAttribute("li", li);
		
		request.getRequestDispatcher("./WEB-INF/pages/Sort.jsp").forward(request, response);
	}

}
