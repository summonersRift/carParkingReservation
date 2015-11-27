package com.parking.Model.Services.Contract;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

import com.parking.Model.Domain.Facility;
import com.parking.Model.Domain.ParkingSlot;

public interface ReservationService { 

	List<ParkingSlot> findFreeParking(long facilityId, String startdt,
			String enddt);

	List<Facility> getByFacilities();

	boolean makeReservation(long spotId, long userId, Date startDate,
			Date endDate, BigDecimal amount);

}
