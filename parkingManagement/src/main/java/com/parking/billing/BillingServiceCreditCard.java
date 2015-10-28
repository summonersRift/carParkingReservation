package com.parking.billing;

import com.parking.domain.BillingInfo;
import com.parking.domain.ConfirmationMsg;



public class BillingServiceCreditCard extends AbstractBillingService{

	@Override
	public ConfirmationMsg makePayment(BillingInfo info) {
		// TODO Auto-generated method stub
		 
   
		ConfirmationMsg msg= new ConfirmationMsg();
		
		//Connect to external service gateway;
		//send service request
		//get service response.
		//validate response;
		//set confirmation message
		
		
		
	    return msg;
	
	}

	 

	 
 

}
