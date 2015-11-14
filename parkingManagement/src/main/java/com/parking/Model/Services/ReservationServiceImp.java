package com.parking.Model.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.parking.Model.Services.Contract.ReservationService;
import com.parking.common.SpotInfo;
@Service
public class ReservationServiceImp implements ReservationService {

	@Override
	public void updateSpot(long spotId, long userId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<SpotInfo> findFreeParking(long facilityId) {
		// TODO Auto-generated method stub
		return null;
	}

}
