package com.threads.executers;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuterServiceExample {
	public static void main(String[] args) {
		ExecutorService exs= Executors.newFixedThreadPool(2);
		exs.submit(new Task1());
		exs.submit(new Task3());
		exs.submit(new Task2());
		
		exs.shutdown();
	}
}
	