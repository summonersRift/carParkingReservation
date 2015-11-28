package com.parking.Model.Domain;

import java.util.List;

public class Facility {
   private int id;
	private String addressLine1;

	private String city;

	private String state;

	private String name;

	private Integer facilityID;

	public List<ParkingSlot> parkingSlot;

	private String phoneNumber;

	private Integer zipCode;
	
	private Integer numberOfSpots;

	/**
	 * Getter of addressLine1
	 */
	public String getAddressLine1() {
		return addressLine1;
	}

	/**
	 * Setter of addressLine1
	 */
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	/**
	 * Getter of city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Setter of city
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * Getter of state
	 */
	public String getState() {
		return state;
	}

	/**
	 * Setter of state
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * Getter of name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter of name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Getter of facilityID
	 */
	public Integer getFacilityID() {
		return facilityID;
	}

	/**
	 * Setter of facilityID
	 */
	public void setFacilityID(Integer facilityID) {
		this.facilityID = facilityID;
	}

	/**
	 * Getter of parkingSlot
	 */
	public List<ParkingSlot> getParkingSlot() {
		return parkingSlot;
	}

	/**
	 * Setter of parkingSlot
	 */
	public void setParkingSlot(List<ParkingSlot> parkingSlot) {
		this.parkingSlot = parkingSlot;
	}

	/**
	 * Getter of phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * Setter of phoneNumber
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * Getter of zipCode
	 */
	public Integer getZipCode() {
		return zipCode;
	}

	/**
	 * Setter of zipCode
	 */
	public void setZipCode(Integer zipCode) {
		this.zipCode = zipCode;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getNumberOfSpots() {
		return numberOfSpots;
	}

	public void setNumberOfSpots(Integer numberOfSpots) {
		this.numberOfSpots = numberOfSpots;
	}


}
