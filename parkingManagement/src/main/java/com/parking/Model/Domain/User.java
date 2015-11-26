package com.parking.Model.Domain;

import java.io.Serializable;
import java.util.List;

import org.json.JSONObject;

public class User extends AbstractUser implements Serializable {

	private static final long serialVersionUID = 7503398206106993501L;

	private double _userid;
	private String _firstName;
	private String _lastName;
	private String _userName;
	private String _password;
	private String _email;
	private String _securityQuestion;
	private String _securityAnswer;
	private String _phoneNumber;
	private Role _userRole;
	private String userIdentification;
	 
	
	private Address _address;
	private List<SecurityInfo> secInfoLst;

	public User() {
	}


	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		this._userName = userName;
	}

	@Override
	public String getPassword() {
		return _password;
	}

	@Override
	public void setPassword(String password) {
		this._password = password;
	}

	@Override
	public String getSecurityAnswer() {
		return _securityAnswer;
	}

	public void setSecurityAnswer(String securityAnswer) {
		this._securityAnswer = securityAnswer;
	}

	@Override
	public String getPhoneNumber() {
		return _phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this._phoneNumber = phoneNumber;
	}


	public String getFirstName() {

		return _firstName;

	}

	public void setFirstName(String firstName) {

		this._firstName = firstName;

	}

	public String getLastName() {

		return _lastName;

	}

	public void setLastName(String lastName) {

		this._lastName = lastName;

	}

	@Override
	public String getEmail() {

		return _email;

	}

	public void setEmail(String email) {

		this._email = email;

	}

	@Override
	public String toString() {

		return "User [firstName=" + _firstName

		+ ", lastName=" + _lastName + ", _email="

		+ _email + ", _password=" + _password + ", _securityAnswer="
				+ _securityAnswer + ", _phoneNumber=" + _phoneNumber
				+ ", securityQuestion=" + "]";

	}

	@Override
	public Role getUserRole() {
		return _userRole;
	}

	public void setUserRole(Role _userRole) {
		this._userRole = _userRole;
	}
 

	@Override
	public Boolean isNull() {

		return false;
	}

	public Address getAddress() {
		return _address;
	}

	public void setAddress(Address _address) {
		this._address = _address;
	}

	public List<SecurityInfo> getSecInfoLst() {
		return secInfoLst;
	}

	public void setSecInfoLst(List<SecurityInfo> secInfoLst) {
		this.secInfoLst = secInfoLst;
	}

	public double getUserid() {
		return _userid;
	}

	public void setUserid(double _userid) {
		this._userid = _userid;
	}

	public JSONObject getJson() {

		JSONObject obj = new JSONObject();
		obj.append("user_name", getUserName());
		obj.append("user_id", getUserid());
		obj.append("user_email", getEmail());
		obj.append("role", getUserRole().getRoleType());
		// finish adding all roles returned from GET-USER SELECT
		return obj;

	}


	public String get_securityQuestion() {
		return _securityQuestion;
	}


	public void set_securityQuestion(String _securityQuestion) {
		this._securityQuestion = _securityQuestion;
	}


	public String getUserIdentification() {
		return userIdentification;
	}


	public void setUserIdentification(String userIdentification) {
		this.userIdentification = userIdentification;
	}

}
