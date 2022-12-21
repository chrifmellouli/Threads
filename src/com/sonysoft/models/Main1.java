package com.sonysoft.models;

public class Main1 implements Runnable {

	@Override
	public void run() {
		System.out.println("This code is running in a thread");
	}

	public static void main(String[] args) {
		Main obj = new Main();
		Thread thread1 = new Thread(obj);
		Main thread2 = new Main();
		thread1.start();
		System.out.println("Notre programme principal");
		thread2.start();
	}
}
