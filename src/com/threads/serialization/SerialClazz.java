package com.threads.serialization;

import java.io.Serializable;

public class SerialClazz implements Serializable {

	private static final long serialVersionUID = -9054555387983133561L;
	private String name;
	private transient String password;

	private Address add;

	public SerialClazz(String name, String password, Address add) {

		super();
		this.name = name;
		this.password = password;
		this.add = add;
	}

	@Override
	public String toString() {
		return "SerialClazz [name=" + name + ", add=" + add + "]";
	}
	

}
