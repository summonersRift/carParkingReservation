package com.parking.test.controllers;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.parking.Controller.FacilityController;
import com.parking.Model.DAO.Contract.FacilityDao;
import com.parking.Model.Domain.Facility;
import com.parking.Model.Services.Contract.FacilityService;
import com.parking.test.model.services.FacilityServiceImpMock;

public class FacilityControllerTest {

	FacilityDao dao;
	
	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}

	
	
	@Test
	public void testAddFacility() {
		Facility facility = new Facility();
		facility.setAddressLine1("Miami 104 aven");
		facility.setCity("Miami");
		facility.setState("FL");
		facility.setZipCode(33174);
		facility.setNumberOfSpots(345);
		facility.setName("PG6name");
		FacilityService facserv = new FacilityServiceImpMock(dao);
		FacilityController faccontrol = new FacilityController(facserv);
		ResponseEntity<Boolean> fac = faccontrol.AddFacility(facility);
		assertEquals(HttpStatus.OK,fac.getStatusCode());
	}
	
	@Test
	public void testUpdateFacility() {
		Facility facility = new Facility();
		facility.setAddressLine1(" 104 aven");
		facility.setCity("Miami");
		facility.setFacilityID(2);
		facility.setState("FL");
		facility.setZipCode(33174);
		facility.setNumberOfSpots(345);
		facility.setName("PG6name");
		FacilityService facserv = new FacilityServiceImpMock(dao);
		FacilityController faccontrol = new FacilityController(facserv);
		ResponseEntity<Boolean> rs =  faccontrol.UpdateFacility(facility);
		assertEquals(HttpStatus.OK,rs.getStatusCode());
	}

}
