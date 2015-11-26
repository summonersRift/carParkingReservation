package com.parking.Model.Billing;

import java.math.BigDecimal;

import com.parking.Model.Domain.BillingInfo;
import com.parking.Model.Domain.ConfirmationMsg;

public class BillingServiceFacade {

	public ConfirmationMsg processPayment(BillingInfo info) throws Exception {

		// TODO: validate for active user.
		BillingService service = null; 
		String pmtType = info.getPaymentType();

		if (info.getPaymentType() == null) {
			throw new Exception("invalid payment type,cannot be null!!");
		}
		if (info.getFunds() == null) {

			throw new Exception("invalid balance amount,cannot be empty!!");

		}
		// get service based on payment type.
		switch (pmtType) {
		case "credit_card":
			service = new BillingServiceCreditCard();
			break;
		case "check":
			service = new BillingServiceEcheck();
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
				new BigDecimal(info.getFunds()));

		ConfirmationMsg restMsg = new ConfirmationMsg();

		if (processed) {
			restMsg.setMessage("Paymet processed completed the amount of "
					+ info.getFunds() + "dollars to your account ");
			restMsg.setProcessed(true);
		} else {

			restMsg.setMessage("Paymet processed failed due to an error in the system for account number : "
					+ info.getCcNumber());
			restMsg.setProcessed(false);
		}

		return restMsg;

	}

}
