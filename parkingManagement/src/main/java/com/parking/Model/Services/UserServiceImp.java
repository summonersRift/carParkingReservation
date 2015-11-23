package com.parking.Model.Services;

 

import java.math.BigDecimal;
import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parking.Model.DAO.Contract.UserDao;
import com.parking.Model.Domain.User;
import com.parking.Model.Services.Contract.UserService;
 

@Service
public class UserServiceImp implements UserService {

	private UserDao dao;

	@Autowired
	public UserServiceImp(UserDao daopm) {
		dao = daopm;

	}

	@Override
	public User getUserById(Long userId) {

		User usr = dao.getbyId(userId);

		return usr;

	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public User getUserByUserName(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User signIn(String userName, String password) {

		return dao.signIn(userName, password);

	}

	@Override
	public BigDecimal getUserBalance(Long userId) {
		 
		return dao.getBalance(userId);
	}

	 

}
