package com.parking.network.management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parking.domain.common.Device;
import com.parking.network.management.dao.NetworkManagementDao;

@Service
public class NetworkManagementServiceImp implements NetworkManagementService {
	@Autowired
	private NetworkManagementDao networkDao;

	@Override
	public List<Device> getDeviceById(long id) {

		return networkDao.getDeviceById(id);
	}

}
