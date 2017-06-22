package com.string.problems;

import java.util.Arrays;

public class CheckAnagram {

	public static void main(String[] args) {
		
		String s1 = "Deepak Agrawal";
		String s2 = "deepak agrawal";
		
		if(checkAnagram(s1, s2)) {
			System.out.println("Strings are anagram");
		} else {
			System.out.println("Strings are not anagram");
		}
		
	}
	
	public static String toLowerCase(String s1) {
		StringBuilder b1 = new StringBuilder();
		for (int i =0; i <s1.length(); ++i) {
			b1.append(Character.isLetter(s1.charAt(i)));
		}
		return b1.toString();
	}
	public static String toSort(String s1) {
		
		Arrays.sort(s1.toCharArray());
		return s1.toString();
	}
	public static boolean checkAnagram (String s1, String s2){
		s1 = toLowerCase(s1);
		s2 = toLowerCase(s2);
		
		s1 = toSort(s1);
		s2 = toSort(s2);
		
		return s1.equals(s2);
	
	}

}
