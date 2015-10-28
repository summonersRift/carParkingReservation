package com.parking.facade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

 
 
 

@Controller
@RequestMapping("/reservation")
public class ReservationController {
	
	@RequestMapping( value="/ReservationPage", method=RequestMethod.GET )
    public ModelAndView getIncidentsPage( Model model ) {	        
        return new ModelAndView( "Reservation" );
    }

	//@Autowired
	//private com.parking.reservation.service.RegistrationService registrationService;
 
  
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public @ResponseBody void addSpot(@RequestBody long spotId,@RequestBody long userId) {
		//com.parking.reservation.service.RegistrationService.addSpot(spotId,userId);
	}

	@RequestMapping(value = "/udpate", method = RequestMethod.PUT)
	public @ResponseBody void updateSpot(@RequestBody long spotId,@RequestBody long userId) {
		//registrationService.updateSpot(spotId,userId);
	}
 
/*
	@RequestMapping(value = "/findspot/facility/{id}", method = RequestMethod.GET)
	public @ResponseBody List<SpotInfo> getFreeSpots(
			@PathVariable("id") long facilityId) {
		return null;
		
		//return registrationService.getSpotsByFacility(facilityId);
	
	
	}
  */

}
