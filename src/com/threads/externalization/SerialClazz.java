package com.threads.externalization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class SerialClazz implements Externalizable {

	private String name;
	private transient String password;

	private Address add;

	public SerialClazz() {
	}

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

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(name);
		out.writeObject(password);
		out.writeObject(add);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = (String) in.readObject();
		password = (String) in.readObject();
		add = (Address) in.readObject();
	}

}
