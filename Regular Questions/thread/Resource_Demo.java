package com.cts.task.thread;

import com.cts.regularWork.synchronization.Resource;
import com.cts.regularWork.synchronization.Thread_One;
import com.cts.regularWork.synchronization.Thread_Two;

public class Resource_Demo {
	public static void main(String[] args) {

		Thread.currentThread().setPriority(Thread.MAX_PRIORITY - 2); // 8
		ResourceTask res = new ResourceTask();
		ThreadOne threadOne = new ThreadOne(res); // New Born State
		ThreadTwo threadTwo = new ThreadTwo(res);
		Thread t1 = new Thread(threadOne);
		Thread t2 = new Thread(threadTwo);
//		t1.setPriority(Thread.MAX_PRIORITY);
//		t2.setPriority(Thread.NORM_PRIORITY);
		t1.start();
		t2.start(); // ready state
	}

}
