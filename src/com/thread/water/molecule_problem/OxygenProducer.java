package com.thread.water.molecule_problem;

public class OxygenProducer implements Runnable {

	private OxygenTank tank = new OxygenTank();

	public OxygenProducer(OxygenTank tank) {
		this.tank = tank;
	}

	@Override
	public void run() {
		while (true) {
			tank.put(new Oxygen());
		}
	}

}
