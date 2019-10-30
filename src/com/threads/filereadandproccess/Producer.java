package com.threads.filereadandproccess;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

	private Path file;
	private BlockingQueue<String> queue;

	public Producer(Path file, BlockingQueue<String> queue) {
		this.file = file;
		this.queue = queue;
	}

	@Override
	public void run() {
		try {
			Files.lines(Paths.get(file.toUri())).forEach(x -> {
				while (!queue.offer(x)) {
				}
				System.out.println("Thead -" + Thread.currentThread().getName() + " added line in the queue -" + x);
			});
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Thead -" + Thread.currentThread().getName() + " Completed execution");
		}

	}

}
