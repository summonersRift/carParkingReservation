package com.parking.Model.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.parking.Model.DAO.Contract.ReservationDao;
import com.parking.Model.Domain.ParkingSlot;
import com.parking.common.BaseDao;

@Repository
public class ReservationDaoImp extends BaseDao implements ReservationDao {

	@Override
	public void updateSpot(long spotId, long userId) {

	//Validate input values
	//call db update
	
	
	}

	@Override
	public List<ParkingSlot> findFreeParking(long facilityId) {

		List<ParkingSlot> result = new ArrayList<ParkingSlot>();
		ParkingSlot slot1 = new ParkingSlot();
		ParkingSlot slot2 = new ParkingSlot();
		ParkingSlot slot3 = new ParkingSlot();
		ParkingSlot slot4 = new ParkingSlot();
		result.add(slot1);
		result.add(slot2);
		result.add(slot3);
		result.add(slot4);
      //TODO:query the database and get map the results using a result set 
		return result;

	}

	@Override
	public List<ParkingSlot> findFreeParking(long facilityId, String startdt,
			String enddt) {
		List<ParkingSlot> result = new ArrayList<ParkingSlot>();
		
		ParkingSlot slot1 = new ParkingSlot();
		 slot1.setFloor("third");
		 slot1.setGarageNumber("IC239");
		 slot1.setNumber(12233);
		
		 ParkingSlot slot2 = new ParkingSlot();
		slot2.setFloor("third");
		slot2.setGarageNumber("IC239");
		slot2.setNumber(2334);
		
		ParkingSlot slot3 = new ParkingSlot();
		slot3.setFloor("second");
		slot3.setGarageNumber("IC238");
		slot3.setNumber(2334);
		
		ParkingSlot slot4 = new ParkingSlot();
		slot4.setFloor("first");
		slot4.setGarageNumber("IC237");
		slot4.setNumber(2334);
		
		result.add(slot1);
		result.add(slot2);
		result.add(slot3);
		result.add(slot4);
      //TODO:query the database and get map the results using a result set 
		return result;
	}

}
