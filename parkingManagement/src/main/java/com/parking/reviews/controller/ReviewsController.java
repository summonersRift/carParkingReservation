package com.parking.reviews.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/reviews")

public class ReviewsController {
	
	 @RequestMapping( value="/ReviewsPage", method=RequestMethod.GET )
	    public ModelAndView getReviewsPage( Model model ) {	        
	        return new ModelAndView( "Reviews" );
	    }
	 

}
