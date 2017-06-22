package com.deepak.prototype;

import java.util.ArrayList;

public class PrototyeClass implements Cloneable{

	ArrayList<Employee>empList;
	public PrototyeClass() {
		empList = new ArrayList<Employee>();
	}
	public void loadData() {
		empList.add(new Employee("deepak", "101"));
		empList.add(new Employee("ram", "102"));
	}
	public ArrayList<Employee> getList(){
		return empList;
	}
	public PrototyeClass(ArrayList<Employee> list) {
		empList = list;
	}
	
	public Object clone() {
		ArrayList<Employee> newList = new ArrayList<>();
		ArrayList<Employee>temp = this.getList();
		for (int i =0; i <temp.size(); ++i) {
			newList.add(temp.get(i));
		}
		
		return new PrototyeClass(newList);
		
	}
	@Override
	public String toString(){
		String emp ="";
		for (int i =0; i <empList.size(); ++i) {
			emp += empList.get(i);
		}
		return emp;
	}
}
