package com.tree.basic;

import java.util.concurrent.atomic.AtomicInteger;

public class TestTree {
	
	public static void kthBiggerElelment(Node root, AtomicInteger k, int count) {
		if(root == null || k.get() >= count) {
			return;
		}
		kthBiggerElelment(root.right, k, count);
		k.incrementAndGet();
		if(k.get() ==count) {
			System.out.println(root.data);
			return;
		}
		kthBiggerElelment(root.left, k, count);
	}

	public static void main(String[] args) {
		TreeCreate tc = new TreeCreate();

		//System.out.println("hello");
		tc.insert_into_tree(10);
		tc.insert_into_tree(8);
		tc.insert_into_tree(9);
		tc.insert_into_tree(5);
		tc.insert_into_tree(20);
		tc.insert_into_tree(25);
		tc.insert_into_tree(15);
		tc.insert_into_tree(30);

		TreeTraversal tv = new TreeTraversal();
		//tv.inOrder(tc.root);
		
		AtomicInteger k = new AtomicInteger(0);
		
		kthBiggerElelment(tc.root, k, 3);
		
		/*CheckCompleteTree cct = new CheckCompleteTree(tc.root);
		cct.checkComplete();
*/
	}

}
