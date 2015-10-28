package com.parking.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.parking.notification.contract.NotificationService;


@Controller
@RequestMapping("/notification")
public class NotificationController {
	@Autowired
	NotificationService rideService;
	
	
	@RequestMapping(value = "/notify/{value}", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<String> notificationEngine(
			@PathVariable("value") String value) {

		return new ResponseEntity<String>(HttpStatus.OK);

	}

}
