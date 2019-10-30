package com.threads.producer_consumer;

public class ProducerConsumerExample {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Ping("", "ping"));
		Thread t2 = new Thread(new Ping("", "pong"));
		
		t1.start();
		t2.start();
	}
}
