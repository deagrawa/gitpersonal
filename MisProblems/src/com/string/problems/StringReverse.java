package com.string.problems;

public class StringReverse {

	public static void main(String[] args) {
		String str = "deepak";
		char[] arr = str.toCharArray();
		int length = arr.length-1;
		int i =0;
		char c ;
		while (i < length) {
			c = str.charAt(i);
			arr[i] = str.charAt(length);
			arr[length] = c;
			--length;
			++i;
		}
		System.out.println(String.valueOf(arr));

	}

}
