package com.threads.producer_consumer;

public class Ping implements Runnable {

	private Object lock;
	private String toPrint;

	public Ping(Object lock, String toPrint) {
		this.lock = lock;
		this.toPrint = toPrint;
	}

	public void run() {
		while (true) {
			synchronized (lock) {
				try {
					Thread.currentThread().sleep(2000);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				System.out.println(this.toPrint);
				lock.notifyAll();

				try {
					lock.wait();
				} catch (InterruptedException e) {
				}
			}
		}
	}

}
