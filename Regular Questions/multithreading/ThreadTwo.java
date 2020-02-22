package com.cts.regularWork.multithreading;

public class ThreadTwo implements Runnable {
 @Override
public void run() {

	 for(int o=1;o<=10;o++) {
	 if(o%2 != 0) {
	 System.out.println("Thread 2: "+o);
	 }try {
		Thread.sleep(7000);
	} catch (InterruptedException e) {

		e.printStackTrace();
	}
	 }
}
}
