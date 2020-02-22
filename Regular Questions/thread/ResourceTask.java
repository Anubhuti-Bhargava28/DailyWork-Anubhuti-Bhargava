package com.cts.task.thread;

public class ResourceTask {
	public synchronized void display(int num) {
		//synchronized (this) {
			
				System.out.println("Table " + " : " + num);
			
		}
}
