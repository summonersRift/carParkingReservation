package com.parking.network.management.service;

import java.util.List;

import com.parking.domain.Device;

public interface NetworkManagementService {
	public List<Device> getDeviceById(long id);
}
