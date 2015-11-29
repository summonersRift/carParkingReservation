package com.parking.Model.DAO.Contract;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.parking.Model.Domain.Facility;
import com.parking.Model.Domain.ParkingSlot;

public interface ReservationDao { 

	/**
	 * @param facilityId
	 * @param startdt
	 * @param enddt
	 * @return List<ParkingSlot>
	 */
	public List<ParkingSlot> findFreeParking(long facilityId, String startdt,
			String enddt);

	/**
	 * @return
	 */
	public List<Facility> getFacilities(); 

	/**
	 * @param spotId
	 * @param userId
	 * @param startDate
	 * @param endDate
	 * @param amount
	 * @return boolean
	 */
	boolean makeReservation(long spotId, long userId, java.sql.Date startDate,
			java.sql.Date endDate, BigDecimal amount);

}
