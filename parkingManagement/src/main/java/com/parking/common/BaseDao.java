package com.parking.common;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class BaseDao {

	protected static Connection connection;

	/**
	 * @return
	 */
	public Connection getConnection() {

		if (connection == null) {
			connection = DALUtil.getConnection();
		}
		return connection;

	}

	/**
	 * 
	 */
	public void closeConnection() {

		if (connection != null)
			try {
				if (!connection.isClosed())
					connection.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}

	}

}
