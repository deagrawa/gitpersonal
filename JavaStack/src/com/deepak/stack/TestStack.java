package com.deepak.stack;

import java.util.ArrayList;

public class TestStack {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		CreateStack ct = new CreateStack();
		ct.push('a');
		ct.push('b');
		ct.push('c');
		ct.push('d');
		ct.push('e');
		
		while (!ct.isEmpty()) {
			System.out.println(ct.pop());
		}
		
		
	}

}
