package com.thread.water.molecule_problem;

public class HydrogenProducer implements Runnable {
	private HydrogenTank tank = new HydrogenTank();

	public HydrogenProducer(HydrogenTank t) {
		this.tank = t;
	}

	@Override
	public void run() {
		while (true) {
			tank.put(new Hydrogen());
		}
	}

}
