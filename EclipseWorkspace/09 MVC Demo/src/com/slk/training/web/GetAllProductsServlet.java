package com.slk.training.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.slk.training.dao.ProductsManager;
import com.slk.training.entity.Product;

@WebServlet({ "/GetAllProductsServlet", "/get-all-products" })
public class GetAllProductsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		// step1: read all the inputs from the request (if any)
		
		// step2: invoke model functions to get data for the output
		ProductsManager pm = new ProductsManager();
		List<Product> list = pm.getAllProducts();
		
		// step3: store the model data in a common place (scope), so that JSP can access
		// The "request" object is like a Map, that can contain key/value pairs
		// The other possible scopes are "session" (of type HttpSession), and 
		// "application" (of type ServletContext)
		request.setAttribute("products", list);
		
		// step4: forward the request to the appropriate view (JSP)
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/pages/show-products.jsp");
		rd.forward(request, response);
	}

}
