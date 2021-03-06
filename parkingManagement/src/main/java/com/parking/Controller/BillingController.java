package com.parking.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.parking.Model.Billing.BillingServiceFacade;
import com.parking.Model.Domain.BillingInfo;
import com.parking.Model.Domain.ConfirmationMsg;

@Controller
@RequestMapping("/billing")
public class BillingController {

	private BillingServiceFacade facade;

	public BillingController() {

		facade = new BillingServiceFacade();

	}

	public BillingController(BillingServiceFacade facadepm) {

		facade = facadepm;

	}

	/**
	 * @param model
	 * @return ModelAndView
	 */
	@RequestMapping(value = "/BillingPage", method = RequestMethod.GET)
	public ModelAndView getBillingPage(Model model) {
		return new ModelAndView("Billing");
	}

	/**
	 * @param info
	 * @return ResponseEntity<ConfirmationMsg>
	 */
	@RequestMapping(value = "/pay", method = RequestMethod.POST)
	public ResponseEntity<ConfirmationMsg> payCreditCard(BillingInfo info) {

		ConfirmationMsg msg = null;
		 
		HttpStatus status = HttpStatus.OK;
		
		try {

			if (info == null) {
				return new ResponseEntity<ConfirmationMsg>(msg,
						HttpStatus.BAD_REQUEST);
			}
			
			msg = facade.processPayment(info);

			if (!msg.isProcessed()) {

				status = HttpStatus.EXPECTATION_FAILED;

			}

		} catch (Exception e) {
			status = HttpStatus.EXPECTATION_FAILED;
			e.printStackTrace();
		}

		return new ResponseEntity<ConfirmationMsg>(msg, status);

	}

}
