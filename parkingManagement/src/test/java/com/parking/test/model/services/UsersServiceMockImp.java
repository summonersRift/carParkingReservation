package com.parking.test.model.services;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;

import com.parking.Model.DAO.Contract.UserDao;
import com.parking.Model.Domain.AbstractUser;
import com.parking.Model.Domain.NullUser;
import com.parking.Model.Domain.User;
import com.parking.Model.Services.Contract.UserService;

public class UsersServiceMockImp implements UserService {


	
	@Override
	public AbstractUser addUser(User user) {
		// TODO Auto-generated method stub
		if (user.getPassword() == null) {
			return new NullUser();
		}
		return user ;
	}


	@Override
	public AbstractUser signIn(String userName, String password) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public AbstractUser getUserByUserName(String userName) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public BigDecimal getUserBalance(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}


}
