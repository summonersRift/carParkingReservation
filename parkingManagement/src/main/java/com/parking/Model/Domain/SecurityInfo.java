package com.parking.Model.Domain;

import java.io.Serializable;

public class SecurityInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6574637673721107972L;
	
	private String securityQuestion;
	private String securityAnwser;
	private String secInfoName;

	public SecurityInfo(String secName, String secQuestion, String securityAws) {

		this.securityAnwser = securityAws;
		this.securityQuestion = secQuestion;
		this.secInfoName = secName;

	}

	public boolean isValid() {

		return true;

	}

	public String toString() {

		return this.securityQuestion + " : " + this.securityAnwser;

	}

	public String getSecInfoName() {
		return secInfoName;
	}

	public void setSecInfoName(String secInfoName) {
		this.secInfoName = secInfoName;
	}
}
