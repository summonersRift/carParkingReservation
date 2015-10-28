package com.parking.business.contract;

import com.parking.domain.User;

public interface LoginService {

	public User signIn(String userName, String password);

	public boolean signOut(String userName);

	public User adminSignIn(String userName, String password);
	
}
