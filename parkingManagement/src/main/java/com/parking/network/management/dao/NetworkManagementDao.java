package com.parking.network.management.dao;

import java.util.List;

import com.parking.domain.Device;

public interface NetworkManagementDao {
public List<Device> getDeviceById(long id);
}
