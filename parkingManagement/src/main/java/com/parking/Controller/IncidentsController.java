package com.parking.Controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.parking.Model.Domain.Facility;
import com.parking.Model.Domain.Incident;
import com.parking.Model.Domain.IncidentInfo;
import com.parking.Model.Services.Contract.IncidentsService;

@Controller
@RequestMapping("/incidents")
public class IncidentsController {

	private IncidentsService incService;

	@Autowired
	public IncidentsController(IncidentsService service) {
		incService = service;
	}

	@RequestMapping(value = "/IncidentsPage", method = RequestMethod.GET)
	public ModelAndView getIncidentsPage(Model model) {
		return new ModelAndView("Incidents");
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ResponseEntity<Boolean> AddIncident(Incident val) {

		incService.add(val);

		return new ResponseEntity<Boolean>(true, HttpStatus.OK);
	}

	 
	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public ResponseEntity<List<Incident>> getAll() {

		List<Incident> result = incService.getAll();// = incService.getAll();

//		Incident info1 = new Incident();
//		info1.setDescription("problem with the parking");
		// Date dt = new Date(20015, 12, 2);
//		info1.setLocation(1);
//		info1.setDate("2015/12/1");
//		result.add(info1);

		return new ResponseEntity<List<Incident>>(result, HttpStatus.OK);

	}

}
