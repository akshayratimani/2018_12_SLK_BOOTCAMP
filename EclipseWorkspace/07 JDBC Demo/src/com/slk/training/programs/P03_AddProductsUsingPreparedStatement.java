package com.slk.training.programs;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.slk.training.utils.DbUtil;
import com.slk.training.utils.KeyboardUtil;

public class P03_AddProductsUsingPreparedStatement {

	public static void main(String[] args) {
		int id;
		String name, category;
		double price;
		
		String sql = "insert into products values(?,?,?,?)";
		
		try(
			Connection conn = DbUtil.newConnection();
			// conn.prepareStatement(sql) sends the SQL command, which
			// gets pre-compiled and cached in the RDBMS server for later use
			PreparedStatement stmt = conn.prepareStatement(sql);
		) {
			
			while(true) {
				id = KeyboardUtil.getInt("Enter id: ");
				name = KeyboardUtil.getString("Enter name: ");
				category = KeyboardUtil.getString("Enter category: ");
				price = KeyboardUtil.getDouble("Enter price: ");
				
				stmt.setInt(1, id);
				stmt.setString(2, name);
				stmt.setString(3, category);
				stmt.setDouble(4, price);
				
				// stmt.executeUpdate() sends the parameters to the RDBMS 
				// which will be used by the pre-compiled SQL command, 
				// cached in the RDBMS server.
				stmt.executeUpdate(); // use executeUpdate for INSERT/UPDATE/DELETE
				System.out.println("Data inserted successfully!");
				
				String choice = KeyboardUtil.getString("Do you want to add another? yes/no (yes): ");
				if(choice.equalsIgnoreCase("no")) {
					break;
				}
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
		
	}
}






