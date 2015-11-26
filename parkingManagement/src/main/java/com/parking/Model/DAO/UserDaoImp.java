package com.parking.Model.DAO;

import java.sql.PreparedStatement;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.parking.common.BaseDao;
import com.parking.Model.DAO.Contract.UserDao;
import com.parking.Model.Domain.AbstractUser;
import com.parking.Model.Domain.NullUser;
import com.parking.Model.Domain.User;
import com.parking.Model.Domain.Role;

@Repository
public class UserDaoImp extends BaseDao implements UserDao {
	/*
	 * Don't Remove private static String GET_USER_BY_USERNAME =
	 * "SELECT u.username, u.user_id, u.password, r.role_name "
	 * +"FROM users u, Roles r " +"WHERE  username=? AND u.role_id=r.role_id";
	 */

	/*
	 * Don't Remove private static String GET_USER_BY_ID = "SELECT *" +
	 * "FROM users" + "WHERE  user_id = ?";
	 */
	private static String VALIDATE_USER = "SELECT u.username, u.user_id, u.password, r.role_name "
			+ "FROM users u, Roles r "
			+ "WHERE  username=? AND u.role_id=r.role_id AND u.password=?";

	private static String INSERT_USER = "INSERT INTO users (username, password, email, balance, role_id,address_id,identification,sq1,sa1) "
			+ "VALUES (?, ?, ?, 0, 1,?,?,?,?)";

	@Override
	public AbstractUser signIn(String userName, String password) {
		// TODO Auto-generated method stub

		User user = new User();
		try {

			PreparedStatement statement = getConnection().prepareStatement(
					VALIDATE_USER);
			statement.setString(1, userName);
			statement.setString(2, password);

			ResultSet result = statement.executeQuery();

			if (!result.isBeforeFirst()) {
				return new NullUser();
			}

			while (result.next()) {
				user.setUserName(result.getString("u.username"));
				user.setUserid(result.getLong("u.user_id"));
				user.setPassword(result.getString("u.password"));
				Role role = new Role();
				role.setRoleType(result.getString("r.role_name"));
				user.setUserRole(role);

			}

			result.close();
			statement.close();

		} catch (SQLException e) {
			// TODO need to add log4j output
			e.printStackTrace();

		} catch (Exception ex) {
			// TODO need to add log4j output
			ex.printStackTrace();

		}

		return user;

	}

	@Override
	public AbstractUser addUser(User user) {
		try {
			//String sss = "INSERT INTO users (username, password, email, balance, role_id,address_id,identification,sq1,sa1) "
				//	+ "VALUES (?, ?, ?, 0, 1,?,?,?,?)";
			PreparedStatement statement = getConnection().prepareStatement(
					INSERT_USER);
			statement.setString(1, user.getUserName());
			statement.setString(2, user.getPassword());
			statement.setString(3, user.getEmail());
			statement.setInt(4, 1);
			statement.setString(5, user.getUserIdentification());
			statement.setString(6, user.get_securityQuestion());
			statement.setString(7, user.getSecurityAnswer());

			int result = statement.executeUpdate();
			if (result > 0) {

				return user;

			}

			statement.close();

		} catch (SQLException e) {
			// TODO need to add log4j output
			e.printStackTrace();
			return new NullUser();

		} catch (Exception ex) {
			// TODO need to add log4j output
			ex.printStackTrace();

		}
		return new NullUser();

	}

	@Override
	public boolean updateUserFunds(long userid, BigDecimal funds) {

		java.sql.PreparedStatement updateemp = null;
		java.sql.PreparedStatement getBalancestm = null;
		try {

			getConnection();

			getBalancestm = connection
					.prepareStatement(" SELECT  balance FROM pmsys.users where user_id =?");

			getBalancestm.setLong(1, userid);
			ResultSet rs = getBalancestm.executeQuery();
			BigDecimal balance = new BigDecimal("0");

			if (rs.next()) {
				balance = rs.getBigDecimal("balance");
			}
			rs.close();

			updateemp = connection
					.prepareStatement("UPDATE pmsys.users SET balance = ? WHERE user_id = ? ");

			// sum the current balance with the new transfer fund.
			updateemp.setBigDecimal(1, balance.add(funds));
			updateemp.setLong(2, userid);

			int execute = updateemp.executeUpdate();

			if (execute > 0) {
				return true;
			} else {
				return false;
			}

		} catch (SQLException e) {

			e.printStackTrace();

		} finally {

			if (getBalancestm != null)
				try {
					getBalancestm.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}

			if (updateemp != null)
				try {
					updateemp.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}

			// closeConnection();
		}

		return true;

	}

	@Override
	public BigDecimal getBalance(Long userId) {

		BigDecimal balance = new BigDecimal("0");

		java.sql.PreparedStatement updateemp = null;

		getConnection();
		ResultSet rs = null;
		try {

			updateemp = connection
					.prepareStatement(" SELECT  balance FROM pmsys.users where user_id =?");

			updateemp.setLong(1, userId);
			rs = updateemp.executeQuery();

			if (rs.next()) {

				balance = rs.getBigDecimal("balance");

			}

		} catch (SQLException e) {

			e.printStackTrace();

		} finally {

			try {
				if (rs != null) {
					rs.close();
				}
				// close statement
				if (updateemp != null)
					updateemp.close();
				// close resultset

			} catch (SQLException e) {
				e.printStackTrace();
			}

			// closeConnection();
		}

		return balance;
	}

}
