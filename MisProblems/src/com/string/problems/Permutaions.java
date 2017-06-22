package com.string.problems;

import java.util.Arrays;

public class Permutaions {

	public static void permute(char[] str) {
		char[]temp = str;
		int len = str.length;
		int totalStr = getFact(len);
		int k =0;
		int m =0;
		for ( int i =0; i< totalStr;) {
			
			char tempVar = 0;
			while (k !=totalStr/len) {
				int j = 1;
				while (j != len-1) {
					tempVar = temp[j];
					temp[j] = temp[j+1];
					temp[j+1] = tempVar;
					System.out.println(Arrays.toString(temp) + " ");
					++k;
					++j;
					++i;
				}
				
			}
			++m;
			k =0;
			if( m == len) {
				break;
			}
			tempVar = str[m];
			str[m] = str[0];
			str[0] = tempVar;
			
		}
		
	}
	
	public static int getFact(int n) {
		int fact = 1;
		for (int i =1; i <= n; i++) {
			fact = fact*i;
		}
		return fact;
	}
	
	public static void main(String[] args) {
		
		System.out.println(System.currentTimeMillis());
		String str = "abcdefg";
		char[] charStr = str.toCharArray();
		permute(charStr);
		System.out.println(System.currentTimeMillis());
		

	}

}
