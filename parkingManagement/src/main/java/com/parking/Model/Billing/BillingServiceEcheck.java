package com.parking.Model.Billing;

import com.parking.Model.Domain.BillingInfo;
import com.parking.Model.Domain.ConfirmationMsg;



public class BillingServiceEcheck extends AbstractBillingService {

	/* (non-Javadoc)
	 * @see com.parking.Model.Billing.AbstractBillingService#makePayment(com.parking.Model.Domain.BillingInfo)
	 */
	@Override
	public ConfirmationMsg makePayment(BillingInfo info) {

		ConfirmationMsg msg= new ConfirmationMsg();
		if(info ==null){
			
			msg.setError("error processing payment information cannot be empty");
			
		}else {
			
			System.out.println(" Connect to external service gateway");
			System.out.println("send service request"); 
			System.out.println("get service response.");
			System.out.println("validate response");
			System.out.println("set confirmation message"); 
			System.out.println("processing credit card payment for credit card number = " + info.getCcNumber());
			msg.setMessage("processed");
			
		} 
		
	    return msg;

	}

}
