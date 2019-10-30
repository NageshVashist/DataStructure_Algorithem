package com.threads.externalization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Address implements Externalizable {
	private String country;
	private String state;
	private String city;
	private transient int pincode;

	public Address() {
	}

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

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(country);
		out.writeObject(state);
		out.writeObject(city);
//		out.writeObject(pincode);

	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		country = (String) in.readObject();
		state = (String) in.readObject();
		city = (String) in.readObject();

	}

}
