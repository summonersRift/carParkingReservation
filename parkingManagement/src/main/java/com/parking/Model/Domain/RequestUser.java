package com.parking.Model.Domain;

public class RequestUser {
	private String firstName;
	private String lastName;
	private String userName;
	private String email;
	private String password;
	private String repassword;
	private String userIdentifation; 
	private String secQuestionOne;
	private String secAnswersOne;

	public String getUserIdentifation() {
		return userIdentifation;
	}

	public void setUserIdentifation(String userIdentifation) {
		this.userIdentifation = userIdentifation;
	}

	public String getSecQuestionOne() {
		return secQuestionOne;
	}

	public void setSecQuestionOne(String secQuestionOne) {
		this.secQuestionOne = secQuestionOne;
	}

	 

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRepassword() {
		return repassword;
	}

	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}

	public String getSecAnswersOne() {
		return secAnswersOne;
	}

	public void setSecAnswersOne(String secAnswersOne) {
		this.secAnswersOne = secAnswersOne;
	}

}
