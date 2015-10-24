package com.parking.util;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.MySQLConnection;

import com.mysql.jdbc.Connection;

public class DALUtil {

	private static Connection connection = null;
	private static String URL = "jdbc:mysql://127.0.0.1:3306/VirtualQueue";
	private static String USER = "root";
	private static String PASSWORD = "ok";
	private static String DRIVER = "com.mysql.jdbc.Driver";

	public static Connection getConnection() {

		if (connection != null) {
			try {
				if (!connection.isClosed())
					return connection;

			} catch (SQLException e1) {

				e1.printStackTrace();
			}
		}

		try {

			Class.forName(DRIVER);

			connection = (MySQLConnection) DriverManager.getConnection(URL,
					USER, PASSWORD);

		} catch (ClassNotFoundException e) {

			e.printStackTrace();

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return connection;

	}

}
