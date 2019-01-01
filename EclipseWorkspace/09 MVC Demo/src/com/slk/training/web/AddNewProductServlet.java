package com.slk.training.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.slk.training.dao.ProductsManager;
import com.slk.training.entity.Product;

@WebServlet({ "/AddNewProductServlet", "/add-new-product" })
public class AddNewProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// render the HTML form to the user for adding new product
		request.getRequestDispatcher("/WEB-INF/pages/product-form.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// handles the form submitted by the user

		// 1: read the inputs from the request (if any)
		String input;
		Product p = new Product();
		input = request.getParameter("id");
		p.setId(Integer.parseInt(input));
		input = request.getParameter("name");
		p.setName(input);
		input = request.getParameter("category");
		p.setCategory(input);
		input = request.getParameter("price");
		p.setPrice(Double.parseDouble(input));

		// 2: call the model function to do the task
		ProductsManager pm = new ProductsManager();
		pm.addNewProduct(p);

		// 3: store the model data in a scope (if any)

		// 4: navigate to a view (server-side forward or client-side redirection)
		// client-side redirection
		response.sendRedirect("./get-all-products");
	}

}
