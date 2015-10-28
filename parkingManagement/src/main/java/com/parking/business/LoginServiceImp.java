package com.parking.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parking.business.contract.LoginService;
import com.parking.dal.contract.LoginDao;
import com.parking.domain.User;

@Service
public class LoginServiceImp implements LoginService {
@Autowired
LoginDao logindao;


 public LoginServiceImp(){};
 
 public LoginServiceImp(LoginDao dao){
	 
	 logindao=dao;
 };
 
	@Override
	public User signIn(String userName, String password) {
		
		return logindao.signIn(userName, password);
	}
	
	@Override
	public User adminSignIn(String userName, String password) {
		
		return logindao.adminSignIn(userName, password);
	}

	@Override
	public boolean signOut(String userName) {
		// TODO Auto-generated method stub
		return false;
	}

 
 

}

