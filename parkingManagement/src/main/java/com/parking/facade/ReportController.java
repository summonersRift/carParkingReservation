package com.parking.facade;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/report")
public class ReportController {
	
	@RequestMapping( value="/ReportPage", method=RequestMethod.GET )
    public ModelAndView getReportPage( Model model ) {	        
        return new ModelAndView( "Report" );
    }
 

}
