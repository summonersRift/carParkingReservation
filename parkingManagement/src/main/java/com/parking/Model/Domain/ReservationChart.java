package com.parking.Model.Domain;

public class ReservationChart {

	private String startDate;

	private Integer customerID;

	private String endDate;

	private User user;

	private double amountCharged;

	private Integer parkingSpaceID;
	private ParkingSlot parkingSpace;

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public Integer getCustomerID() {
		return customerID;
	}

	public void setCustomerID(Integer customerID) {
		this.customerID = customerID;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public double getAmountCharged() {
		return amountCharged;
	}

	public void setAmountCharged(double amountCharged) {
		this.amountCharged = amountCharged;
	}

	public Integer getParkingSpaceID() {
		return parkingSpaceID;
	}

	public void setParkingSpaceID(Integer parkingSpaceID) {
		this.parkingSpaceID = parkingSpaceID;
	}

	public ParkingSlot getParkingSpace() {
		return parkingSpace;
	}

	public void setParkingSpace(ParkingSlot parkingSpace) {
		this.parkingSpace = parkingSpace;
	}

}
