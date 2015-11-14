package com.parking.Model.Domain;

import java.math.BigDecimal;
import java.util.List;

public interface BillingDao {

	List<BillingInfo> getAll();

	BillingInfo getBillingInfoByUsr(User user);

	Boolean updateUserFunds(User user, BigDecimal funds);

}
