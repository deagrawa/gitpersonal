package com.array.problem;

public class ArrayRotate {

	public static void rotate(int[] arr, int rotate) {
		int gcdVal = getGCD(rotate, arr.length);
		
		for (int i =0; i<gcdVal; ++i) {
			int temp = arr[i];
			int j = i;
			int k ;
			while(true) {
				k = j + rotate;
				
				if(k >= arr.length) {
					k = k - arr.length;
				}
				if( k == i) {
					break;
				}
				arr[j] = arr[k];
				j = k;
			}
			arr[j] = temp;
		}
		
	}
	
	public static int getGCD(int a, int b) {
		if(b == 0) {
			return a;
		}
		else {
			return getGCD(b, a%b);
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 6, 7};
		int d = 2;
		rotate(arr, d);
		
		for(int i =0; i < arr.length; ++i) {
			System.out.print(" " + arr[i]);
		}
	}
	
}
