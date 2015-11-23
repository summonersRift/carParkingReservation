package com.parking.Model.Services.Contract;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

import com.parking.Model.Domain.User;
import com.parking.common.PasswordResetDTO;
import com.parking.common.UserRequest;

public interface UserService {

	User getUserById(Long userId);  

	void addUser(User user); 

	User getUserByUserName(String userName); 

	User signIn(String userName, String password); 
	 

	BigDecimal getUserBalance(Long userId);

}
