package com.parking.Model.Domain;

public class ConfirmationMsg {

	/**
	 * 
	 */
	public String message;
	/**
	 * 
	 */
	public String error;
	/**
	 * Getter of message
	 */
	public String getMessage() {
	 	 return message; 
	}
	/**
	 * Setter of message
	 */
	public void setMessage(String message) { 
		 this.message = message; 
	}
	/**
	 * Getter of error
	 */
	public String getError() {
	 	 return error; 
	}
	/**
	 * Setter of error
	 */
	public void setError(String error) { 
		 this.error = error; 
	} 


}
