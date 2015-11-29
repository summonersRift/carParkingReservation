package com.parking.Model.DAO;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.parking.Model.DAO.Contract.ReservationDao;
import com.parking.Model.Domain.Facility;
import com.parking.Model.Domain.NullUser;
import com.parking.Model.Domain.ParkingSlot;
import com.parking.common.BaseDao;

@Repository
public class ReservationDaoImp extends BaseDao implements ReservationDao {

	private static final String FIND_FREE_PARKING = " select *,(select fac.f_name from pmsys.facilities fac where fac.facility_id = ? ) as facility_name from pmsys.parking_spots sps "
			+ " WHERE sps.facility_id= ? "
			+ " and sps.ps_id not in(select preserv.ps_id  "
			+ " from pmsys.reservations preserv "
			+ " where "
			+ " ( STR_TO_DATE(?, '%Y-%m-%d') >= preserv.start_date "
			+ " AND  STR_TO_DATE(?, '%Y-%m-%d') < preserv.end_date  ) "
			+ " AND ( STR_TO_DATE(?, '%Y-%m-%d') <= preserv.end_date  "
			+ " AND STR_TO_DATE( ?, '%Y-%m-%d') > preserv.start_date ) ) "
			+ " AND sps.available <> 0 ";
	
	
	
 
	private static final String ADD_RESERVATION = " INSERT INTO reservations (ps_id, user_id, start_date, end_date, amount_charged) "
			+ "VALUES (?, ?, ?,?,?)";

	/* (non-Javadoc)
	 * @see com.parking.Model.DAO.Contract.ReservationDao#makeReservation(long, long, java.sql.Date, java.sql.Date, java.math.BigDecimal)
	 */
	@Override
	public boolean makeReservation(long spotId, long userId, Date startDate,
			Date endDate, BigDecimal amount) {

		// Validate input values
		// call db update

		// String sss =
		// "INSERT INTO users (username, password, email, balance, role_id,address_id,identification,sq1,sa1) "
		// + "VALUES (?, ?, ?, 0, 1,?,?,?,?)";
		boolean result = false;

		getConnection();

		try {
			PreparedStatement updateemp = connection
					.prepareStatement("UPDATE pmsys.parking_spots SET available = 0 WHERE ps_id = ?");

			// sum the current balance with the new transfer fund.
			updateemp.setLong(1, spotId);
			 

			int execute = updateemp.executeUpdate();

			if (execute > 0) {

				PreparedStatement statement = connection
						.prepareStatement(ADD_RESERVATION);
				statement.setLong(1, spotId);
				statement.setLong(2, userId);
				statement.setDate(3, startDate);
				statement.setDate(4, endDate);
				statement.setBigDecimal(5, amount);

				int updRest = statement.executeUpdate();

				if (updRest > 0) {

					result = true;

				}
				updateemp.close();
				statement.close();

			}

		} catch (SQLException e) {
			// TODO need to add log4j output
			e.printStackTrace();

		} catch (Exception ex) {
			// TODO need to add log4j output
			ex.printStackTrace();

		}
		return result;

	}

	/* (non-Javadoc)
	 * @see com.parking.Model.DAO.Contract.ReservationDao#findFreeParking(long, java.lang.String, java.lang.String)
	 */
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
			updateemp.setString(4, startdt);
			updateemp.setString(5, enddt);
			updateemp.setString(6, enddt);
			 

			rs = updateemp.executeQuery();
			ParkingSlot pklot = null;
			while (rs.next()) {

				pklot = new ParkingSlot();
				pklot.setParkNumber(rs.getInt("parkingNbr"));
				pklot.setLocation(rs.getString("facility_name"));
				pklot.setNumber(rs.getInt("ps_id"));
				pklot.setParkingId(rs.getLong("ps_id"));
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

	/* (non-Javadoc)
	 * @see com.parking.Model.DAO.Contract.ReservationDao#getFacilities()
	 */
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
