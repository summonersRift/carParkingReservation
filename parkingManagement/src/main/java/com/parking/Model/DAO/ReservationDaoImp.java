package com.parking.Model.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.parking.Model.DAO.Contract.ReservationDao;
import com.parking.Model.Domain.Facility;
import com.parking.Model.Domain.ParkingSlot;
import com.parking.common.BaseDao;

@Repository
public class ReservationDaoImp extends BaseDao implements ReservationDao {

	private static final String FIND_FREE_PARKING = "select *,(select fac.f_name from pmsys.facilities fac where fac.facility_id = ? ) as facility_name from pmsys.parking_spots sps "
			+ "WHERE sps.facility_id= ? "
			+ "and sps.ps_id not in(select preserv.ps_id  "
			+ "from pmsys.reservations preserv "
			+ "where "
			+ "preserv.start_date "
			+ ">= STR_TO_DATE( ? , '%Y-%m-%d')  "
			+ "AND preserv.end_date <= " + "STR_TO_DATE( ? , '%Y-%m-%d') ) ";

	@Override
	public void updateSpot(long spotId, long userId) {

		// Validate input values
		// call db update

	}

	@Override
	public List<ParkingSlot> findFreeParking(long facilityId, String startdt,
			String enddt) {
		List<ParkingSlot> result = new ArrayList<ParkingSlot>();
		getConnection();
		ResultSet rs = null;
		java.sql.PreparedStatement updateemp = null;
		try {

			updateemp = connection.prepareStatement(FIND_FREE_PARKING);

			updateemp.setLong(1, facilityId);
			updateemp.setLong(2, facilityId);
			updateemp.setString(3, startdt);
			updateemp.setString(4, enddt);

			rs = updateemp.executeQuery();
			ParkingSlot pklot = null;
			while (rs.next()) {

				pklot = new ParkingSlot();
				pklot.setParkNumber(rs.getInt("parkingNbr"));
				pklot.setLocation(rs.getString("facility_name"));
				pklot.setNumber(rs.getInt("ps_id"));
				pklot.setFloor(rs.getString("level"));
				result.add(pklot);
			}

		} catch (SQLException e) {

			e.printStackTrace();

		} finally {

			try {
				if (rs != null) {
					rs.close();
				}
				// close statement
				if (updateemp != null)
					updateemp.close();
				// close resultset

			} catch (SQLException e) {
				e.printStackTrace();
			}

			// closeConnection();
		}

		return result;
	}

	@Override
	public List<Facility> getFacilities() {
		
		java.sql.PreparedStatement updateemp = null;

		List<Facility> facilityLst = new ArrayList<Facility>();
		getConnection();

		ResultSet rs = null;
		Facility facility = null;
		try {

			updateemp = connection
					.prepareStatement(" SELECT *  FROM pmsys.facilities");

			rs = updateemp.executeQuery();

			while (rs.next()) {
				facility = new Facility();
				facility.setId(rs.getInt("facility_id"));
				facility.setName(rs.getString("f_name"));
				facilityLst.add(facility);
			}

		} catch (SQLException e) {

			e.printStackTrace();

		} finally {

			try {
				if (rs != null) {
					rs.close();
				}
				// close statement
				if (updateemp != null)
					updateemp.close();
				// close resultset

			} catch (SQLException e) {
				e.printStackTrace();
			}

			// closeConnection();
		}

		return facilityLst;
	}

}
