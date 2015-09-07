package com.parking.history.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/history")

public class HistoryController {
	
	 
	 @RequestMapping( value="/HistoryPage", method=RequestMethod.GET )
	    public ModelAndView getHistoryPage( Model model ) {	        
	        return new ModelAndView( "History" );
	    }


}
