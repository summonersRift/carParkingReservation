package com.parking.Model.Services.Contract;

import java.util.List;

import com.parking.Model.Domain.Facility;

public interface FacilityService {

	public List<Facility> getAll();

	public Facility getById(Integer id);

	public void addFacility(Facility facility);

	public void updateFacility(Facility facility);

}
