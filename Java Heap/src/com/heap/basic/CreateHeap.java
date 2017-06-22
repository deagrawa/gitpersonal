package com.heap.basic;

public class CreateHeap {

	private int heapSize;
	private int[] heap;
	
	public int getHeapSize() {
		return this.heapSize;
	}
	public int[] getHeap() {
		return this.heap;
	}
	
	public CreateHeap(int size, int[] arr) {
		this.heapSize = size;
		this.heap = arr;
	}
	public int getParent(int i ) {
		return (i-1)/2;
	}
	public int getLeft(int i){
		return (2*i+1);
	}
	public int getRight(int i) {
		return (2*i+2);
	}
	public void swap(int x, int y) {
		
		int temp = this.heap[x];
		this.heap[x] = this.heap[y];
		this.heap[y] = temp;
	}
	public void createHeap(){
		for (int i = (this.heapSize-2)/2; i>= 0; --i) {
			this.MaxHeapify(i);
		}
		
		
	}
	public void MaxHeapify(int i) {
		int largest = i;
		int left = this.getLeft(i);
		int right = this.getRight(i);
		
		if(left < this.heapSize && this.heap[left] > this.heap[largest]) {
			largest = left;
		}
		if (right < this.heapSize && this.heap[right] > this.heap[largest]) {
			largest = right;
		}
		
		if(largest != i) {
			this.swap(largest, i);
			this.MaxHeapify(largest);
		}
	}
	
	public void HeapSort(){
		this.createHeap();
		
		int size = this.heapSize;
		
		while (this.heapSize > 1) {
			swap(0, this.heapSize - 1);
			this.heapSize = this.heapSize -1;
			this.MaxHeapify(0);
		}
		this.heapSize = size;
		
		for (int i =0; i<this.heapSize; ++i) {
			System.out.println(i+"th Element" + this.heap[i]);
		}
	}

	
	
}
