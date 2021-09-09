package com.ritik.config;

import java.sql.Connection;
import java.sql.DriverManager;

public class MysqlConnection {
	private static String url = "jdbc:mysql://localhost:3306/myservletdatabase";
	private static String username = "root";
	private static String password = "1234";
	public static Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, username, password);
			return connection; 
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
}
