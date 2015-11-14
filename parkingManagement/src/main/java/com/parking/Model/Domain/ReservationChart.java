package com.parking.Model.Domain;

public class ReservationChart {

	/**
	 * 
	 */
	private String startDate;
	/**
	 * 
	 */
	private Integer customerID;
	/**
	 * 
	 */
	private String endDate;
	/**
	 * 
	 */
	private User user;
	/**
	 * 
	 */
	private double amountCharged;
	/**
	 * 
	 */
	private Integer parkingSpaceID;
	private ParkingSlot parkingSpace;

	/**
	 * Getter of startDate
	 */
	public String getStartDate() {
		return startDate;
	}

	/**
	 * Setter of startDate
	 */
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	/**
	 * Getter of customerID
	 */
	public Integer getCustomerID() {
		return customerID;
	}

	/**
	 * Setter of customerID
	 */
	public void setCustomerID(Integer customerID) {
		this.customerID = customerID;
	}

	/**
	 * Getter of endDate
	 */
	public String getEndDate() {
		return endDate;
	}

	/**
	 * Setter of endDate
	 */
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	/**
	 * Getter of user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * Setter of user
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * Getter of amountCharged
	 */
	public double getAmountCharged() {
		return amountCharged;
	}

	/**
	 * Setter of amountCharged
	 */
	public void setAmountCharged(double amountCharged) {
		this.amountCharged = amountCharged;
	}

	/**
	 * Getter of parkingSpaceID
	 */
	public Integer getParkingSpaceID() {
		return parkingSpaceID;
	}

	/**
	 * Setter of parkingSpaceID
	 */
	public void setParkingSpaceID(Integer parkingSpaceID) {
		this.parkingSpaceID = parkingSpaceID;
	}

	/**
	 * Getter of parkingSpace
	 */
	public ParkingSlot getParkingSpace() {
		return parkingSpace;
	}

	/**
	 * Setter of parkingSpace
	 */
	public void setParkingSpace(ParkingSlot parkingSpace) {
		this.parkingSpace = parkingSpace;
	}

}
