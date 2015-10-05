package com.parking.reservation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/reservation")
public class ReservationController {
	
	@RequestMapping( value="/ReservationPage", method=RequestMethod.GET )
    public ModelAndView getIncidentsPage( Model model ) {	        
        return new ModelAndView( "Reservation" );
    }

}
