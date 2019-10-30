package com.threads.cyclicbariear;

import java.util.concurrent.CyclicBarrier;

public class CyclicBariearExample {
	public static void main(String[] args) {
		CyclicBarrier bar = new CyclicBarrier(3, new Action());

		Thread t1 = new Thread(new Task1(bar));
		Thread t2 = new Thread(new Task2(bar));
		Thread t3 = new Thread(new Task3(bar));

		t1.start();
		t2.start();
		t3.start();
		
		System.out.println(bar.getNumberWaiting());
			

	}
}
