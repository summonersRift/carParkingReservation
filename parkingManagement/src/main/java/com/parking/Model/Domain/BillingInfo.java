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
	private Address billingAddress;
	private double ccNumber;
	private double checkNumber;
	private int securityCode;
	private double routingNumber; 
	private String paymentType;// TODO:need to use enumeration type.
	private BigDecimal funds;
	private long userId;
	
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

	 

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public BigDecimal getFunds() {
		return funds;
	}

	public void setFunds(BigDecimal funds) {
		this.funds = funds;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

}
