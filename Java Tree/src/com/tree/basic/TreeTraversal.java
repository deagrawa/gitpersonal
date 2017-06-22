package com.tree.basic;

public class TreeTraversal {

	public void inOrder(Node root) {
		try {
			if (root != null) {
				inOrder(root.left);
				System.out.println(" " + root.data);
				inOrder(root.right);
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
