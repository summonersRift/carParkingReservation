package com.parking.domain.common;

import java.util.Date;

public class Device {
	
private String deviceId;
private String tag;
private String name;
private Date maintenance_dt;
public String getDeviceId() {
	return deviceId;
}
public void setDeviceId(String deviceId) {
	this.deviceId = deviceId;
}
public String getTag() {
	return tag;
}
public void setTag(String tag) {
	this.tag = tag;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Date getMaintenance_dt() {
	return maintenance_dt;
}
public void setMaintenance_dt(Date maintenance_dt) {
	this.maintenance_dt = maintenance_dt;
}

}
