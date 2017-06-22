package com.deepak.singleton;

public enum EnumSingleton {

	INSTANCE;
	public static void doSomthing() {
		
	}
	public static void main(String[] args) {
		
		EnumSingleton.INSTANCE.doSomthing();
	}

}
