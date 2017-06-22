package com.deepak.heap;

public class TestHeap {

	public static void main(String[] args) {
		HeapCreate heap = new HeapCreate(10);
		heap.insert(30);
		heap.insert(20);
		heap.insert(5);
		heap.insert(50);
		heap.insert(2);
		heap.insert(12);
		heap.insert(90);
		heap.insert(1);
		heap.insert(23);
		heap.insert(24);
		
		heap.heapPrint();
		
		
		

	}

	
}
