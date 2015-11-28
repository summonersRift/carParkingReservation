package com.parking.Model.Services.Contract;

 
import java.util.List;

import com.parking.Model.Domain.Incident;
 
public interface IncidentsService {

	List<Incident> getAll();

	void add(Incident val);

	 

}
