package com.cts.task.thread;

public class ThreadTwo implements Runnable {
	ResourceTask resource;
	public ThreadTwo(ResourceTask resource) {
		this.resource = resource;
	}

	@Override
	public void run() {
		  for(int i = 1; i <= 10; ++i)
	        {
	           int y = 4 * i;
	           resource.display(y);     
	        }
		  try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
	
		e.printStackTrace();
	}
}
	}
