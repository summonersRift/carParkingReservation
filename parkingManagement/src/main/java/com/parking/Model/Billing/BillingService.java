package com.parking.Model.Billing;

import java.math.BigDecimal;
import java.util.List;

import com.parking.Model.Domain.BillingInfo;
import com.parking.Model.Domain.ConfirmationMsg;
import com.parking.Model.Domain.User;

public interface BillingService { 

	/**
	 * @param userId
	 * @param funds
	 * @return ConfirmationMsg
	 */
	public Boolean updateUserFunds(long userId, BigDecimal funds);

	/**
	 * @param info
	 * @return ConfirmationMsg
	 */
	public ConfirmationMsg makePayment(BillingInfo info);

}
