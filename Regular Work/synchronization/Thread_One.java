package com.cts.regularWork.synchronization;

public class Thread_One implements Runnable {
		
Resource resource;
public Thread_One(Resource resource) {
	this.resource = resource;
}
	@Override
		public void run() {
		
		resource.display("Thread-1");	
		}
}

	
