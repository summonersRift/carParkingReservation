package com.parking.test.controllers;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ BillingControllerTest.class, FacilityControllerTest.class, IncidentsControllerTest.class,
		MarketingControllerTest.class, ReservationControllerTest.class, UserControllerTest.class })
public class AllControllerTests {

}
