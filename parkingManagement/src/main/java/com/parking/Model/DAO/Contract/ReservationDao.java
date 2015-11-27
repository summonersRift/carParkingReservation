package com.parking.Model.DAO.Contract;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.parking.Model.Domain.Facility;
import com.parking.Model.Domain.ParkingSlot;

public interface ReservationDao { 

	public List<ParkingSlot> findFreeParking(long facilityId, String startdt,
			String enddt);

	public List<Facility> getFacilities(); 

	boolean makeReservation(long spotId, long userId, java.sql.Date startDate,
			java.sql.Date endDate, BigDecimal amount);

}
