package com.parking.Model.DAO;

import org.springframework.stereotype.Repository;

import com.parking.Model.DAO.Contract.UserDao;
import com.parking.Model.Domain.User;

@Repository
public class UserDaoImp implements UserDao {

	@Override
	public User getbyId(Long userId) {
		
		return null;
	}

	@Override
	public User signIn(String userName, String password) {  
		
		System.out.println("calling dao sign in with user name : " + userName);   
		return User.getMyDemoUser();  
	
	}

}
