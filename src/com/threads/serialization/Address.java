package com.threads.serialization;

import java.io.Serializable;

public class Address implements Serializable {
	private static final long serialVersionUID = -4737710058347022290L;
	private String country;
	private String state;
	private String city;
	private transient int pincode;

	public Address(String country, String state, String city, int pincode) {
		super();
		this.country = country;
		this.state = state;
		this.city = city;
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [country=" + country + ", state=" + state + ", city=" + city + "]";
	}

}
