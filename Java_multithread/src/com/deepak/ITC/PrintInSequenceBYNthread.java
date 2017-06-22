package com.deepak.ITC;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class PrintInSequenceBYNthread {

	public static void main(String[] args) {
		MyThread1 m1 = new MyThread1();
		MyThread1 m2 = new MyThread1();
		MyThread1 m3 = new MyThread1();
		
		m1.setNext(m2);
		m2.setNext(m3);
		m3.setNext(m1);
		
		
		
		Thread t1 = new Thread(m1, "Thread 1");
		Thread t2 = new Thread(m2, "Thread 2");
		Thread t3 = new Thread(m3, "Thread 3");
		t1.start();
		t2.start();
		t3.start();
		
		m1.accept(new AtomicInteger(1));
		
	}
}

class MyThread1 implements Runnable {

	BlockingQueue<AtomicInteger> queue = new LinkedBlockingQueue<AtomicInteger>();
	MyThread1 next;
	AtomicInteger number = new AtomicInteger(1);
	MyThread1() {
		next = null;
	}
	void setNext(MyThread1 m1) {
		this.next = m1;
	}
	void accept(AtomicInteger i) {
		queue.add(i);
	}
	
	@Override
	public void run() {
		while (number.get()!= 9) {
			try {
				number = queue.take();
				System.out.println(Thread.currentThread().getName() + " " + number);
				//Thread.sleep(1000);
				if(this.next != null) {
					number.incrementAndGet();
					next.accept(number);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//return;
			
			
		}
		
	}
	
}