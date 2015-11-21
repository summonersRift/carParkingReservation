package com.parking.Model.Billing;

public class BillingServiceFactory {
	 
	
	private BillingServiceFactory() {
	};

	public static BillingService getBillingPayCreditCard() {

		return new BillingServiceCreditCard();

	}

	public static BillingService getBillingPayCheck() {
		return new BillingServiceEcheck();

	}
}
