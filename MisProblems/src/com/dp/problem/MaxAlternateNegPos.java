package com.dp.problem;

public class MaxAlternateNegPos {
	public static void main(String[] args) {
		int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int firstIndex = 0;int start = 0;int end = 0;
		int count1 = 0;int maxCount = 0;
		for (int i = 1; i < arr.length; ++i) {
			if (arr[i] > 0 && arr[i - 1] > 0) {
				firstIndex = i;count1 = 0;
			}
			if (arr[i] < 0 && arr[i - 1] < 0) {
				firstIndex = i;	count1 = 0;
			}
			if (arr[i] < 0 && arr[i - 1] > 0 || arr[i] > 0 && arr[i - 1] < 0) {
				++count1;
				if (count1 > maxCount) {
					maxCount = count1;start = firstIndex;
					end = i;
				}
			}
		}
		System.out.println("First Index = " + start + " sLast Index = " + end);
	}

}
