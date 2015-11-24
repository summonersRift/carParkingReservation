package com.parking.Model.DAO;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.parking.Model.DAO.Contract.UserDao;
import com.parking.Model.Domain.User;
import com.parking.common.BaseDao;

@Repository
public class UserDaoImp extends BaseDao implements UserDao {

	@Override
	public User getbyId(Long userId) {

		return User.getMyDemoUser();
	}

	@Override
	public User signIn(String userName, String password) {

		System.out.println("calling dao sign in with user name : " + userName);
		return User.getMyDemoUser();

	}

	@Override
	public boolean updateUserFunds(long userid, BigDecimal funds) {

		java.sql.PreparedStatement updateemp = null;

		try {

			getConnection();

			updateemp = connection
					.prepareStatement("UPDATE pmsys.users SET balance = ? WHERE user_id = ? ");
			updateemp.setBigDecimal(1, funds);
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

			if (updateemp != null)
				try {
					updateemp.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			closeConnection();
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

			//closeConnection();
		}

		return balance;

	}

}
