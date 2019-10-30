package com.thread.water.molecule_problem;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {
		HydrogenTank ht = new HydrogenTank();
		OxygenTank ot = new OxygenTank();

		ExecutorService hpool = Executors.newFixedThreadPool(25);
		ExecutorService opool = Executors.newFixedThreadPool(25);
		for (int i = 0; i < 25; i++) {

			hpool.submit(new HydrogenProducer(ht));
			opool.submit(new OxygenProducer(ot));
		}
		CyclicBarrier barrier = new CyclicBarrier(50);
		ExecutorService cpool = Executors.newFixedThreadPool(50);
		for (int i = 0; i < 50; i++) {

			cpool.submit(new OxygenHydrogenConsumer(ht, ot, barrier));

		}

	}

}
