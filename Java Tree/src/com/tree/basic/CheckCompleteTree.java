package com.tree.basic;

public class CheckCompleteTree {

	private Node root;
	CheckCompleteTree(Node root) {
		this.root = root;
	}
	
	public int nodeCount(Node p) {
		
		if(p == null) {
			return 0;
		}
		return (this.nodeCount(p.left) + this.nodeCount(p.right) + 1);
	}
	
	public void checkComplete() {
		Node p = this.root;
		int count = this.nodeCount(p);
		if(this.checkUtil(p, 0, count)) {
			System.out.println("Tree is complete");
		}
		else {
			System.out.println("Tree is not complete");
		}
		
	}
	
	private boolean checkUtil(Node root, int index, int count) {
		
		if(root == null) {
			return true;
		}
		if(index >= count) {
			return false;
		}
		return (checkUtil(root.left, 2*index+1, count) && checkUtil(root.right, 2*index+2, count) );
		
 	}
}
