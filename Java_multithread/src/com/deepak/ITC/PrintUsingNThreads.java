package com.deepak.ITC;

import java.util.concurrent.atomic.AtomicInteger;

public class PrintUsingNThreads {

	public static void main(String[] args) {
		Thread t1 = new Thread(new MyThread2(3, 0));
		Thread t2 = new Thread(new MyThread2(3, 1));
		Thread t3 = new Thread(new MyThread2(3, 2));
		t1.start();
		t2.start();
		t3.start();
	}
	

}

class MyThread2 implements Runnable {

	AtomicInteger value = new AtomicInteger(1);
	int id;
	int max;
	Object monitor = new Object();
	volatile int tempValue = 1;

	MyThread2(int max, int num) {
		this.max = max;
		this.id = num;
	}

	@Override
	public void run() {
		try {
			while (true) {
				Thread.sleep(100);
				synchronized (monitor) {
					if (tempValue %this.max != this.id ) {
						monitor.wait();

					} else {
						System.out.println(value);
						tempValue = value.incrementAndGet();
						monitor.notifyAll();
					}
				}
				
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}