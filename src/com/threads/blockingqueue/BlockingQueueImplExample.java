package com.threads.blockingqueue;

public class BlockingQueueImplExample {

	public static void main(String[] args) {
		final BlockingQueue q = new BlockingQueue(5);
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					q.produce();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					q.consume();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});
		Thread t3 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					q.produce();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});

		Thread t4 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					q.consume();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});
		
		t1.start();
//		t2.start();
		t3.start();
		t4.start();
	}
}
