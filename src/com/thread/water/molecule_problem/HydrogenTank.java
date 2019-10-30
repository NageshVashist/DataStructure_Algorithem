package com.thread.water.molecule_problem;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class HydrogenTank {
	private BlockingQueue<Hydrogen> queue = new LinkedBlockingQueue<Hydrogen>(500);

	public List<Hydrogen> get() {
		List<Hydrogen> h2 = new ArrayList<Hydrogen>(2);
		h2.add(queue.poll());
		h2.add(queue.poll());
		return h2;
	}

	public void put(Hydrogen h) {
		try {
			queue.put(h);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
