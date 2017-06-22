package com.array.problem;

public class SearchAnElementInSorted {
	
public static int searchElement(int arr[], int size, int key) {
		
	int pivot = getPivot(arr, 0, size-1);
	if(pivot == -1) {
		System.out.println("No pivot found");
		binarySearch(arr, 0, size -1, key);
	}
	if(arr[pivot] == key) {
		System.out.println("Key found");
		return pivot;
	}
	if(pivot > key) { 
		return binarySearch(arr, pivot +1, size -1, key);
	}
	else {
		return binarySearch(arr, 0, pivot, key);
	}
}

public static int binarySearch(int arr[], int low, int high, int key) {
	
	if(high < low) {
		return -1;
	}
	int mid = (low + high)/ 2;
	if(arr[mid] == key) {
		return mid;
	}
	if(arr[mid] > key) {
		return binarySearch(arr, low, mid-1, key);
	}
	else {
		return binarySearch(arr, mid+1, high, key);
	}
	
}

public static int getPivot(int arr[], int low, int high) {
	
	if(high < low ) {
		return -1;
	}
	if ( low == high) {
		return low;
	}
	int mid = (low + high)/2;
	if(mid < high && arr[mid] > arr[mid+1]) {
		return mid;
	}
	if(low < mid && arr[mid] < arr[mid-1]) {
		return mid-1;
	}
	if(arr[mid] < arr[mid+1]) {
		return getPivot(arr, mid+1, high );
	}
	return (getPivot (arr, low, mid-1));
	
	
}

	public static void main(String[] args) {
		 int arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
		 int key = 3;
		 int index = searchElement(arr, arr.length, key);
		 System.out.println("item key index = " + index);
		 
	}
	
	
}
