package com.parking.Model.Services.Contract;

import java.util.List;

import com.parking.common.SpotInfo;

public interface ReservationService {

	void updateSpot(long spotId, long userId);

	List<SpotInfo> findFreeParking(long facilityId);

}
