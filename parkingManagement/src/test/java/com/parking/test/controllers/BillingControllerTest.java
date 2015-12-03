package com.parking.test.controllers;

import static org.junit.Assert.*;

import com.parking.Model.Services.*;
import com.parking.Model.Billing.BillingService;
import com.parking.Model.Billing.BillingServiceFacade;
import com.parking.Model.Domain.*;
import com.parking.test.model.services.BillingServiceImpMock;
import com.parking.Controller.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class BillingControllerTest {
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPayCreditCardSuccess() {
		BillingServiceFacade bilservfac = new BillingServiceImpMock(true);
		BillingController bc = new BillingController(bilservfac);
		BillingInfo info = new BillingInfo();
		ResponseEntity<ConfirmationMsg> rs = bc.payCreditCard(info);
		assertEquals(rs.getStatusCode(), HttpStatus.OK);
	}
	
	@Test
	public void testPayCreditCardFailure() {
		BillingServiceFacade bilservfac = new BillingServiceImpMock(false);
		BillingController bc = new BillingController(bilservfac);
		BillingInfo info = new BillingInfo();
		ResponseEntity<ConfirmationMsg> rs = bc.payCreditCard(info);
		assertEquals(rs.getStatusCode(), HttpStatus.EXPECTATION_FAILED);
	}
	
	@Test
	public void testPayCreditCardInfoNull() {
		BillingServiceFacade bilservfac = new BillingServiceImpMock(true);
		BillingController bc = new BillingController(bilservfac);
		BillingInfo info = null;
		ResponseEntity<ConfirmationMsg> rs = bc.payCreditCard(info);
		assertEquals(rs.getStatusCode(), HttpStatus.BAD_REQUEST);
	}
	
	

}
