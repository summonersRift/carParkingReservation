package com.parking.Model.DAO.Contract;

import java.util.List;

import com.parking.Model.Domain.ParkingSlot;

public interface ReservationDao {
	public void updateSpot(long spotId, long userId);

	public List<ParkingSlot> findFreeParking(long facilityId);

	public List<ParkingSlot> findFreeParking(long facilityId, String startdt,
			String enddt);

}
