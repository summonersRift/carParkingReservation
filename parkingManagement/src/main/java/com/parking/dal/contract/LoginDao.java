package com.parking.dal.contract;

import com.parking.domain.User;

public interface LoginDao {

	public User signIn(String userName, String password);

	public User adminSignIn(String userName, String password);	
	 
	public Long validLogin(String user,String password); 
	  
	public boolean signOut(String userName);

}
