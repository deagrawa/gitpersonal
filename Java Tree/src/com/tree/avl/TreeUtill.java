package com.tree.avl;

public class TreeUtill {

	public static int getmax(int x, int y) {
		return x>y ?x:y;
	}
	
	public static int getHeight(TreeNode node) {
		if(node == null) {
			return 0;
		}
		else {
			return node.height;
		}
	}
	
	public static int getBalance(TreeNode node) {
		if(node == null) {
			return 0;
		}
		return (getHeight(node.left) - getHeight(node.right));
	}
	
	public static void preorder(TreeNode p) {
		if(p == null) {
			return;
		}
		System.out.println(p.data);
		preorder(p.left);
		preorder(p.right);
	}
}
