package com.parking.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.parking.Model.Services.Contract.ReservationService;
import com.parking.common.SpotInfo;

@Controller
@RequestMapping("/reservation")
public class ReservationController {

	@RequestMapping(value = "/ReservationPage", method = RequestMethod.GET)
	public ModelAndView getIncidentsPage(Model model) {
		return new ModelAndView("Reservation");
	}

	private ReservationService resService;

	@Autowired
	public ReservationController(ReservationService reservService) {

		resService = reservService;

	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public @ResponseBody void addSpot(@RequestBody long spotId,
			@RequestBody long userId) {
		// com.parking.reservation.service.RegistrationService.addSpot(spotId,userId);
	}

	@RequestMapping(value = "/udpateReservation", method = RequestMethod.PUT)
	public @ResponseBody void updateSpot(@RequestBody long spotId,
			@RequestBody long userId) {
		resService.updateSpot(spotId, userId);
	}

	@RequestMapping(value = "/findspot/facility/{id}", method = RequestMethod.GET)
	public ResponseEntity<List<SpotInfo>> getFreeSpots(
			@PathVariable("id") long facilityId) {

		// call service to get free spots
		List<SpotInfo> lst = resService.findFreeParking(facilityId);

		return new ResponseEntity<List<SpotInfo>>(lst, HttpStatus.OK);

	}

}
