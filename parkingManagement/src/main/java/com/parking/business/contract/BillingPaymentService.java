package com.parking.business.contract;

import com.parking.domain.BillingInfo;
import com.parking.domain.ConfirmationMsg;

 
public interface BillingPaymentService {
	public	ConfirmationMsg makePayment(BillingInfo info);
}
