package com.deepak.threadpool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

import javax.xml.soap.Text;

public class ThreadPoolTest {

	AtomicInteger atom;
	BlockingQueue<Integer> queue;
	
	ThreadPoolTest() {
		atom = new AtomicInteger();
		queue = new ArrayBlockingQueue<Integer>(1024);
	}
	
	public static void main(String[] args) {
		
		ExecutorService pool = Executors.newFixedThreadPool(10);
		ThreadPoolTest test = new ThreadPoolTest();
		
		
		pool.execute(test.new Producer());
		pool.execute(test.new Producer());
		pool.execute(test.new Producer());
		
		pool.execute(test.new Consumer());
		pool.execute(test.new Consumer());
		pool.execute(test.new Consumer());
		
		pool.shutdown();
		
		
	}
	
	private class Producer implements Runnable{
		Integer item = atom.incrementAndGet();

		@Override
		public void run() {
			try {
				System.out.println("Thread name in Producer " +Thread.currentThread().getName());
				queue.put(item);
				//System.out.println(Thread.currentThread().getName());
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
	}
	
	private class Consumer implements Runnable {

		@Override
		public void run() {
			try {
				System.out.println("Thread name in Consumer : " +Thread.currentThread().getName());
				System.out.println(queue.take());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
}
