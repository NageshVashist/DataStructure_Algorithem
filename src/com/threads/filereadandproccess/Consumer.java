package com.threads.filereadandproccess;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
	private BlockingQueue<String> queue;

	public Consumer(BlockingQueue<String> queue) {
		this.queue = queue;

	}

	@Override
	public void run() {
		while (true) {
			String poll = null;
			try {
				poll = queue.take();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (poll != null) {
				System.out.println("Thead -" + Thread.currentThread().getName() + " processing line -" + poll
						+ "- from the queue");
			} else {
				return;
			}
		}

	}

}
