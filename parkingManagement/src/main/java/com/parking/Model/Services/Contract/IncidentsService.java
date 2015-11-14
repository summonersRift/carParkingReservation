package com.parking.Model.Services.Contract;

 
import com.parking.Model.Domain.IncidentInfo;

public interface IncidentsService {

	java.util.List<IncidentInfo> getAll();

	void add(IncidentInfo val);

}
