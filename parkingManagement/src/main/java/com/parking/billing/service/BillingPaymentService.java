package com.parking.billing.service;

import com.parking.billing.domain.BillingInfo;
import com.parking.billing.domain.ConfirmationMsg;

public interface BillingPaymentService {
	public	ConfirmationMsg makePayment(BillingInfo info);
}
