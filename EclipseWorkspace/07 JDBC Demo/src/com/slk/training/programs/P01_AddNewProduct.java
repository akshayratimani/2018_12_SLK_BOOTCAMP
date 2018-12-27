package com.slk.training.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class P01_AddNewProduct {

	public static void main(String[] args) throws Exception {
		
		String driver = "org.h2.Driver";
		String url = "jdbc:h2:tcp://localhost/~/slk_training_2018_12";
		String username = "sa";
		String password = "";
		
		// for MySQL: 
		// driver = "com.mysql.jdbc.Driver";
		// url = "jdbc:mysql://localhost/slk_training_2018_12";
		// username = "root";
		// password = "root";
		
		// STEP 1: Register a driver instance with DriverManager
		Class.forName(driver);
		// The "Class.forName(..)" is used for loading a class into JVM.
		// When the driver class is loaded in to the JVM, it will create an instance
		// of the same class and will register it with the DriverManager.
		
		// STEP 2: Get a connection using the factory method DriverManager.getConnection(..)
		Connection conn = DriverManager.getConnection(url, username, password);
		
		// System.out.println("Got a connection of type: " + conn.getClass());
		String sql = "insert into products values(5, 'Sony 40inch LED TV', 'Television', 56000)";
		
		Statement stmt = conn.createStatement();
		stmt.execute(sql);
		
		stmt.close();
		conn.close();
		System.out.println("Data inserted successfully!");
	}
}






