package com.parking.test.controllers;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.parking.Controller.ReservationController;
import com.parking.Model.Domain.Facility;
import com.parking.Model.Services.Contract.ReservationService;
import com.parking.common.ReservationRequest;
import com.parking.test.model.services.ReservationServiceMockImp;

public class ReservationControllerTest {

	ReservationService reserv;
	ReservationController reservcontrol;
	ReservationRequest reservreq;
	@Before
	public void setUp() throws Exception {
		reservreq = new ReservationRequest();
		reservreq.setEndDate("2015-11-30");
		reservreq.setStartDate("2015-11-30");
		reservreq.setUserId(new Long(1));
		reservreq.setParkingId(new Long(11));
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddSpot() {
		//fail("Not yet implemented");
		reserv = new ReservationServiceMockImp();
		reservcontrol = new ReservationController(reserv);
		ResponseEntity<Boolean> rs = reservcontrol.addSpot(reservreq);
		assertEquals(HttpStatus.OK, rs.getStatusCode());
	}


	@Test
	public void testGetFacilities() {
		//fail("Not yet implemented");
		reserv = new ReservationServiceMockImp();
		reservcontrol = new ReservationController(reserv);
		ResponseEntity<List<Facility>> rs =  reservcontrol.getFacilities();
		assertEquals(HttpStatus.OK, rs.getStatusCode());
	}

}
