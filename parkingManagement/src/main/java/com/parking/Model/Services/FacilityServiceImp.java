package com.parking.Model.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parking.Model.DAO.Contract.FacilityDao;
import com.parking.Model.Domain.Facility;
import com.parking.Model.Services.Contract.FacilityService;

@Service
public class FacilityServiceImp implements FacilityService {

	private FacilityDao facDao;

	@Autowired
	public FacilityServiceImp(FacilityDao dao) {

		facDao = dao;

	}

	@Override
	public List<Facility> getAll() {

		return facDao.getAll();

	}

	@Override
	public Facility getById(Integer id) {
		;
		return facDao.getById(id);

	}

	@Override
	public void addFacility(Facility facility) {
		facDao.add(facility);
	}

	@Override
	public void updateFacility(Facility facility) {
		facDao.update(facility);

	}

}
