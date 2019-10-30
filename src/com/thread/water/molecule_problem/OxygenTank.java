package com.thread.water.molecule_problem;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class OxygenTank {
	private BlockingQueue<Oxygen> queue = new LinkedBlockingQueue<Oxygen>(500);

	public Oxygen get() {
		return queue.poll();
	}

	public void put(Oxygen h) {
		try {
			queue.put(h);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
