package com.cts.regularWork.multithreading;

public class ThreadDemo {

	public static void main(String[] args) {
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY - 2); // 8
		System.out.println(Thread.currentThread().getName());
		// here we have only 1 thread(main)
		ThreadOne threadOne = new ThreadOne(); // New Born State
		ThreadTwo threadTwo = new ThreadTwo();
		Thread t1 = new Thread(threadOne);
		Thread t2 = new Thread(threadTwo);
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t1.start();
		t2.start(); // ready state
		System.out.println("Main thread priority: " + Thread.currentThread().getPriority());
		System.out.println("Thread 1 Priority:" + t1.getPriority());
		System.out.println("Thread 1 Priority:" + t2.getPriority());

//
//		for (int i = 1; i <= 5; i++) {
//			System.out.println(Thread.currentThread().getName() + " : " + i);
//		}          
	}

}
