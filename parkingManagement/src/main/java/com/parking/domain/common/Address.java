package com.parking.domain.common;

public class Address {

	private String street;
	private Integer zip;
	private String state;
	private String county;
	private String city;
	private String country;
	private long latitude;
	private long longitude;

	public Address(String street, Integer zip, String state, String city,
			String county, String country) {

		this.street = street;
		this.zip = zip;
		this.state = state;
		this.county = county;
		this.country = country;

	}

	public Address(String street, Integer zip, String state, String city,
			String county, String country, long lat, long longt) {

		this(street, zip, state, city, county, country);

		this.latitude = lat;
		this.longitude = longt;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public long getLatitude() {
		return latitude;
	}

	public void setLatitude(long latitude) {
		this.latitude = latitude;
	}

	public long getLongitude() {
		return longitude;
	}

	public void setLongitude(long longitude) {
		this.longitude = longitude;
	}

	public Integer getZip() {
		return zip;
	}

	public void setZip(Integer zip) {
		this.zip = zip;
	}

	public static Address getDemoAddress() {
		// String street, Integer zip, String state, String city,
		// String county, String country
		return new Address("1232 NW 3 court", 2112, "FL", "Miami",
				"MIAMI DADE", "");

	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}
