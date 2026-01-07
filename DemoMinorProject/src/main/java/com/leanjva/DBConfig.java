package com.leanjva;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConfig {
	private static final String url = "jdbc:mysql://localhost:3306/users";
	private static final String username = "root";
	private static final String pass = "Rane@14092005";
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection(url,username,pass);
	}
}
