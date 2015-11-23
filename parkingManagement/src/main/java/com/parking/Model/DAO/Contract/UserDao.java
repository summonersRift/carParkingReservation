package com.parking.Model.DAO.Contract;

import java.math.BigDecimal;
 

import com.parking.Model.Domain.User;

public interface UserDao {

	User getbyId(Long userId);

	User signIn(String userName, String password);

	boolean updateUserFunds(long userid, BigDecimal funds);

	BigDecimal getBalance(Long userId);

}
