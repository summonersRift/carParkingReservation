package com.parking.Model.Domain;

import java.io.Serializable;
import java.util.ArrayList;
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
	private String _securityAnswer;
	private String _phoneNumber;
	private Role _userRole;
	private String _age;

	private String _enabled;
	private Address _address;
	private List<SecurityInfo> secInfoLst;

	public User() {
	}

	public User(double userId, String firstName, String lastName,
			String userName, String password, String email,
			String securityAnswer, String securityQuestion, String phoneNumber,
			final Role role, String age, String height, String weight,
			String enabled, final Address address,
			final List<SecurityInfo> secList) {

		this.setUserid(userId);
		this._firstName = firstName;
		this._lastName = lastName;
		this._userName = userName;
		this._password = password;
		this._email = email;
		this._phoneNumber = phoneNumber;
		this._age = age;
		this._enabled = enabled;
		this._address = address;
		this.setSecInfoLst(secList);

		setUserRole(role);

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

	private String token;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
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

	public static User getMyDemoUser() {

		User demoUser = new User();
		Role role = new Role();
		// String street, Integer zip, String state, String city,
		// String county, String country

		Address address = new Address("123 NE 12 street", 33323, "FL", "Miami",
				"Miami Dade ", "USA");
		List<SecurityInfo> secInfoLst = new ArrayList<SecurityInfo>();
		SecurityInfo infoOne = new SecurityInfo("One", "Pet name", "irri");
		SecurityInfo infoTwo = new SecurityInfo("Two", "Mother's maiden name",
				"Smith");
		SecurityInfo infoThree = new SecurityInfo("Three", "highschool  name",
				"Kendall Hights");
		secInfoLst.add(infoOne);
		secInfoLst.add(infoTwo);
		secInfoLst.add(infoThree);

		demoUser.setEmail("test@gmail.com");
		demoUser.setFirstName("DemoName");
		demoUser.setLastName("DemoLastName");
		demoUser.setUserid(11111);
		demoUser.setToken("123456");
		demoUser.setUserName("test@test.com");
		role.setRoleType("user");
		demoUser.setUserRole(role);
		demoUser.setAddress(address);

		return demoUser;

	}

	@Override
	public Role getUserRole() {
		return _userRole;
	}

	public void setUserRole(Role _userRole) {
		this._userRole = _userRole;
	}

	public String getAge() {
		return _age;
	}

	public void setAge(String _age) {
		this._age = _age;
	}

	public String getEnabled() {
		return _enabled;
	}

	public void setEnabled(String _enabled) {
		this._enabled = _enabled;
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

}
