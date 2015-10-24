package com.parking.registration.service;

import java.util.List;

import com.parking.domain.common.User;
import com.parking.reservation.domain.SpotInfo;

public interface RegistrationService {

	List<User> getAll();

	void addSpot(long spotId, long userId);

	void updateSpot(long spotId, long userId);

	List<SpotInfo> getSpotsByFacility(long facilityId);

}
