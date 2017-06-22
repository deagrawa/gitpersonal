package com.deepak.singleton;

public class EagerSingleton {

	private static final EagerSingleton singleton = new EagerSingleton();
	
	private EagerSingleton () {
		System.out.println("object done");
	}
	
	public static EagerSingleton getInstance() {
		return singleton;
	}
	
	public static void main(String[] args) {
		
		System.out.println("object created");

	}

}
