package com.tree.avl;

public class TreeNode {

	int data;
	TreeNode left;
	TreeNode right;
	int height;
	
	public TreeNode(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
		height = 1;
	}
}
