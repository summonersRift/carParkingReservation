package com.parking.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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

	 
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public void AddIncident(IncidentInfo val) { 
		
		incService.add(val); 

	}

	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public List<IncidentInfo> getAll() {

		List<IncidentInfo> result = incService.getAll(); 
		
		return result;

	}

}
