package com.deepak.singleThread;

class ABC implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread is created : "+ Thread.currentThread().getName() + "is active " + Thread.currentThread().isAlive());
		try {
			Thread.sleep(4000);
			System.out.println("Thread : "+ Thread.currentThread().getName() + "is finished ");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	
}

public class MyThread {
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread (new ABC(), "t1");
		Thread t2 = new Thread (new ABC(), "t2");
		Thread t3 = new Thread (new ABC(), "t3");
		Thread t4 = new Thread (new ABC(), "t4");
		t1.start();
		
		try {
			t1.join();
			t2.start();
			t2.join();
			t3.start();
			t3.join();
			t4.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
}