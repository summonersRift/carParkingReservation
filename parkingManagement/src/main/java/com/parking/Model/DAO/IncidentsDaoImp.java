package com.parking.Model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.parking.Model.DAO.Contract.IncidentsDao;
import com.parking.Model.Domain.Incident;
import com.parking.common.BaseDao;

@Repository
public class IncidentsDaoImp extends BaseDao implements IncidentsDao {
	String GET_ALL_INCIDENTS = "SELECT * FROM Accidents";
	String INSERT_ACCIDENT = "INSERT INTO Accidents (user_id, ps_id, ac_date, Accidentscol) VALUES (?, ? , now(), ?)";

	@Override
	public List<Incident> getAll() {
		List<Incident> incidents = new ArrayList<Incident>();
		try {
			Connection conn = getConnection();
			conn.createStatement();
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery(GET_ALL_INCIDENTS);
			while (rs.next()) {
				Incident inc = new Incident();
				inc.setIncidentID(rs.getLong("accident_id"));
				//inc.setUserID(rs.getLong("user_id"));
				inc.setLocation(rs.getInt("ps_id"));
				inc.setDate(rs.getString("ac_date"));
				inc.setDescription(rs.getString("Accidentscol"));
				incidents.add(inc);
			}
		} catch (SQLException e) {

			e.printStackTrace();

		} 

		return incidents;	}

	@Override
	public void add(Incident val) {
		try {
			PreparedStatement statement = getConnection().prepareStatement(INSERT_ACCIDENT);
			statement.setLong(1, val.getUserId());
			statement.setInt(2, val.getLocation());
			statement.setString(3, val.getDescription());			
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
