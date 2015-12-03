package com.parking.test.model.services;

import java.util.ArrayList;
import java.util.List;

import com.parking.Model.DAO.Contract.FacilityDao;
import com.parking.Model.Domain.Facility;
import com.parking.Model.Services.Contract.FacilityService;

public class FacilityServiceImpMock implements FacilityService {

	private FacilityDao facDao;
	public FacilityServiceImpMock(FacilityDao dao) {
		// TODO Auto-generated constructor stub
		facDao = dao;
	}
	
	@Override
	public List<Facility> getAll() {
		List<Facility> LisFac = new ArrayList<Facility>();
		Facility gac = new Facility();
		gac.setAddressLine1("SW 104 path");
		gac.setCity("Miami");
		gac.setName("PG6");
		gac.setNumberOfSpots(123);
		gac.setState("FL");
		gac.setZipCode(33174);
		LisFac.add(gac);
		return LisFac;
	}

	@Override
	public Facility getById(Integer id) {
		// TODO Auto-generated method stub
		Facility fac = new Facility();
		fac.setCity("Newyork");
		fac.setState("Newyork");
		return fac;
	}

	@Override
	public void addFacility(Facility facility) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateFacility(Facility facility) {
		// TODO Auto-generated method stub
		
	}

}
