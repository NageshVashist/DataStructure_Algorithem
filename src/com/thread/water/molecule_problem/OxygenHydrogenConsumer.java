package com.thread.water.molecule_problem;

import java.util.List;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class OxygenHydrogenConsumer implements Runnable {
	private HydrogenTank ht;
	private OxygenTank ot;
	private CyclicBarrier barrier;

	public OxygenHydrogenConsumer(HydrogenTank ht, OxygenTank ot, CyclicBarrier barrier) {
		this.ht = ht;
		this.ot = ot;
		this.barrier = barrier;
	}

	@Override
	public void run() {
		while (true) {
			try {
				System.out.println("Waiting");
				barrier.await();
				List<Hydrogen> h2 = ht.get();
				Oxygen oxygen = ot.get();
				System.out.println(h2.get(0).toString() + h2.get(1).toString() + oxygen + ":" + System.nanoTime());
				Thread.sleep(1000);

			} catch (InterruptedException | BrokenBarrierException e) {
				e.printStackTrace();
			}
		}

	}

}
