package com.deepak.callable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SampleExampleWithCallable {

	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executor = Executors.newFixedThreadPool(100);
		List<Future<String>> list = new ArrayList<Future<String>>();
		Callable<String> callable = new MyThread2();
		for (int i =0; i<100; ++i) {
			Future<String> fut = executor.submit(callable);
			list.add(fut);
		}
		
		for( int j = 0; j<100; ++j) {
			System.out.println(list.get(j).get());
		}
	}
	

}

class MyThread2 implements Callable<String> {
	@Override
	public String call() throws Exception {
		return Thread.currentThread().getName();
	}
}
