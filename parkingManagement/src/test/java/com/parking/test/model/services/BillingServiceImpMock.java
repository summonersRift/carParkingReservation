package com.parking.test.model.services;

import com.parking.Model.Billing.BillingServiceFacade;
import com.parking.Model.Domain.BillingInfo;
import com.parking.Model.Domain.ConfirmationMsg;

public class BillingServiceImpMock extends BillingServiceFacade{
	private boolean isProcessed;

    public BillingServiceImpMock(boolean isProcessed) {
        this.isProcessed = isProcessed;
    }
    
	public ConfirmationMsg processPayment(BillingInfo info) throws Exception {
		ConfirmationMsg restMsg = new ConfirmationMsg();
		restMsg.setProcessed(this.isProcessed);
		return restMsg;		
	}
	
}
