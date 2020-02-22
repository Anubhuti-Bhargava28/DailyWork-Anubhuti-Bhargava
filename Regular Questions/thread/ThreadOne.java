package com.cts.task.thread;

import com.cts.regularWork.synchronization.Resource;

public class ThreadOne  implements Runnable{
	ResourceTask resource;
	public ThreadOne(ResourceTask resource) {
		this.resource = resource;
	}

	@Override
	public void run() {
		  for(int i = 1; i <= 10; ++i)
	        {
	           int y = 2 * i;
	           resource.display(y);     
	        }
		  try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
	
		e.printStackTrace();
	}
}
	}

