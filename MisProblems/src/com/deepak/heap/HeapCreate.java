package com.deepak.heap;

public class HeapCreate {

	private int maxSize;
	private int heapSize;
	private int[] heap;
	
	HeapCreate(int n) {
		heap = new int[n];
		heapSize = 0;
		maxSize = n;
	}
	
	private int getParent(int i) {
		return (i-1)/2;
	}
	
	private int getLeft(int i) {
		return 2*1+1;
	}
	private int getRight(int i) {
		return 2*i+2;
	}
	
	public void insert(int item) {
		if(heapSize >= maxSize) {
			return;
		}
		heapSize++;
		int i = heapSize-1;
		this.heap[i] = item;
		
		int parent = this.getParent(i);
		while (i != 0 && this.heap[parent] > this.heap[i]){
		
			this.heap[parent] = this.heap[i] + this.heap[parent];
			this.heap[i] = this.heap[parent] - this.heap[i];
			this.heap[parent] = this.heap[parent] - this.heap[i];
			i = this.getParent(i);
		}
	}
	private void minHeapify(int x) {
		int left = this.getLeft(x);
		int right = this.getRight(x);
		
		int small = x;
		
		if(left < this.heapSize && this.heap[left] < this.heap[small]) {
			small = left;
		}
		if(right < this.heapSize && this.heap[right] < this.heap[small]) {
			small = right;
		}
		if(small != x) {
			this.heap[small] = this.heap[x]+ this.heap[small];
			this.heap[x] = this.heap[small] - this.heap[x];
			this.heap[small] = this.heap[small] - this.heap[x];
			this.minHeapify(small);
		}
		
	}
	public int getMin() {
		if(this.heapSize == 0) {
			return Integer.MAX_VALUE;
		}
		int item = heap[0];
		heap[0] = heap[this.heapSize-1];
		this.heapSize--;
		this.minHeapify(0);
		return item;
	}
	
	public void heapPrint() {
		for (int i=0; i<this.heapSize; ++i) {
			System.out.println(this.heap[i]);
		}
	}
	
}
