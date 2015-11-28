package com.parking.Model.Domain;

 

public class Incident {

	private Long UserId;

	private Integer location;

	private String description;

	private String date;

	private Long IncidentID;

	public Long getIncidentID() {
		return IncidentID;
	}

	public void setIncidentID(Long incidentID) {
		IncidentID = incidentID;
	}

	public Long getUserId() {
		return UserId;
	}

	public void setUserId(Long userId) {
		UserId = userId;
	}

	public Integer getLocation() {
		return location;
	}

	public void setLocation(Integer location) {
		this.location = location;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	 
 
}
