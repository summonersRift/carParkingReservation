package com.parking.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin")

public class AdminController {
	
	
	@RequestMapping( value="/FacilityPage", method=RequestMethod.GET )
    public ModelAndView getIncidentsPage( Model model ) {	        
        return new ModelAndView( "Facility" );
    }

}
