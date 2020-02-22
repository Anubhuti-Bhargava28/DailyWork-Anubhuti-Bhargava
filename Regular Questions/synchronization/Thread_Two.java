package com.cts.regularWork.synchronization;

public class Thread_Two  implements Runnable{
	Resource resource;

	public Thread_Two(Resource resource) {
		this.resource = resource;
	}

	@Override
	public void run() {

		resource.display("Thread-2");
	}
}
