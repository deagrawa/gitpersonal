package com.deepak.BlockingQueue;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{

	
	BlockingQueue<String> queue;
	Consumer(BlockingQueue queue) {
		this.queue = queue;
	}
	@Override
	public void run() {
		try {
			System.out.println(this.queue.take());
			System.out.println(this.queue.take());
			System.out.println(this.queue.take());
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	
}
