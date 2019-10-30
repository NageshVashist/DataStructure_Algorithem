package com.threads.filereadandproccess;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class FileReadAndProcessExample {
	public static void main(String[] args) throws IOException {
		BlockingQueue queue = new ArrayBlockingQueue(2);

		Files.walk(Paths.get("files/fileprocessing")).forEach(x -> {
			Producer p = new Producer(x, queue);
			Consumer c= new Consumer(queue);
			Thread t1 = new Thread(p);
			Thread t2 = new Thread(c);
			t1.start();
			t2.start();
		});
	}

}
