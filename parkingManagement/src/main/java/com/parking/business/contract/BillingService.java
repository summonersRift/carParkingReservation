package com.parking.business.contract;

import java.math.BigDecimal;
import java.util.List;

import com.parking.domain.BillingInfo;
import com.parking.domain.ConfirmationMsg;
import com.parking.domain.User;

public interface BillingService {

	public List<BillingInfo> getAll();

	public BillingInfo getBillingInfoByUser(User user);

	public Boolean updateUserFunds(User user, BigDecimal funds);

	public ConfirmationMsg makePayment(BillingInfo info);

}
