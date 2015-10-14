package com.parking.network.management.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/networkmanagement")
public class NetworkManagementController {

	 
	 @RequestMapping( value="/NetworkPage", method=RequestMethod.GET )
	    public ModelAndView getHistoryPage( Model model ) {	        
	        return new ModelAndView( "NetworkMgt" );
	    }
	 
	 	

}

