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

	private static String GET_FACILITY_BY_ID = "select f.facility_id, f.f_name,a.line1, a.city, a.state, a.zip, "
			+ "(select count(*) from PMSys.parking_spots ps where ps.facility_id =?  )  as ns from Facilities f "
			+ "INNER JOIN address a on f.address_id = a.address_id and f.facility_id = ? ORDER BY facility_id;";

	private static String GET_ALL_FACILITIES = "select f.facility_id, f.f_name,a.line1, a.city, a.state, a.zip, "
			+ "	(select count(*) from PMSys.parking_spots ps where f.facility_id = ps.facility_id )  as ns from Facilities f "
			+ "	INNER JOIN address a on f.address_id = a.address_id ORDER BY facility_id;";

	private static String UPDATE_FACILITY = "  update Facilities set "
			+ "f_name = coalesce (?, f_name) where facility_id = ?; "
			+ "update address set "
			+ "line1 = coalesce (?, line1) , "
			+ "city = coalesce (?, city), "
			+ "state = coalesce (? , state), "
			+ "zip = coalesce (?, zip) "
			+ "where address_id = (select address_id from PMSys.Facilities where facility_id = ?);  ";

	private static String ADD_FACILITY = "INSERT INTO `PMSys`.`address` (`address_id`,`line1`,`line2`,`city`,`state`,`zip`,`type`)"
			+ "VALUES(NULL,?,NULL,?,?,?,2);"
			+ "INSERT INTO `PMSys`.`Facilities` (`facility_id`,`address_id`,`f_name`) VALUES (NULL,"
			+ "(SELECT `AUTO_INCREMENT` - 1 "
			+ "FROM  INFORMATION_SCHEMA.TABLES "
			+ "WHERE TABLE_SCHEMA = 'PMSys' "
			+ "AND   TABLE_NAME   = 'address'),?);";

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
				fac.setAddressLine1(rs.getString("line1"));
				fac.setCity(rs.getString("city"));
				fac.setName(rs.getString("f_name"));
				fac.setNumberOfSpots(rs.getInt("ns"));
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
			statement.setInt(1, fac_id);

			ResultSet rs = statement.executeQuery(GET_FACILITY_BY_ID);

			// Facility fac = new Facility();
			fac.setAddressLine1(rs.getString("line1"));
			fac.setCity(rs.getString("city"));
			fac.setName(rs.getString("name"));
			fac.setNumberOfSpots(rs.getInt("ns"));
			fac.setState(rs.getString("state"));
			fac.setZipCode(rs.getInt("zip"));

		} catch (SQLException e) {

			e.printStackTrace();

		} finally {

		}

		return fac;
	}

	@Override
	public void update(Facility f) {

		try {

			PreparedStatement statement = getConnection().prepareStatement(
					UPDATE_FACILITY);
			statement.setString(1, f.getName());
			statement.setInt(2, f.getFacilityID());
			statement.setString(3, f.getAddressLine1());
			statement.setString(4, f.getCity());
			statement.setString(5, f.getState());
			statement.setInt(6, f.getZipCode());
			statement.setInt(7, f.getFacilityID());

			statement.executeQuery(GET_FACILITY_BY_ID);

		} catch (SQLException e) {

			e.printStackTrace();

		}

		// return fac;
	}

	@Override
	public void add(Facility f) {
		// Integer fac_id ,String name,String line1, String city, String state,
		// Integer zip) {

		try {

			PreparedStatement statement = getConnection().prepareStatement(
					ADD_FACILITY);
			statement.setString(1, f.getAddressLine1());
			statement.setString(2, f.getCity());
			statement.setString(3, f.getState());
			statement.setInt(4, f.getZipCode());
			statement.setString(5, f.getName());
			statement.setInt(6, f.getNumberOfSpots());
			// statement.setInt(7,fac_id);
			statement.executeUpdate(ADD_FACILITY);

		} catch (SQLException e) {

			e.printStackTrace();

		}

	}

}
