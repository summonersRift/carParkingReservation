package com.parking.Model.DAO.Contract;

import java.util.List;

import com.parking.Model.Domain.Facility;

public interface FacilityDao {

	
	
	
	
	
	void add(Facility facility);

	void update(Facility facility);

	List<Facility> getAll();

	Facility getById(Integer fac_id);

}
