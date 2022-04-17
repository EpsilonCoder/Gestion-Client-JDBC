package com.agence.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
	private static final String DRIVER_PATH = "com.mysql.cj.jdbc.Driver";
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/jdbc";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "";

	public DB() {
		try {
			Class.forName(DRIVER_PATH);
		} catch (Exception e) {
			throw new RuntimeException("Attention quelque chose c'est male passé " +e);
		}
	}

	public Connection getConnection() throws Exception {
		return DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);

	}

}
