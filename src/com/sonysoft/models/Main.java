package com.sonysoft.models;

public class Main extends Thread {

	@Override
	public void run() {
		System.out.println("this code is running in a thread");
	}

	public static void main(String[] args) {
		Main thread = new Main();
		thread.start();
		System.out.println("Notre programme principal");
		System.out.println("Deuxième ligne");
	}

}
