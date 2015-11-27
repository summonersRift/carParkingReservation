package com.parking.Model.Domain;

public class ParkingSlot {
	private long parkingId;
    private Integer parkNumber;
	private String location;
	private String floor;
	private Integer number;
	private String garageNumber;
	
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getGarageNumber() {
		return garageNumber;
	}

	public void setGarageNumber(String garageNumber) {
		this.garageNumber = garageNumber;
	} 

	public ParkingSlot() {

	}

	public Integer getParkNumber() {
		return parkNumber;
	}

	public void setParkNumber(Integer parkNumber) {
		this.parkNumber = parkNumber;
	}

	public long getParkingId() {
		return parkingId;
	}

	public void setParkingId(long parkingId) {
		this.parkingId = parkingId;
	}

}
