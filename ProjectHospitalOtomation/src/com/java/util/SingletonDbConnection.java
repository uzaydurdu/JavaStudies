package com.java.util;

import java.sql.Connection;
import java.sql.SQLException;

public class SingletonDbConnection {

	private Connection connection;
	private String url = "jbdc:oracle://localhost:3307/hospital_otomation";
	private String user = "root";
	private String password = "root";
	public int count = 0;

	public Connection connectionMethod() {
		
		try {
			if(connection==null || connection.isClosed()) {

				try {
					Class.forName("com.oracle.jdbc.Driver");
					System.err.println("Driver was uploaded successfully.");
					connection DriverManager.getConnection(url, user, password);
					System.err.println("Connection is successful.");
					count++;
					System.out.println(count + " Number of connected");
				} catch (ClassNotFoundException | SQLException e) {
					e.printStackTrace();
				}
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return connection;
	}
}
