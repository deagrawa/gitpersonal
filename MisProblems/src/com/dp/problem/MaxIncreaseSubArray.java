package com.dp.problem;

public class MaxIncreaseSubArray {

	public static void main(String[] args) {
		int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 };
		//System.out.println(arr.length);

		int list[] = new int[] {1,1,1,1,1,1,1,1};
		
		for (int i =1; i < arr.length; ++i) {
			for (int j =0; j < i; ++j) {
				if(arr[i] > arr[j] && list[i] < list[j] + 1) {
					list[i] = list[j] +1;
				}
			}
		}
		int max =0;
		for (int i =0; i < list.length; ++i) {
			if (max < list[i]) {
				max = list[i];
			}
		}
		System.out.println(max);
		
	}

}
