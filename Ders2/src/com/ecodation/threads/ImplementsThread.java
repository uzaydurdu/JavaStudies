package com.ecodation.threads;

public class ImplementsThread implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println(i + ". implements thread.");
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
