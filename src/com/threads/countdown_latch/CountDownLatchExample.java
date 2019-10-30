package com.threads.countdown_latch;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {
	public static void main(String[] args) {
		CountDownLatch lat = new CountDownLatch(3);
		
		Thread t1 = new Thread(new Task1(lat));
		Thread t2 = new Thread(new Task2(lat));
		Thread t3 = new Thread(new Task3(lat));
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			lat.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("All threads compleated");
	}
}
