package com.cts.task.thread.tennis;

public class PlayerTwo implements Runnable{
 
	 @Override
	 public void run() {
		
	 	
	 	
	 	 try {
	 		Thread.sleep(1000);
	 		 System.out.println("Player Two Ready");

	 		 Thread.sleep(3000);
	 		 System.out.println("-->Pong ");
	 	} catch (InterruptedException e) {

	 		e.printStackTrace();
	 	}
	 	 }
	 }

