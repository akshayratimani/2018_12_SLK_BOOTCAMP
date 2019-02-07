package com.slk.programs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.slk.dao.ShowProductsManager;
import com.slk.entity.Products;

@WebServlet("/AddToCart")
public class AddToCart extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String a = (String) request.getParameter("id");
		
		
		ShowProductsManager ob = new ShowProductsManager();
		Products p = ob.getProductById(Integer.parseInt(a));
		
		ob.AddToCart(Integer.parseInt(a));
		
		
		response.sendRedirect("./ShowProducts");
	}



}
