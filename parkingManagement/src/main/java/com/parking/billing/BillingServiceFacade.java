package com.parking.billing;

import com.parking.domain.BillingInfo;
import com.parking.domain.ConfirmationMsg;
import com.parking.domain.User;

public class BillingServiceFacade {

	public ConfirmationMsg processPayment(BillingInfo info, User user)
			throws Exception {

		// TODO: validate for active user.

		BillingService service = null;
		String pmtType = " ";
		// get service based on payment type.
		switch (pmtType) {
		case "credit_card":
			service = BillingServiceFactory.getBillingPayCreditCard();
			break;
		case "check":
			service = BillingServiceFactory.getBillingPayCreditCard();
			break;
		case "google_pay":
			service = BillingServiceFactory.getBillingPayCreditCard();
			break;
		case "pay_pal":
			service = BillingServiceFactory.getBillingPayCreditCard();
			break;
		}

		ConfirmationMsg msg = service.makePayment(info);

		if (!msg.getMessage().equalsIgnoreCase("processed")) {
			throw new Exception("error processing payment : info "
					+ msg.getErrorMessage());

		}

		boolean processed = service.updateUserFunds(user, info.getFunds());

		ConfirmationMsg restMsg = new ConfirmationMsg();

		if (processed)
			restMsg.setMessage("Paymet processed completed the amount of "
					+ info.getFunds() + "dollars to your account ");
		else {

			restMsg.setMessage("Paymet processed failed due to an error in the system for account number : "
					+ info.getCcNumber());

		}

		return restMsg;

	}

}
