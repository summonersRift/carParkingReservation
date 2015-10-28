package com.parking.billing;

import java.math.BigDecimal;
import java.util.List;

import com.parking.dal.DaoFactory;
import com.parking.dal.contract.BillingDao;
import com.parking.domain.BillingInfo;
import com.parking.domain.ConfirmationMsg;
import com.parking.domain.User;

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
