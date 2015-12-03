package com.parking.test.controllers;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.parking.Controller.IncidentsController;
import com.parking.Model.DAO.Contract.IncidentsDao;
import com.parking.Model.Domain.Facility;
import com.parking.Model.Domain.Incident;
import com.parking.Model.Domain.IncidentInfo;
import com.parking.Model.Services.Contract.IncidentsService;
import com.parking.test.model.services.IncidentsServiceMockImp;

public class IncidentsControllerTest {

	IncidentsDao incidao;
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddIncident() {
		Incident incident = new Incident();		
		IncidentsService service = new IncidentsServiceMockImp(incidao);
		IncidentsController incidcontrol = new IncidentsController(service);
		ResponseEntity<Boolean> rs = incidcontrol.AddIncident(incident);
		assertEquals(HttpStatus.OK, rs.getStatusCode());		
		
	}

	@Test
	public void testGetAll() {
		IncidentsService service = new IncidentsServiceMockImp();
		IncidentsController incidcontrol = new IncidentsController(service);
		ResponseEntity<List<Incident>> lisfac = incidcontrol.getAll();
		assertEquals(lisfac.getStatusCode(), HttpStatus.OK);
	}
	

}
