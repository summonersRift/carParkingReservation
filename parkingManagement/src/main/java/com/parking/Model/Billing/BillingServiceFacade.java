package com.parking.Model.Billing;

import com.parking.Model.Domain.BillingInfo;
import com.parking.Model.Domain.ConfirmationMsg;
import com.parking.Model.Domain.User;

public class BillingServiceFacade {

	public ConfirmationMsg processPayment(BillingInfo info) throws Exception {

		// TODO: validate for active user.
		BillingService service = null;

		String pmtType = info.getPaymentType();
		if (info.getPaymentType() == null)
			throw new Exception("invalid payment type,cannot be null!!");
		// get service based on payment type.
		switch (pmtType) {
		case "credit_card":
			service = BillingServiceFactory.getBillingPayCreditCard();
			break;
		case "check":
			service = BillingServiceFactory.getBillingPayCheck();
			break;
		default:
			throw new Exception("invalid payment type");

		}

		ConfirmationMsg msg = service.makePayment(info);

		if (!msg.getMessage().equalsIgnoreCase("processed")) {
			throw new Exception("error processing payment : info "
					+ msg.getError());

		}

		boolean processed = service.updateUserFunds(info.getUserId(),
				info.getFunds());

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
