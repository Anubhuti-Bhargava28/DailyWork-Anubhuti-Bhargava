package com.cts.regularWork.multithreading;

public class Multithread {

	public static void main(String[] args) {

		Thread t = Thread.currentThread(); // static method used to get the main thread whixh is getting executed
											// currently ig gives the object of it
		System.out.println(t); // main(name of thread),5(priority of thread which is normal),main(name of demon
								// thread which is helping hand of main thread )
		System.out.println(t.getName()); // main
		t.setName("Current Thread");// thread name change
		System.out.println(t);
		System.out.println(t.getPriority());
		System.out.println("Is Daemon: " + t.isDaemon());
		System.out.println("Is ALive: "+ t.isAlive());
	}

}
