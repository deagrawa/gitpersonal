package com.deepak.BlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ArrayBlockingQue {

	
	
	public static void main (String[] args) {
		BlockingQueue<String> queue = new ArrayBlockingQueue<String>(10);
		Thread t1 = new Thread (new Producer(queue), "t1");
		t1.start();
		
		Thread t2 = new Thread(new Consumer(queue), "t2");
		t2.start();
	}
	
	
}
