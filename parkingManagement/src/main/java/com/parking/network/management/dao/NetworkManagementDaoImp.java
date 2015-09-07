package com.parking.network.management.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.parking.domain.Device;

@Repository
public class NetworkManagementDaoImp  implements NetworkManagementDao{
	
	   @SuppressWarnings("unused")
	private JdbcTemplate jdbcTemplate;

	    @Autowired
	    public void setDataSource(DataSource dataSource) {
	        this.jdbcTemplate = new JdbcTemplate(dataSource);
	    }

		@Override
		public List<Device> getDeviceById(long id) {
			// TODO Auto-generated method stub
			return null;
		}
	
}
