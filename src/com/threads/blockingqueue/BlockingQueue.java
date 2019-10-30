package com.threads.blockingqueue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BlockingQueue {
	private int capacity = 2;
	private LinkedList<Integer> queue = new LinkedList<Integer>();
	private int counter = 0;

	public BlockingQueue(int capacity) {
		this.capacity = capacity;
	}

	public void produce() throws InterruptedException {
		while (true) {
			synchronized (this) {
				while (queue.size() == capacity) {
					wait();
				}

				System.out.println(
						"Value added in the queue -" + counter + " by thread -" + Thread.currentThread().getName());
				queue.add(counter++);
				notify();
				Thread.currentThread().sleep(1000);
			}
		}
	}

	public void consume() throws InterruptedException {
		while (true) {
			synchronized (this) {
				while (queue.size() == 0) {
					wait();
				}
				System.out.println("Value removed from the queue -" + queue.removeFirst() + " by thread -"
						+ Thread.currentThread().getName());
				notify();
				Thread.currentThread().sleep(1000);

			}
		}
	}
}
