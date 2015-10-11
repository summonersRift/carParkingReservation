package com.parking.billing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.parking.billing.service.BillingService;


@Controller
@RequestMapping("/billing")
public class BillingController {
	
	@Autowired
	BillingService billingService;
	
	@RequestMapping( value="/BillingPage", method=RequestMethod.GET )
    public ModelAndView getBillingPage( Model model ) {	        
        return new ModelAndView( "Billing" );
    }
	@RequestMapping( value="/all", method=RequestMethod.GET )
  public String getAll(){
	  
	  
		
		
		return "";
	  
  }
	@RequestMapping( value="/paycc", method=RequestMethod.GET )
	 public String payCreditCard(){
		  
		  return "";
		  
	  }
	@RequestMapping( value="/paycheck", method=RequestMethod.GET )
	 public String payEcheck(){
		  
		  return "";
		  
	  }

}
