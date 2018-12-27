package com.slk.training.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public final class DbUtil {

	private DbUtil() {
	}
	
	public static Connection newConnection() throws ClassNotFoundException, SQLException {
		ResourceBundle rb = ResourceBundle.getBundle("com.slk.training.utils.jdbc-info");
		String driver = rb.getString("jdbc.driver");
		String url = rb.getString("jdbc.url");
		String username = rb.getString("jdbc.username");
		String password = rb.getString("jdbc.password");
		Class.forName(driver);
		return DriverManager.getConnection(url, username, password);
	}
}
