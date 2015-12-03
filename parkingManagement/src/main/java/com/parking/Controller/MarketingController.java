package com.parking.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

 

import com.parking.Model.Services.Contract.MarketingService;
import com.parking.Model.Services.MailServiceImp;
import com.parking.Model.Services.Contract.MailService;
import com.parking.common.NewsletterPromotionalRequest;

 
@Controller
@RequestMapping("/marketing")
public class MarketingController {
  
	private MarketingService markService;

	@Autowired
	public MarketingController(MarketingService service) {

		markService = service;

	}
	
	/**
	 * @param model
	 * @return ModelAndView
	 */
	@RequestMapping(value = "/MarketingPage", method = RequestMethod.GET)
	public ModelAndView getIncidentsPage(Model model) {

		return new ModelAndView("Marketing");
	}
	
	/**
	 * @param promotion
	 * @return ResponseEntity 
	 */
	@RequestMapping(value = "/promotionalnewsletter", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<String> promotionalnewsletter( NewsletterPromotionalRequest promotion) {
		System.out.println("In marketing controller.");
		//System.out.println("In marketing controller."+promotion.toString()+" rec:"+promotion.getRecipients()+"   "+promotion.getSubject()+"  "+promotion.getMailbody());
		
		if (promotion == null || promotion.getRecipients() == null|| promotion.getSubject() == null|| promotion.getMailbody() == null) {
			// the client side
			return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
		}
		
		MailService mail = new MailServiceImp(promotion.getRecipients(), promotion.getSubject(), promotion.getMailbody(), true);
		
		//Push notifications to database mail.status()
		return new ResponseEntity<String>("Promotional offer and newsletter E-mail sent. Status(ewquested/sent): "+mail.status() ,HttpStatus.OK);
	}
		
	
	/**
	 * @param model
	 * @return ModelAndView
	 */
	@RequestMapping(value = "/load", method = RequestMethod.GET)
	public ModelAndView loadMarketingLandingPage(Model model) {
		return new ModelAndView("Marketing");
	}

	/**
	 * @param value
	 * @return
	 */
	@RequestMapping(value = "/notify/{value}", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<String> notifyUser(@PathVariable("value") String value) {

		return new ResponseEntity<String>(HttpStatus.OK);

	}

	public void requestNewsletterPromotionalPage() {
		// TODO:need to call the services.
	}

	/**
	 * 
	 * @param content
	 * @param recipients
	 * @param emailSubject
	 */
	public boolean validatePromotionalEmailParams(String content,
			String recipients, String emailSubject) {

		// need to call the services
		return true;
	}

	/**
	 * 
	 */
	public void replyNewsletterPromotionalPage() { 

		markService.replyNewsletterPromotionalPage();
	}

}
