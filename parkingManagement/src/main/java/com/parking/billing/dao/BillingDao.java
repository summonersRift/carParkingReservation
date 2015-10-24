package com.parking.billing.dao;

import java.math.BigDecimal;
import java.util.List;

import com.parking.billing.domain.BillingInfo;
import com.parking.domain.common.User;

public interface BillingDao {

	List<BillingInfo> getAll();

	BillingInfo getBillingInfoByUsr(User user);

	Boolean updateUserFunds(User user, BigDecimal funds);

}
