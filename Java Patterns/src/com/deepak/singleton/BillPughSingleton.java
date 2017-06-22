package com.deepak.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class BillPughSingleton {

	private BillPughSingleton() {}
	public static class singletonHelper {
		private static BillPughSingleton singleton = new BillPughSingleton();
	}
	private static BillPughSingleton getInstance () {
		return singletonHelper.singleton;
	}
	
	
	
	
	public static void main(String[] args) {
		BillPughSingleton instance = BillPughSingleton.getInstance();
		BillPughSingleton instance2 = null;

		try {
		@SuppressWarnings("rawtypes")
		Constructor[] constructors = BillPughSingleton.class.getDeclaredConstructors();
		for (@SuppressWarnings("rawtypes") Constructor cons : constructors) {
			cons.setAccessible(true);
			
				instance2 = (BillPughSingleton) cons.newInstance();
				break;
			} 
		}
		catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
		
		System.out.println(instance2.hashCode());
		System.out.println(instance.hashCode());
		
	}

}
