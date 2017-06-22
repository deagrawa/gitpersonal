package com.tree.avl;

public class TestAVL {

	public static void main(String[] args) {
		AVLTree tree = new AVLTree();
		
		tree.root = tree.insert(tree.root, 10);
		tree.root = tree.insert(tree.root, 20);
		tree.root = tree.insert(tree.root, 30);
		tree.root = tree.insert(tree.root, 40);
		tree.root = tree.insert(tree.root, 50);
		tree.root = tree.insert(tree.root, 60);
		tree.root = tree.insert(tree.root, 15);
		
		TreeUtill.preorder(tree.root);
		

	}

}
