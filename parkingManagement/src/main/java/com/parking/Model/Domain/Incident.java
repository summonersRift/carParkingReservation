package com.parking.Model.Domain;

public class Incident {
	/**
	 * 
	 */
	public long userID;
	/**
	 * 
	 */
	public String Date;
	/**
	 * 
	 */
	public String location;
	/**
	 * 
	 */
	public long IncidentID;
	/**
	 * Getter of userID
	 */
	public long getUserID() {
	 	 return userID; 
	}
	/**
	 * Setter of userID
	 */
	public void setUserID(long userID) { 
		 this.userID = userID; 
	}
	/**
	 * Getter of Date
	 */
	public String getDate() {
	 	 return Date; 
	}
	/**
	 * Setter of Date
	 */
	public void setDate(String Date) { 
		 this.Date = Date; 
	}
	/**
	 * Getter of location
	 */
	public String getLocation() {
	 	 return location; 
	}
	/**
	 * Setter of location
	 */
	public void setLocation(String location) { 
		 this.location = location; 
	}
	/**
	 * Getter of IncidentID
	 */
	public long getIncidentID() {
	 	 return IncidentID; 
	}
	/**
	 * Setter of IncidentID
	 */
	public void setIncidentID(long IncidentID) { 
		 this.IncidentID = IncidentID; 
	}
	/**
	 * 
	 * @param val 
	 */
	public void AddIncident(String val) { 
		// TODO Auto-generated method
	 } 

}
