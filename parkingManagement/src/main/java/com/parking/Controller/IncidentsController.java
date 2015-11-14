package com.parking.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.parking.Model.Services.Contract.IncidentsService;

@Controller
@RequestMapping("/incidents")

public class IncidentsController {

	 
	
	 @RequestMapping( value="/IncidentsPage", method=RequestMethod.GET )
	    public ModelAndView getIncidentsPage( Model model ) {	        
	        return new ModelAndView( "Incidents" );
	    }
	 
}
