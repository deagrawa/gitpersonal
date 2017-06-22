package com.deepak.singleThread;

public class CreateThreadBYThread {

	public static void main (String[] args) {
		MyThread1 t1 = new MyThread1();
		t1.start();
	}
}

class MyThread1 extends Thread {
	
	public void run() {
		System.out.println("Thread is created by Thread class : ");
	}
	
}
