package com.parking.dal.contract;

import java.math.BigDecimal;
import java.util.List;

import com.parking.domain.BillingInfo;
import com.parking.domain.User;

public interface BillingDao {

	List<BillingInfo> getAll();

	BillingInfo getBillingInfoByUsr(User user);

	Boolean updateUserFunds(User user, BigDecimal funds);

}
