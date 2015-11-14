package com.parking.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.parking.Model.Domain.User;
import com.parking.Model.Services.Contract.UserService;
import com.parking.common.LoginRequest;
 

@Controller
@RequestMapping("/facility")

public class FacilityController {

	@Autowired
	UserService adminService;

	@RequestMapping(value = "/FacilityPage", method = RequestMethod.GET)
	public ModelAndView getFacilityPage(Model model) {
		return new ModelAndView("Facility");
	}

 
 

	@RequestMapping("/layout")
	public String getIndexPage() {
		return "login/layout";

	}

  
	//------------Facility portion-------------------------
	/**
	 * 
	 */
	public void AddFacility() { 
		// TODO Auto-generated method
	 }

	/**
	 * 
	 */
	public void getAllFacilities() { 
		// TODO Auto-generated method
	 }

	/**
	 * 
	 * @param facilityID 
	 */
	public void UpdateFacility(Integer facilityID) { 
		// TODO Auto-generated method
	 }

	/**
	 * 
	 * @param facilityID 
	 */
	public void GetFacility(Integer facilityID) { 
		// TODO Auto-generated method
	 } 
	
	
	
	
}
