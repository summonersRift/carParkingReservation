package com.parking.Model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.parking.Model.DAO.Contract.FacilityDao;
import com.parking.Model.Domain.Facility;
import com.parking.common.BaseDao;

@Repository
public class FacilityDaoImp extends BaseDao implements FacilityDao {

	private static String GET_FACILITY_BY_ID = " select f.facility_id, f.f_name,a.line1, a.city, a.state, a.zip, f.numberOfSpots "
			+ "  from Facilities f "
			+ " INNER JOIN address a on f.address_id = a.address_id and f.facility_id = ? ORDER BY facility_id ";

	private static String GET_ALL_FACILITIES = "select f.facility_id, f.f_name,a.line1, a.city, a.state, a.zip, f.numberOfSpots "
			+ "	  from Facilities f "
			+ "	INNER JOIN address a on f.address_id = a.address_id ORDER BY facility_id;";

	private static String UPDATE_FACILITY = "  update Facilities set "
			+ "f_name = coalesce (?, f_name) ,numberOfSpots = coalesce (?, numberOfSpots) where facility_id = ? ";

	private static String UPDATE_ADDRESS = "update address set "
			+ "line1 = coalesce (?, line1) , "
			+ "city = coalesce (?, city),  "
			+ "state = coalesce (? , state),  "
			+ "zip = coalesce (?, zip)  "
			+ "where address_id = (select address_id from Facilities where facility_id = ?) ";

	private static String ADD_ADDRESS = "INSERT INTO  address (line1,line2,city,state,zip,type)"
			+ "VALUES(?,NULL,?,?,?,2) ";

	private static String ADD_FACILITY = " INSERT INTO Facilities  (facility_id,address_id,f_name,numberOfSpots) VALUES (NULL,"
			+ "(SELECT `AUTO_INCREMENT` - 1 "
			+ "FROM  INFORMATION_SCHEMA.TABLES "
			+ "WHERE TABLE_SCHEMA = 'pmsys' "
			+ "AND   TABLE_NAME   = 'address'), ?, ? )";

	@Override
	public List<Facility> getAll() {
		Connection conn = null;
		List<Facility> facilities = new ArrayList<Facility>();
		try {
			conn = getConnection();
			conn.createStatement();
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery(GET_ALL_FACILITIES);
			while (rs.next()) {
				Facility fac = new Facility();
				fac.setId(rs.getInt("facility_id"));
				fac.setAddressLine1(rs.getString("line1"));
				fac.setCity(rs.getString("city"));
				fac.setName(rs.getString("f_name"));
				fac.setNumberOfSpots(rs.getInt("numberOfSpots"));
				fac.setState(rs.getString("state"));
				fac.setZipCode(rs.getInt("zip"));
				facilities.add(fac);
			}
		} catch (SQLException e) {

			e.printStackTrace();

		}

		return facilities;
	}

	@Override
	public Facility getById(Integer fac_id) {
		Facility fac = new Facility();
		try { 
			PreparedStatement statement = getConnection().prepareStatement(
					GET_FACILITY_BY_ID);
			statement.setInt(1, fac_id);
			 

			ResultSet rs = statement.executeQuery();
			if (rs.next()) {
				fac.setAddressLine1(rs.getString("line1"));
				fac.setCity(rs.getString("city"));
				fac.setName(rs.getString("f_name"));
				fac.setNumberOfSpots(rs.getInt("numberOfSpots"));
				fac.setState(rs.getString("state"));
				fac.setZipCode(rs.getInt("zip"));
				fac.setFacilityID(rs.getInt("facility_id"));
			}
		} catch (SQLException e) {

			e.printStackTrace();

		} finally {

		}

		return fac;
	}

	@Override
	public void update(Facility f) {

		try {

			PreparedStatement statementFacility = getConnection()
					.prepareStatement(UPDATE_FACILITY);

			statementFacility.setString(1, f.getName());
			statementFacility.setInt(2, f.getNumberOfSpots());
			statementFacility.setLong(3, f.getFacilityID());

			int result = statementFacility.executeUpdate();
			if (result > 0) {

				PreparedStatement statement = getConnection().prepareStatement(
						UPDATE_ADDRESS);

				statement.setString(1, f.getAddressLine1());
				statement.setString(2, f.getCity());
				statement.setString(3, f.getState());
				statement.setInt(4, f.getZipCode());
				statement.setInt(5, f.getFacilityID());

				statement.executeUpdate();

				statementFacility.close();
				statement.close();

			}

		} catch (SQLException e) {

			e.printStackTrace();

		}

		// return fac;
	}

	@Override
	public void add(Facility f) {
		 

		try {

			PreparedStatement statementFacility = getConnection()
					.prepareStatement(ADD_ADDRESS);

			statementFacility.setString(1, f.getAddressLine1());
			statementFacility.setString(2, f.getCity());
			statementFacility.setString(3, f.getState());
			statementFacility.setInt(4, f.getZipCode());

			int result = statementFacility.executeUpdate();
			if (result > 0) {

				PreparedStatement statement = getConnection().prepareStatement(
						ADD_FACILITY);

				statement.setString(1, f.getName());
				statement.setInt(2, f.getNumberOfSpots());
				

				statement.executeUpdate();

				statementFacility.close();
				statement.close();

			}

		} catch (SQLException e) {

			e.printStackTrace();

		}


	}

}
