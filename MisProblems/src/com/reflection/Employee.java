package com.reflection;

public class Employee {

	String name;
	String desigNation;
	int age;
	public Employee(String name, String desigNation, int age) {
		this.name = name;
		this.desigNation = desigNation;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesigNation() {
		return desigNation;
	}
	public void setDesigNation(String desigNation) {
		this.desigNation = desigNation;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
