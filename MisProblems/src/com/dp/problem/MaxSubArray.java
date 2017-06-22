package com.dp.problem;

public class MaxSubArray {

	public static void main(String[] args) {
		
		int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
		int max_sum = 0;
		int sum =0;
		int min_sum = -1;
		int min_idx = -1;
		int stIdx = 0;
		int enIdx = 0;
		
		for (int i =0; i<arr.length; ++i) {
			sum += arr[i];
			if(sum < min_sum) {
				min_sum = sum;
				min_idx = i;
			}
			if((sum - min_sum) > max_sum ) {
				max_sum = sum - min_sum;
				stIdx = min_idx +1;
				enIdx = i;
			}
		}
		
		System.out.println("Sum is = " + max_sum + " start index = "+ stIdx + " End Index =" + enIdx  );
		

		
		
	}

}
