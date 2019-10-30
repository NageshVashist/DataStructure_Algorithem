package com.threads.countdown_latch;

import java.util.concurrent.CountDownLatch;
import java.util.stream.IntStream;

public class Task2 implements Runnable {

	private CountDownLatch lat;

	public Task2(CountDownLatch lat) {
		this.lat = lat;
	}

	@Override
	public void run() {
		IntStream s = IntStream.range(1, 800);
		s.forEach(x -> {
			try {
				Thread.currentThread().sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Task2 compleated x=" + x);
		});

		lat.countDown();
	}

}
