package com.parking.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.parking.Model.Domain.Incident;
import com.parking.Model.Services.Contract.IncidentsService;

 

@Controller
@RequestMapping("/incidents")
public class IncidentsController {

	private IncidentsService incService;

	@Autowired
	public IncidentsController(IncidentsService service) {
		incService = service;
	}

	/**
	 * @param model
	 * @return ModelAndView
	 */
	@RequestMapping(value = "/IncidentsPage", method = RequestMethod.GET)
	public ModelAndView getIncidentsPage(Model model) {
		return new ModelAndView("Incidents");
	}

	/**
	 * @param val
	 * @return ResponseEntity<Boolean>
	 */
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ResponseEntity<Boolean> AddIncident(Incident val) {

		incService.add(val);

		return new ResponseEntity<Boolean>(true, HttpStatus.OK);
	}

	 
	/**
	 * @return ResponseEntity
	 */
	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public ResponseEntity<List<Incident>> getAll() {
		List<Incident> result = incService.getAll();// = incService.getAll();
		return new ResponseEntity<List<Incident>>(result, HttpStatus.OK);

	}

}
