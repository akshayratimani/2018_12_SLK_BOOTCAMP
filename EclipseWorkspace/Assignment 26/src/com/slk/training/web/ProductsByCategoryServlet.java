package com.slk.training.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ProductsByCategoryServlet")
public class ProductsByCategoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private Connection conn;
	private PreparedStatement stmt;
	private ResultSet rs;

	@Override
	public void init() throws ServletException {
		try {
			String url = "jdbc:h2:tcp://localhost/~/slk_training_2018_12";
			String user = "sa";
			String password = "";
			String driver = "org.h2.Driver";
			String sql = "select * from products where category = ?";

			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.prepareStatement(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void destroy() {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		try {
			
			String cat = request.getParameter("category");
			if (cat == null) {
				cat = "";
			}
			
			stmt.setString(1, cat);
			rs = stmt.executeQuery();
			
			if(rs.next()) {
				out.printf("<h3>Products in the category\"%s\" are: ", cat);
				out.println("<table border='1'>");
				
				out.println("<thead><tr>");
				out.println("<th>Id</th>");
				out.println("<th>Product name</th>");
				out.println("<th>Price</th>");
				out.println("</tr></thead>");
				out.println("<tbody>");
				
				do {
					int id = rs.getInt("id");
					String name = rs.getString("name");
					double price = rs.getDouble("price");
					
					out.println("<tr>");
					out.printf("<td>%d</td>", id);
					out.printf("<td>%s</td>", name);
					out.printf("<td>Rs. %.2f</td>", price);
					out.println("</tr>");
				} while(rs.next());
				
				out.println("</tbody></table>");
			}
			else {
				out.printf("<h3>No data found for category \"%s\"!</h3>" ,cat);
			}
			rs.close();
			
		} catch (Exception e) {
			out.println("<p>There was an error</p>");
			out.println("<pre>");
			e.printStackTrace(out);
			out.println("</pre>");
		}
		
		out.println("<a href='./'>Try again</a>");
		out.close();

	}

}
