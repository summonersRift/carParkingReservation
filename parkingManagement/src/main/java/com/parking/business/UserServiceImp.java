package com.parking.business;

import java.util.List;

import org.springframework.stereotype.Service;

import com.parking.business.contract.UserService;
import com.parking.common.PasswordResetDTO;
import com.parking.common.UserRequest;
import com.parking.domain.User;

@Service
public class UserServiceImp implements UserService {

	@Override
	public User getUserById(Long userId) {
		// TODO Auto-generated method stub
		return null;
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
	public void addUser(User user) {
		// TODO Auto-generated method stub

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
	public User getUserByUserName(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User signIn(String userName, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User adminSignIn(String userName, String password) {
		// TODO Auto-generated method stub
		return null;
	}

}
