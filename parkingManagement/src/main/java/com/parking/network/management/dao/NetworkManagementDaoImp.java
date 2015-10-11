package com.parking.network.management.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.parking.domain.common.Device;

@Repository
public class NetworkManagementDaoImp implements NetworkManagementDao {

	public NetworkManagementDaoImp() {
	}

	/*
	 * @SuppressWarnings("unused") private JdbcTemplate jdbcTemplate;
	 * 
	 * @Autowired public void setDataSource(DataSource dataSource) {
	 * this.jdbcTemplate = new JdbcTemplate(dataSource); }
	 */
	@Override
	public List<Device> getDeviceById(long id) {
		// TODO Auto-generated method stub

		List<Device> lst = new ArrayList<Device>();
		Device device = new Device();
		device.setDeviceId("12345");
		device.setMaintenance_dt(new Date());
		device.setName("Router ABC");
		lst.add(device);

		return lst;
	}

}
