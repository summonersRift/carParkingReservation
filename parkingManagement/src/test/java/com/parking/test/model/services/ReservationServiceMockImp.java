package com.parking.test.model.services;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.parking.Model.DAO.Contract.ReservationDao;
import com.parking.Model.Domain.Facility;
import com.parking.Model.Domain.ParkingSlot;
import com.parking.Model.Services.Contract.ReservationService;

public class ReservationServiceMockImp implements ReservationService{

	private ReservationDao resDao;

	@Autowired
	public ReservationServiceMockImp(ReservationDao dao) {
		resDao = dao;
	}
	
	public ReservationServiceMockImp() {
	}
	@Override
	public List<ParkingSlot> findFreeParking(long facilityId, String startdt,
			String enddt) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Facility> getByFacilities() {
		// TODO Auto-generated method stub
		List<Facility> listFac = new ArrayList<Facility>();
		Facility fac = new Facility();
		fac.setId(3);
		fac.setName("PG6");
		listFac.add(fac);
		return listFac;
	}

	@Override
	public boolean makeReservation(long spotId, long userId, Date startDate,
			Date endDate, BigDecimal amount) { 
		return true;
	}

}
