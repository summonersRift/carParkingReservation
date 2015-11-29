package com.parking.Model.DAO.Contract;

import java.util.List;

import com.parking.Model.Domain.Facility;

public interface FacilityDao { 
	
	/**
	 * @param facility
	 */
	void add(Facility facility);

	/**
	 * @param facility
	 */
	void update(Facility facility);

	/**
	 * @return
	 */
	List<Facility> getAll();

	/**
	 * @param fac_id
	 * @return
	 */
	Facility getById(Integer fac_id);

}
