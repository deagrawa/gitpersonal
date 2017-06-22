package com.tree.avl;

public class AVLTree {

	TreeNode root;
	
	public TreeNode rightRotate(TreeNode y) {
		TreeNode x = y.left;
		TreeNode p = x.right;
		
		x.right = y;
		y.left = p;
		
		x.height = TreeUtill.getmax(TreeUtill.getHeight(x.left), TreeUtill.getHeight(x.right))+1;
		y.height = TreeUtill.getmax(TreeUtill.getHeight(y.left), TreeUtill.getHeight(y.right))+1;
		
		return x;
	}
	
	public TreeNode leftRotate(TreeNode y) {
		TreeNode x = y.right;
		TreeNode p = x.left;
		
		x.left = y;
		y.right = p;
		
		x.height = TreeUtill.getmax(TreeUtill.getHeight(x.left), TreeUtill.getHeight(x.right))+1;
		y.height = TreeUtill.getmax(TreeUtill.getHeight(y.left), TreeUtill.getHeight(y.right))+1;
		
		return x;
	}
	
	public TreeNode insert(TreeNode p, int data) {
		if (p == null) {
			return new TreeNode(data);
		}
		if(data<p.data) {
			p.left = insert(p.left, data);
		}
		else if(data>p.data) {
			p.right = insert(p.right, data);
		}
		else {
			return p;
		}
		p.height = TreeUtill.getmax(TreeUtill.getHeight(p.left), TreeUtill.getHeight(p.right)) + 1;
		
		int balance = TreeUtill.getBalance(p);
		if (balance > 1 && data < p.left.data) {
			return rightRotate(p);
		}
		if(balance < -1 && data>p.right.data) {
			p = leftRotate(p);
		}
		if(balance > 1 && data > p.left.data) {
			p.left = leftRotate(p.left);
			return rightRotate(p);
		}
		if(balance < -1 && data < p.right.data) {
			p.right = rightRotate(p.right);
			return leftRotate(p);
		}
		
		return p;
	}
	
}
