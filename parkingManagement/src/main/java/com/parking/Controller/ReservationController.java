package com.parking.Controller;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.parking.Model.Domain.Facility;
import com.parking.Model.Domain.ParkingSlot;
import com.parking.Model.Services.Contract.ReservationService;
import com.parking.common.ReservationRequest;

@Controller
@RequestMapping("/reservation")
public class ReservationController {

	/**
	 * @param model
	 * @return ModelAndView
	 */
	@RequestMapping(value = "/ReservationPage", method = RequestMethod.GET)
	public ModelAndView getIncidentsPage(Model model) {

		return new ModelAndView("Reservation");
	}

	private ReservationService resService;

	@Autowired
	public ReservationController(ReservationService reservService) {

		resService = reservService;

	}

	/**
	 * @param resreq
	 * @return ResponseEntity<Boolean>
	 */
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ResponseEntity<Boolean> addSpot(ReservationRequest resreq) {

		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
		Date startdate;
		Boolean result = false;
		try {
			startdate = formatter.parse(resreq.getStartDate());
			Date enddate = formatter.parse(resreq.getEndDate());

			java.sql.Date sqlStartDate = new java.sql.Date(startdate.getTime());
			java.sql.Date sqlEndDate = new java.sql.Date(enddate.getTime());

			result = resService.makeReservation(resreq.getParkingId(),
					resreq.getUserId(), sqlStartDate, sqlEndDate,
					new BigDecimal("5"));

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ResponseEntity<Boolean>(result, HttpStatus.OK);

	}

	/**
	 * @param facilityId
	 * @param startdt
	 * @param enddt
	 * @return ResponseEntity<List<ParkingSlot>>
	 */
	@RequestMapping(value = "/findspot/facility/{id}/{start}/{end}", method = RequestMethod.GET)
	public ResponseEntity<List<ParkingSlot>> getFreeSpots(
			@PathVariable("id") long facilityId,
			@PathVariable("start") String startdt,
			@PathVariable("end") String enddt) {

		List<ParkingSlot> lst = resService.findFreeParking(facilityId, startdt,
				enddt);
		return new ResponseEntity<List<ParkingSlot>>(lst, HttpStatus.OK);

	}

	/**
	 * @return ResponseEntity<List<Facility>>
	 */
	@RequestMapping(value = "/getallfacilities", method = RequestMethod.GET)
	public ResponseEntity<List<Facility>> getFacilities() {

		List<Facility> ls = resService.getByFacilities();

		return new ResponseEntity<List<Facility>>(ls, HttpStatus.OK);
	}

}
