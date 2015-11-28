package com.parking.Model.DAO.Contract;

import java.util.List;

import com.parking.Model.Domain.Incident;
import com.parking.Model.Domain.IncidentInfo;

public interface IncidentsDao {

	List<Incident> getAll();

	void add(Incident val);

}
