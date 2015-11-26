package com.parking.Model.DAO.Contract;

import com.parking.Model.Domain.AbstractUser;
import java.math.BigDecimal;
import com.parking.Model.Domain.User;

public interface UserDao {

	AbstractUser getbyId(Long userId);

	AbstractUser getbyName(String userName);
	
	AbstractUser signIn(String userName, String password);

	AbstractUser addUser(User user);

	boolean updateUserFunds(long userid, BigDecimal funds);

	BigDecimal getBalance(Long userId);

}
