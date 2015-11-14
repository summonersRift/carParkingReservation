package com.parking.Model.Services.Contract;

import java.util.List;

import com.parking.Model.Domain.ParkingSlot;

public interface ReservationService {

	void updateSpot(long spotId, long userId);

	List<ParkingSlot> findFreeParking(long facilityId);

}
