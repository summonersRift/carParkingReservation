package com.parking.test.controllers;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.parking.Controller.UserController;
import com.parking.Model.DAO.Contract.UserDao;
import com.parking.Model.Domain.RequestUser;
import com.parking.Model.Services.Contract.UserService;
import com.parking.common.LoginRequest;
import com.parking.test.model.services.UsersServiceMockImp;

public class UserControllerTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddUserFailure() {
		//fail("Not yet implemented");
		RequestUser rq = null;
		UserService userv = new UsersServiceMockImp();
		UserController usercont = new UserController(userv);
		ResponseEntity<String> rs = usercont.addUser(rq);
		assertEquals(HttpStatus.BAD_REQUEST, rs.getStatusCode());
		
	}
	





}
