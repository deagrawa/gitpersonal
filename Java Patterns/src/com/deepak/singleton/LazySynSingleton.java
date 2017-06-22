package com.deepak.singleton;

public class LazySynSingleton {

	private static LazySynSingleton singleton = null;
	
	private LazySynSingleton() {}
	
	public static LazySynSingleton getInstance() {
		if(singleton == null) {
			synchronized (LazySynSingleton.class){
				if(singleton == null) {
					singleton = new LazySynSingleton();
				}
			}
		}
		return singleton;
		
	}
	public static void main(String[] args) {
		LazySynSingleton instance = LazySynSingleton.getInstance();
		System.out.println(instance.hashCode());
		LazySynSingleton instance1 = LazySynSingleton.getInstance();
		System.out.println(instance1.hashCode());
		

	}

}
