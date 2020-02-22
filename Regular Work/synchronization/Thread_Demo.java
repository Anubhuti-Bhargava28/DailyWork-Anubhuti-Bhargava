package com.cts.regularWork.synchronization;

import com.cts.regularWork.multithreading.ThreadOne;
import com.cts.regularWork.multithreading.ThreadTwo;

public class Thread_Demo {

	public static void main(String[] args) {

		Thread.currentThread().setPriority(Thread.MAX_PRIORITY - 2); // 8
		Resource res = new Resource();
		Thread_One threadOne = new Thread_One(res); // New Born State
		Thread_Two threadTwo = new Thread_Two(res);
		Thread t1 = new Thread(threadOne);
		Thread t2 = new Thread(threadTwo);
//		t1.setPriority(Thread.MAX_PRIORITY);
//		t2.setPriority(Thread.NORM_PRIORITY);
		t1.start();
		t2.start(); // ready state
	}

}
