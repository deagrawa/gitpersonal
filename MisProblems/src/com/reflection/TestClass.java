package com.reflection;

public class TestClass {

	
	public static void main(String[] args) {
		Employee emp = new Employee("deepak", "SSE", 34);
		Class<?> c1 = emp.getClass();
		
		System.out.println(c1.getName());
		System.out.println(c1.getSimpleName());
		System.out.println(c1.getSuperclass());

	}

}
