package com.sonysoft.models;

public class Main4 extends Thread {

	public static int somme = 0;

	public static void main(String[] args) {
		Main4 thread = new Main4();
		thread.start();
		// Wait for the thread to finish
		int nombreDeCycleVieProcessus = 0;
		while (thread.isAlive()) {
			nombreDeCycleVieProcessus++;
			System.out.println("Waiting... " + nombreDeCycleVieProcessus);
		}
		// Update amount and print its value
		System.out.println("incrémentation depuis main: somme = " + somme);
		somme++;
		System.out.println("incrémentation depuis main: somme =" + somme);
	}

	public void run() {
		somme++;
		System.out.println("incrémentation depuis run et somme = " + somme);
	}

}
