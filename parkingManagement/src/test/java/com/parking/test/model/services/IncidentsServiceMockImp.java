package com.parking.test.model.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.parking.Model.DAO.Contract.IncidentsDao;
import com.parking.Model.Domain.Incident;
import com.parking.Model.Domain.IncidentInfo;
import com.parking.Model.Services.Contract.IncidentsService;

public class IncidentsServiceMockImp implements IncidentsService {

	private IncidentsDao dao;

	@Autowired
	public IncidentsServiceMockImp(IncidentsDao daopm) { 
		dao = daopm; 
	}
	
	public IncidentsServiceMockImp() {
		
	}
	
	@Override
	public List<Incident> getAll() {
		// TODO Auto-generated method stub
		List<Incident> listinfo = new ArrayList<Incident>();
		Incident incident = new Incident();
		incident.setIncidentID(new Long(1));
		incident.setDescription("car accident");
		incident.setLocation(11);
		incident.setDate("11/30/2015");
		listinfo.add(incident);
		return listinfo;
	}

	@Override
	public void add(Incident val) {
		// TODO Auto-generated method stub
		
	}
	

}
