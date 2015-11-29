package com.parking.Model.DAO.Contract;

import com.parking.Model.Domain.AbstractUser;
import java.math.BigDecimal;
import com.parking.Model.Domain.User;

public interface UserDao {
 
	/**
	 * @param userName
	 * @param password
	 * @return AbstractUser
	 */
	AbstractUser signIn(String userName, String password);

	/**
	 * @param user
	 * @return AbstractUser
	 */
	AbstractUser addUser(User user);

	/**
	 * @param userid
	 * @param funds
	 * @return boolean
	 */
	boolean updateUserFunds(long userid, BigDecimal funds);

	/**
	 * @param userId
	 * @return BigDecimal
	 */
	BigDecimal getBalance(Long userId);

}
