package com.parking.Model.Billing;

import java.math.BigDecimal;
import java.util.List;

import com.parking.Model.Domain.BillingInfo;
import com.parking.Model.Domain.ConfirmationMsg;
import com.parking.Model.Domain.User;

public interface BillingService {

 

	public Boolean updateUserFunds(long userId, BigDecimal funds);

	public ConfirmationMsg makePayment(BillingInfo info);

}
