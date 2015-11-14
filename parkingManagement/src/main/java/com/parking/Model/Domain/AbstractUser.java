package com.parking.Model.Domain;

public abstract class AbstractUser {

	public abstract String getPassword();

	public abstract String getEmail();

	public abstract String getSecurityAnswer();

	public abstract String getPhoneNumber();

	public abstract Role getUserRole();
	
    public abstract Boolean isNull();

	public void setPassword(String password) {
		// TODO Auto-generated method stub
		
	}
}
