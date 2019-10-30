package com.threads.executers;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.stream.IntStream;

public class Task3 implements Runnable {



	@Override
	public void run() {
		IntStream s = IntStream.range(1, 1000);
		s.forEach(x -> {
			try {
				Thread.currentThread().sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Task3 compleated x=" + x);
		});

		
	}

}
