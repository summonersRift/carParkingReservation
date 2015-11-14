package com.parking.Model.Billing;

import java.math.BigDecimal;
import java.util.List;

import com.parking.Model.DAO.DaoFactory;
import com.parking.Model.DAO.Contract.BillingDao;
import com.parking.Model.Domain.BillingInfo;
import com.parking.Model.Domain.ConfirmationMsg;
import com.parking.Model.Domain.User;

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
