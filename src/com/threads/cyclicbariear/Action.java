package com.threads.cyclicbariear;

import java.util.stream.IntStream;

public class Action implements Runnable {

	@Override
	public void run() {

		IntStream s = IntStream.range(1, 1000);
		s.forEach(x -> {
			try {
				Thread.currentThread().sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Action compleated x=" + x);
		});

	

	}

}
