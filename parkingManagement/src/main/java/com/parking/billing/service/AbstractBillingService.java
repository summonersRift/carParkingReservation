package com.parking.billing.service;

import java.math.BigDecimal;
import java.util.List;

import com.parking.billing.dao.BillingDao;
import com.parking.billing.dao.DaoFactory;
import com.parking.billing.domain.BillingInfo;
import com.parking.billing.domain.ConfirmationMsg;
import com.parking.domain.common.User;

public abstract class AbstractBillingService implements BillingService {

	public abstract ConfirmationMsg makePayment(BillingInfo info);

	public List<BillingInfo> getAll() {

		BillingDao bDao = DaoFactory.getBillingDao();

		return bDao.getAll();

	}

	public BillingInfo getBillingInfoByUser(final User user) {

		BillingDao bDao = DaoFactory.getBillingDao();

		return bDao.getBillingInfoByUsr(user);
	}

	public Boolean updateUserFunds(final User user, final BigDecimal funds) {
		BillingDao bDao = DaoFactory.getBillingDao();
		return bDao.updateUserFunds(user, funds);
	}

}
