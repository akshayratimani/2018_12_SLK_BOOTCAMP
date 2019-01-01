package com.slk.training.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.slk.training.entity.Product;

public class ProductsManager {

	private Connection openConnection() throws ClassNotFoundException, SQLException {
		Class.forName("org.h2.Driver");
		String url = "jdbc:h2:tcp://localhost/~/slk_training_2018_12";
		String user = "sa";
		String password = "";
		return DriverManager.getConnection(url, user, password);
	}

	public Product getProductById(int id) {
		try (Connection conn = openConnection();
				PreparedStatement stmt = conn.prepareStatement("select * from products where id = ?");

		) {
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				Product p = new Product();
				p.setId(rs.getInt("id"));
				p.setName(rs.getString("name"));
				p.setCategory(rs.getString("category"));
				p.setPrice(rs.getDouble("price"));
				return p;
			}
		} catch (Exception ex) {
			ex.printStackTrace(); // this is wrong! should propagate the exceptions to the UI layer
		}
		return null;
	}

	public List<Product> getAllProducts() {
		List<Product> list = new ArrayList<>();
		try (Connection conn = openConnection();
				PreparedStatement stmt = conn.prepareStatement("select * from products");
				ResultSet rs = stmt.executeQuery();) {
			while (rs.next()) {
				Product p = new Product();
				p.setId(rs.getInt("id"));
				p.setName(rs.getString("name"));
				p.setCategory(rs.getString("category"));
				p.setPrice(rs.getDouble("price"));
				list.add(p);
			}
		} catch (Exception ex) {
			ex.printStackTrace(); // this is wrong! should propagate the exceptions to the UI layer
		}
		return list;
	}

	public void addNewProduct(Product p) {
		String sql = "insert into products values(?, ?, ?, ?)";
		try (Connection conn = openConnection(); PreparedStatement stmt = conn.prepareStatement(sql);) {
			stmt.setInt(1, p.getId());
			stmt.setString(2, p.getName());
			stmt.setString(3, p.getCategory());
			stmt.setDouble(4, p.getPrice());
			stmt.executeUpdate(); // use this function for DML
		} catch (Exception ex) {
			// this is wrong; exceptions must be propagated to the presentation layer
			// to be done later
			ex.printStackTrace();
		}
	}

	public void updateProduct(Product p) {
		String sql = "update products set name=?, category=?, price=? where id=?";
		try (Connection conn = openConnection(); PreparedStatement stmt = conn.prepareStatement(sql);) {
			stmt.setString(1, p.getName());
			stmt.setString(2, p.getCategory());
			stmt.setDouble(3, p.getPrice());
			stmt.setInt(4, p.getId());
			stmt.executeUpdate(); // use this function for DML
		} catch (Exception ex) {
			// this is wrong; exceptions must be propagated to the presentation layer
			// to be done later
			ex.printStackTrace();
		}
	}

	public void deleteProduct(int id) {
		String sql = "delete from products where id=?";
		try (Connection conn = openConnection(); PreparedStatement stmt = conn.prepareStatement(sql);) {
			stmt.setInt(1, id);
			stmt.executeUpdate(); // use this function for DML
		} catch (Exception ex) {
			// this is wrong; exceptions must be propagated to the presentation layer
			// to be done later
			ex.printStackTrace();
		}
	}
}
