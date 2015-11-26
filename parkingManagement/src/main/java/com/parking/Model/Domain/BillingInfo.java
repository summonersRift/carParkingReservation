package com.parking.Model.Domain;

import java.io.Serializable;
import java.math.BigDecimal;

import com.parking.Model.Domain.Address;
import com.parking.Model.Domain.User;

public class BillingInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String billingAddress;
	private double ccNumber;
	private double checkNumber;
	private int securityCode;
	private double routingNumber; 
	private String paymentType;// TODO:need to use enumeration type.
	private String funds;
	private long userId;
	private String expDate;
	private String city;
	private String state;
	private String zipCode;
	
	public BillingInfo(){};
 

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

 

	public Integer getSecurityCode() {
		return securityCode;
	}

	public void setSecurityCode(Integer securityCode) {
		this.securityCode = securityCode;
	}

	 

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	 

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}


	public String getFunds() {
		return funds;
	}


	public void setFunds(String funds) {
		this.funds = funds;
	}


	public String getExpDate() {
		return expDate;
	}


	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getBillingAddress() {
		return billingAddress;
	}


	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}


	public String getZipCode() {
		return zipCode;
	}


	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

}
