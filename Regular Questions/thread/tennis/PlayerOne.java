package com.cts.task.thread.tennis;

public class PlayerOne implements Runnable {
	@Override
	public void run() {
		System.out.println("Player One Ready");
		

	try {
		Thread.sleep(2000);
	
		System.out.println("Ping--> ");
	} catch (InterruptedException e) {
	
		e.printStackTrace();
	}
}
	}


