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
import com.parking.Model.Domain.User;

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

	@RequestMapping(value = "/BillingPage", method = RequestMethod.GET)
	public ModelAndView getBillingPage(Model model) {
		return new ModelAndView("Billing");
	}

	@RequestMapping(value = "/pay", method = RequestMethod.POST)
	public ResponseEntity<ConfirmationMsg> payCreditCard(BillingInfo info,
			User user) {

		ConfirmationMsg msg = null;
		String error;
		HttpStatus status = HttpStatus.OK;
		try {

			msg = facade.processPayment(info, user);
			error = msg.getError();

			if (error != null) {

				status = HttpStatus.EXPECTATION_FAILED;

			}

		} catch (Exception e) {
			status = HttpStatus.EXPECTATION_FAILED;
			e.printStackTrace();
		}

		return new ResponseEntity<ConfirmationMsg>(msg, status);

	}

}
