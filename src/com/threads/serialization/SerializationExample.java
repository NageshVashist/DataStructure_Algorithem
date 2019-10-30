package com.threads.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationExample {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		serialize();
		deSerialize();
	}

	private static void serialize() throws FileNotFoundException, IOException {
		Address add = new Address("india", "Karnatka", "bangalore", 123123123);
		SerialClazz sc = new SerialClazz("Nagesh", "Password", add);
		FileOutputStream s = new FileOutputStream(new File("file.ser"));
		ObjectOutputStream os = new ObjectOutputStream(s);
		os.writeObject(sc);
	}

	private static void deSerialize() throws FileNotFoundException, IOException, ClassNotFoundException {

		FileInputStream s = new FileInputStream(new File("file.ser"));
		ObjectInputStream os = new ObjectInputStream(s);
		Object readObject = os.readObject();
		System.out.println(readObject); 
	}
}
