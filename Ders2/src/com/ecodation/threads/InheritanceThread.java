package com.ecodation.threads;

public class InheritanceThread extends Thread {

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println(i + ". inheritance thread.");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.err.println("Thread interrupted error");
				e.printStackTrace();
			}
		}
	}
}
