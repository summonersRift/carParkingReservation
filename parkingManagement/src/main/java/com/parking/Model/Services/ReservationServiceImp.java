package com.parking.Model.Services;

import java.math.BigDecimal;
import java.sql.Date;
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
	public boolean makeReservation(long spotId, long userId, Date startDate,
			Date endDate, BigDecimal amount) {
		return resDao.makeReservation(spotId, userId, startDate, endDate,
				amount);

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
