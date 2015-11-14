package com.parking.Model.DAO.Contract;

import java.math.BigDecimal;
import java.util.List;

import com.parking.Model.Domain.BillingInfo;
import com.parking.Model.Domain.User;

public interface BillingDao {

	List<BillingInfo> getAll();

	BillingInfo getBillingInfoByUsr(User user);

	Boolean updateUserFunds(User user, BigDecimal funds);

}
