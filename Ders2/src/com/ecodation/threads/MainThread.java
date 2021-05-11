package com.ecodation.threads;

public class MainThread {
	public static void main(String[] args) throws InterruptedException {

		// Standard Thread
		InheritanceThread inThread = new InheritanceThread();
		System.out.println(inThread.getName());
		inThread.setName("Trying");
		System.out.println(inThread.getName());
		System.out.println(inThread.isAlive());
		inThread.start();
		inThread.wait();
		inThread.notify();
		inThread.notifyAll();
		System.out.println(inThread.isAlive());

		inThread.join();
		InheritanceThread inThread2 = new InheritanceThread();
		inThread2.start();
		inThread2.join();
		// Anonymous Thread
		Thread thread = new Thread() {
			public void run() {
				for (int i = 2; i < 20; i += 2) {
					System.out.println(i + ". anonymous thread.");
				}
			}
		};

		thread.start();

		// Implements Runnable
		Thread imThread = new Thread(new ImplementsThread());
		imThread.start();

	}

}
