package com.parking.Model.Billing;

public class BillingServiceFactory {
	// cannot instantiate this factory.
	private BillingServiceFactory() {
	};

	public static BillingService getBillingPayPal() {

		return new BillingServicePayPal();

	}

	public static BillingService getBillingPayCreditCard() {

		return new BillingServiceCreditCard();

	}

	public static BillingService getBillingPayGoogle() {

		return null;// new BillingServiceGooglePay();

	}
	public static BillingService getBillingPayCheck(){
		return null;
		
		
		
	}
}
