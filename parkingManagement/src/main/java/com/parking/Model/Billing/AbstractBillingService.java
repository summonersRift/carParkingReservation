package com.parking.Model.Billing;

import java.math.BigDecimal;

import com.parking.Model.DAO.UserDaoImp;
import com.parking.Model.DAO.Contract.UserDao;
import com.parking.Model.Domain.BillingInfo;
import com.parking.Model.Domain.ConfirmationMsg;

public abstract class AbstractBillingService implements BillingService {

	public abstract ConfirmationMsg makePayment(BillingInfo info);

	/* (non-Javadoc)
	 * @see com.parking.Model.Billing.BillingService#updateUserFunds(long, java.math.BigDecimal)
	 */
	public Boolean updateUserFunds(long userid, final BigDecimal funds) {
		UserDao dao = new UserDaoImp();
		return dao.updateUserFunds(userid, funds);
	}

}
