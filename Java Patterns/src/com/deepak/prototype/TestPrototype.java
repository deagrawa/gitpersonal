package com.deepak.prototype;

import java.util.ArrayList;

public class TestPrototype {

	public static void main(String[] args) {
		PrototyeClass pt = new PrototyeClass();
		pt.loadData();
		
		PrototyeClass p1 = (PrototyeClass) pt.clone();
		PrototyeClass p2 = (PrototyeClass) pt.clone();
		
		ArrayList<Employee> emp1 = p1.getList();
		ArrayList<Employee> emp2 = p2.getList();
		
		String emp = "";
		emp1.add(new Employee("gunjan", "103"));
		emp2.remove("deepak");
		
		for (int i =0; i <emp1.size(); ++i) {
			emp += emp1.get(i).empNumber + " " + emp1.get(i).name;
		}
		System.out.println("emp1" + emp);
		System.out.println("emp2" + emp2);
		System.out.println("actual" + pt.getList());
	}

}
