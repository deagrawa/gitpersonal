package com.deepak.ITC;

public class PrintSequenceMutiThread {

	public static void main (String[] args) {
		Print print = new Print();
		Thread t1 = new Thread(new Mythread(print, 10, false));
		Thread t2 = new Thread(new Mythread(print, 10, true));
		t1.start();
		t2.start();
		
	}
}

class Mythread implements Runnable {

	Print print;
	int max;
	boolean isEven;
	Mythread(Print print, int max, boolean isEven) {
		this.print = print;
		this.max = max;
		this.isEven = isEven;
	}
	@Override
	public void run() {
		int number = isEven ? 2: 1;
		while (number <= max) {
			if(number %2 == 0) {
				print.printEven(number);
			} else {
				print.printOdd(number);
			}
			number += 2;
		}			
	}
	
}

class Print{
	public  boolean isOdd = false;
	
	synchronized public  void printEven(int number)  {
		while(isOdd == false) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+ " : " + number);
		//number += 2;
		isOdd = false;
		notifyAll();
	}
	
	synchronized public  void printOdd(int number)  {
		while(isOdd == true) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+ " : " +number);
		//number += 2;
		isOdd = true;
		notifyAll();
	}
	
}