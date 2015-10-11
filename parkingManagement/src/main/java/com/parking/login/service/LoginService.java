package com.parking.login.service;

import com.parking.domain.common.User;

public interface LoginService {

	public User signIn(String userName, String password);

	public boolean signOut(String userName);

	public User adminSignIn(String userName, String password);
	
}
