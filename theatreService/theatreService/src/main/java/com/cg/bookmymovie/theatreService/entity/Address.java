package com.cg.bookmymovie.theatreService.entity;

public class Address {
	private String street;
	private String state;
	private String city;
	private int pincode;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", state=" + state + ", city=" + city + ", pincode=" + pincode + "]";
	}

}
