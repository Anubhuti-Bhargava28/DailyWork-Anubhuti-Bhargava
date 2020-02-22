package com.cts.regularWork.synchronization;

public class Resource {
	public synchronized void display(String name) {
		//synchronized (this) {
			for (int i = 0; i <= 5; i++) {
				System.out.println("Name count: " + i + " : " + name);
			}
		}
	}

//}
