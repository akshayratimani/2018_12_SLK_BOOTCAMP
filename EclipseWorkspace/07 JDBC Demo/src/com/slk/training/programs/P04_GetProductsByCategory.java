package com.slk.training.programs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.slk.training.utils.DbUtil;
import com.slk.training.utils.KeyboardUtil;

public class P04_GetProductsByCategory {
	
	public static void main(String[] args) {
		
		int id;
		String name, category = KeyboardUtil.getString("Enter category: ");
		double price;
		
		String sql = "select * from products where category=?";
		
		try(
				Connection conn = DbUtil.newConnection();
				PreparedStatement stmt = conn.prepareStatement(sql);
		) {
			stmt.setString(1, category);
			ResultSet rs = stmt.executeQuery();
			
			if(rs.next()) {
				do {
					id = rs.getInt(1); // rs.getInt("id");
					name = rs.getString("name"); // rs.getString(2);
					price = rs.getDouble("price");
					System.out.println("Id     : " + id);
					System.out.println("Name   : " + name);
					System.out.println("Price  : Rs." + price);
					System.out.println();
					
				} while(rs.next());
			}
			else {
				System.out.println("No products found for category: " + category);
			}
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}

}





