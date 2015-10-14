package com.parking.billing.domain;

import com.parking.domain.common.Address;
import com.parking.domain.common.User;

public class BillingInfo {

	private Address billingAddress;
	private double ccNumber;
	private double checkNumber;
	private int securityCode;
	private double routingNumber;
	private User user;

	public BillingInfo(Address address, double ccnumber, double checknumber,
			Integer seccode, double routingnumber, final User user) {

		this.billingAddress = address;
		this.ccNumber = ccnumber;
		this.checkNumber = checknumber;
		this.securityCode = seccode;
		this.routingNumber = routingnumber;
		this.user = user;

	}

	public static BillingInfo getDemoBillingInfo() {

		User usr = new User();
		usr.setFirstName("FirstName");
		usr.setLastName("LastName");
		usr.setUserid(123442);

		BillingInfo info = new BillingInfo(new Address("2222 NW 23 street",
				332232, "FL", "Miami", "Broward", "USA"), 21223, 212222L,
				333333333, 23332, usr);

		return info;
	}

	public double getCcNumber() {
		return ccNumber;
	}

	public void setCcNumber(double ccNumber) {
		this.ccNumber = ccNumber;
	}

	public double getCheckNumber() {
		return checkNumber;
	}

	public void setCheckNumber(double checkNumber) {
		this.checkNumber = checkNumber;
	}

	public double getRoutingNumber() {
		return routingNumber;
	}

	public void setRoutingNumber(double routingNumber) {
		this.routingNumber = routingNumber;
	}

	public Address getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}

	public Integer getSecurityCode() {
		return securityCode;
	}

	public void setSecurityCode(Integer securityCode) {
		this.securityCode = securityCode;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
