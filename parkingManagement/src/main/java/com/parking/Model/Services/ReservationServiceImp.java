package com.parking.Model.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parking.Model.DAO.Contract.ReservationDao;
import com.parking.Model.Domain.Facility;
import com.parking.Model.Domain.ParkingSlot;
import com.parking.Model.Services.Contract.ReservationService;

@Service
public class ReservationServiceImp implements ReservationService {

	private ReservationDao resDao;

	@Autowired
	public ReservationServiceImp(ReservationDao dao) {
		resDao = dao;
	}

	@Override
	public void updateSpot(long spotId, long userId) {
		resDao.updateSpot(spotId, userId);

	}

	@Override
	public List<ParkingSlot> findFreeParking(long facilityId, String startdt,
			String enddt) {
		return resDao.findFreeParking(facilityId, startdt, enddt);
	}

	@Override
	public List<Facility> getByFacilities() {
		 
		return resDao.getFacilities();
	}

}
