package com.parking.common;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.parking.util.DALUtil;

public class BaseDao {

	protected Connection connection;

	public Connection getConnection() {

		if (connection == null)
			connection = DALUtil.getConnection();

		return connection;

	}

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
