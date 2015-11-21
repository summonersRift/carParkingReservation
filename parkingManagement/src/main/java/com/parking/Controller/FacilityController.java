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

import com.parking.Model.Domain.Facility;
import com.parking.Model.Domain.User;
import com.parking.Model.Services.Contract.FacilityService;
import com.parking.Model.Services.Contract.UserService;
import com.parking.common.LoginRequest;

@Controller
@RequestMapping("/facility")
public class FacilityController {

	private FacilityService facService;

	// paremeter injection
	@Autowired
	public FacilityController(FacilityService service) {

		facService = service;

	}

	@RequestMapping(value = "/FacilityPage", method = RequestMethod.GET)
	public ModelAndView getFacilityPage(Model model) {
		return new ModelAndView("Facility");
	}

	@RequestMapping("/layout")
	public String getIndexPage() {
		return "login/layout";

	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public void AddFacility(Facility facility) {
		facService.addFacility(facility);
	}

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public @ResponseBody List<Facility> getAllFacilities() {
		
		List<Facility> list = new ArrayList<Facility>();
		
		Facility facility = new Facility();
		facility.setAddressLine1("Address 1");
		facility.setCity("Miami");
		facility.setName("Facility 1");
		facility.setPhoneNumber("2345436765");
		facility.setState("FL");
		facility.setZipCode(23423);
		list.add(facility);
		
		return list;
		//return facService.getAll();

	}
	
	

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public void UpdateFacility(Facility facility) {

		facService.updateFacility(facility);
	}

	@RequestMapping(value = "/getbyid/{id}", method = RequestMethod.POST)
	public Facility GetFacility(Integer id) {
		
		return facService.getById(id);

	}

}
