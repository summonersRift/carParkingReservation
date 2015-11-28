package com.parking.Model.Services;

import java.math.BigDecimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.parking.Model.DAO.Contract.UserDao;
import com.parking.Model.Domain.AbstractUser;
import com.parking.Model.Domain.User;
import com.parking.Model.Services.Contract.UserService;
import com.parking.Model.Security.HashEncryptor;

@Service
public class UserServiceImp implements UserService {

	private UserDao dao;

	@Autowired
	public UserServiceImp(UserDao daopm) {
		dao = daopm;

	}

	@Override
	public AbstractUser addUser(User user) {
		String pwd = user.getPassword();
		user.setPassword(HashEncryptor.encrypt(pwd));
		return dao.addUser(user);
	}

	@Override
	public AbstractUser signIn(String userName, String password) {
		// TODO Auto-generated method stub
		return dao.signIn(userName, HashEncryptor.encrypt(password));
	}

	public BigDecimal getUserBalance(Long userId) {
		return dao.getBalance(userId);
	}

	@Override
	public AbstractUser getUserByUserName(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

}
