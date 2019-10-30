package com.threads.cyclicbariear;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.stream.IntStream;

public class Task1 implements Runnable {

	private CyclicBarrier bar;

	public Task1(CyclicBarrier bar) {
		this.bar = bar;
	}

	@Override
	public void run() {
		IntStream s = IntStream.range(1, 1000);
		s.forEach(x -> {
			try {
				Thread.currentThread().sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Task1 compleated x=" + x);
		});

		try {
			bar.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Task 1 Bariear executed");
	}

}
