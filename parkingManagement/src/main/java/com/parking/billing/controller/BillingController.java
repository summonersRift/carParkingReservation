package com.parking.billing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/billing")
public class BillingController {
	
	@RequestMapping( value="/BillingPage", method=RequestMethod.GET )
    public ModelAndView getBillingPage( Model model ) {	        
        return new ModelAndView( "Billing" );
    }

}
