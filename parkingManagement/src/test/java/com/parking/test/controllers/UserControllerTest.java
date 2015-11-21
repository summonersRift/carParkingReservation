package com.parking.test.controllers;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;

import com.parking.Controller.UserController;
import com.parking.Model.DAO.UserDaoImp;
import com.parking.Model.DAO.Contract.UserDao;
import com.parking.Model.Services.UserServiceImp;
import com.parking.Model.Services.Contract.UserService;

public class UserControllerTest {

	
	
	UserController userController;
	UserService service;
	UserDao dao;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	
		 dao=new UserDaoImp();
		 service=new UserServiceImp(dao);
		 userController=new UserController(service);
	
	}

	@After
	public void tearDown() throws Exception {
	}

	 

	@Test
	public final void testGetAccountPage() {
	
		//Model model= (Model) new HashMap();
		
		//model.addAttribute("test", "test");  
		//ModelAndView page= userController.getAccountPage(model);
		
		//assert(page.getView()!=null);
		
		 	
	}

	@Test
	public final void testGetAllUsers() {
		//fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testAddUser() {
		//fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testUpdateUser() {
		//fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testRemoveUser() {
		//fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testGetUserByUserName() {
		//fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testGetUserById() {
		
		
		//fail("Not yet implemented"); // TODO
	
	
	
	}

	@Test
	public final void testSignIn() {
		//fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testSignOut() {
		//fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testGetSideBar() {
		//fail("Not yet implemented"); // TODO
	}

}
