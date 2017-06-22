package com.deepak.BlockingQueue;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{

	BlockingQueue<String> queue;
	Producer(BlockingQueue queue) {
		this.queue = queue;
	}
	
	@Override
	public void run() {
		try {
			queue.put("1");
			Thread.sleep(1000);
			queue.put("2");
			Thread.sleep(1000);
			queue.put("3");
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	
}
