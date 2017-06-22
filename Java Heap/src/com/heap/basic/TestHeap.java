package com.heap.basic;

public class TestHeap {

	
	public static void main(String[] args) {
		int [] arr = new int []{5,6,7,12,11,13};
		CreateHeap heap = new CreateHeap(6, arr);
		heap.HeapSort();
		/*for (int i =0; i<6; ++i) {
			System.out.println(i+"th Element" + arr[i]);
		}*/
	}
}
