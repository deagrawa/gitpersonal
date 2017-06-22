package com.deepak.sort;

public class QuickSortAlgo {

	public static int partition(int[] arr, int low, int high) {
		int i = low - 1;

		int pivot = arr[high];
		for (int j = low; j < high; ++j) {
			if (arr[j] <= pivot) {
				++i;
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}

		}
		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		return i + 1;
	}

	public static void quickSort(int[] arr, int low, int high) {
		while (low < high) {
			int pivot = partition(arr, low, high);

			if ((pivot - low) < (high - pivot)) {
				quickSort(arr, low, pivot - 1);
				low = pivot + 1;
			} else {
				quickSort(arr, pivot + 1, high);
				high = pivot - 1;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 10, 80, 30, 90, 40, 50, 70 };

		quickSort(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; ++i) {
			System.out.print(" " + arr[i]);
		}
	}
}
