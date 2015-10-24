package com.parking.billing.service;

import java.math.BigDecimal;
import java.util.List;

import com.parking.billing.domain.BillingInfo;
import com.parking.billing.domain.ConfirmationMsg;
import com.parking.domain.common.User;

public interface BillingService {

	public List<BillingInfo> getAll();

	public BillingInfo getBillingInfoByUser(User user);

	public Boolean updateUserFunds(User user, BigDecimal funds);

	public ConfirmationMsg makePayment(BillingInfo info);

}
