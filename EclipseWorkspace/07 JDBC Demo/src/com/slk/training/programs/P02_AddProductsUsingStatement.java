package com.slk.training.programs;

import java.sql.Connection;
import java.sql.Statement;

import com.slk.training.utils.DbUtil;
import com.slk.training.utils.KeyboardUtil;

public class P02_AddProductsUsingStatement {

	public static void main(String[] args) {
		int id;
		String name, category;
		double price;
		
		try(
			Connection conn = DbUtil.newConnection();
			Statement stmt = conn.createStatement();
		) {
			
			while(true) {
				id = KeyboardUtil.getInt("Enter id: ");
				name = KeyboardUtil.getString("Enter name: ");
				category = KeyboardUtil.getString("Enter category: ");
				price = KeyboardUtil.getDouble("Enter price: ");
				
				String sql = String.format("insert into products values(%d, '%s', '%s', %f)", 
						id, name, category, price);
				stmt.executeUpdate(sql); // use executeUpdate for INSERT/UPDATE/DELETE
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






