package com.parking.Model.Services.Contract;

import java.math.BigDecimal;
import java.util.List;

import com.parking.Model.Domain.AbstractUser;
import com.parking.Model.Domain.User;


public interface UserService {

	AbstractUser getUserById(Long userId);
	
	boolean enabledDisabledUser(long userId, String flag);
	
	boolean disableUser(long userId);

	boolean enableUser(long userId);

	AbstractUser addUser(User user);

	void updateUser(User user);

	void deleteUserById(Long id);

	AbstractUser getUserByUserName(String userName);

	List<User> getAll();

	AbstractUser signIn(String userName, String password);

	AbstractUser adminSignIn(String userName, String password);

	BigDecimal getUserBalance(Long userId);

}
