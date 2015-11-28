package com.parking.Model.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parking.Model.DAO.Contract.IncidentsDao;
import com.parking.Model.Domain.Incident;
import com.parking.Model.Services.Contract.IncidentsService;

@Service
public class IncidentsServiceImp implements IncidentsService {

	private IncidentsDao dao;

	@Autowired
	public IncidentsServiceImp(IncidentsDao daopm) { 
		dao = daopm; 
	}

	@Override
	public List<Incident> getAll() {

		return dao.getAll();
	}

	@Override
	public void add(Incident val) {
		dao.add(val);

	}

}
