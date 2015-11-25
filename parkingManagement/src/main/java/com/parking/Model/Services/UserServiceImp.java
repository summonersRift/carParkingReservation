package com.parking.Model.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parking.Model.DAO.Contract.UserDao;
import com.parking.Model.Domain.AbstractUser;
import com.parking.Model.Domain.User;
import com.parking.Model.Services.Contract.UserService;
import com.parking.common.PasswordResetDTO;
import com.parking.common.UserRequest;
import com.parking.Model.Security.HashEncryptor;


@Service
public class UserServiceImp implements UserService {

	private UserDao dao;

	@Autowired
	public UserServiceImp(UserDao daopm) {
		dao = daopm;

	}

	@Override
	public AbstractUser getUserById(Long userId) {

		return dao.getbyId(userId);

	}

	@Override
	public boolean enabledDisabledUser(long userId, String flag) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void editUser(UserRequest editInfo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void passwordReset(PasswordResetDTO passwordReset) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean disableUser(long userId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean enableUser(long userId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public AbstractUser addUser(User user) {
		String pwd = user.getPassword();
		user.setPassword(HashEncryptor.encrypt(pwd));
		return dao.addUser(user);
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteUserById(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public AbstractUser getUserByUserName(String userName) {
		return dao.getbyName(userName);	
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AbstractUser signIn(String userName, String password) {
		// TODO Auto-generated method stub
		
		
		return dao.signIn(  userName,   password);
		
		
	}

	@Override
	public User adminSignIn(String userName, String password) {
		// TODO Auto-generated method stub
		return null;
	}

}
