package com.array.problem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class GetNameWithMaxOccrances {

	
	public static void main(String[] args) {
		String[] arr = {"deepak", "raj", "mohan", "raj", "mohan"};
		
		String s = "abc";
		s.length();
	
		HashMap<String, Integer> map  = new HashMap<>();
		int count = 0;
		for(int i =0; i <arr.length; ++i) {
			if(map.containsKey(arr[i])) {
				count = (int)map.get(arr[i]);
				map.remove(arr[i]);
				map.put(arr[i], ++count);
			} else {
				map.put(arr[i], 1);
			}
		}
		int tempCount = 1;
		
		for(Map.Entry m: map.entrySet()) {
			if(tempCount < (int)m.getValue()) {
				tempCount = (int)m.getValue();
			}
		}
		ArrayList<String> str = new ArrayList<>();
		for(Map.Entry m: map.entrySet()) {
			if(tempCount == (int)m.getValue()) {
				str.add((String)m.getKey());
				
			}
		}
		Collections.sort(str);
		for(int i = 0; i <str.size();++i) {
			System.out.println(str.get(i));
		}

	}

}
