package com.sonysoft.models;

public class Main3 extends Thread {
	public static int somme = 0;

	public static void main(String[] args) {
		Main3 thread = new Main3();
		thread.start();
		System.out.println(somme);
		somme++;
		System.out.println(somme);
	}

	@Override
	public void run() {
		somme++;
		System.out.println("incrémentation depuis run " + somme);
	}

}
