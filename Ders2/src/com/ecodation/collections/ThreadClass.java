package com.ecodation.collections;

public class ThreadClass extends Thread {
	// getName() setName() isAlive() join() sleep() start() run()

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("uzay " + i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
