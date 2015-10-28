package com.parking.business.contract;

import java.util.List;

import com.parking.common.SpotInfo;
import com.parking.domain.User;


public interface RegistrationService {

	List<User> getAll();

	void addSpot(long spotId, long userId);

	void updateSpot(long spotId, long userId);

	List<SpotInfo> getSpotsByFacility(long facilityId);

}
