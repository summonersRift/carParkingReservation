package com.parking.Model.Services.Contract;

import java.math.BigDecimal;
 
import com.parking.Model.Domain.AbstractUser;
import com.parking.Model.Domain.User;


public interface UserService {

	AbstractUser addUser(User user); 

	AbstractUser getUserByUserName(String userName); 

	AbstractUser signIn(String userName, String password); 

	BigDecimal getUserBalance(Long userId);

}
