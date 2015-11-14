package com.parking.Model.Billing;

import java.math.BigDecimal;
import java.util.List;

import com.parking.Model.Domain.BillingInfo;
import com.parking.Model.Domain.ConfirmationMsg;
import com.parking.Model.Domain.User;

public interface BillingService {

	public List<BillingInfo> getAll();

	public BillingInfo getBillingInfoByUser(User user);

	public Boolean updateUserFunds(User user, BigDecimal funds);

	public ConfirmationMsg makePayment(BillingInfo info);

}
