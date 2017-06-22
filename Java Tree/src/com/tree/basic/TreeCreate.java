package com.tree.basic;

public class TreeCreate {

	public boolean flag;
	public Node root;

	public TreeCreate() {

		flag = false;
	}

	public void insert_into_tree(int item) {
		Node p;
		p = new Node();
		p.data = item;
		if (this.root == null) {
			this.root = p;
			return;
		}
		flag = false;
		Node q = this.root;
		do {
			if (item < q.data) {
				if (q.left == null) {
					q.left = p;
					flag = true;
				} else {
					q = q.left;
				}
			} else {
				if (q.right == null) {
					q.right = p;
					flag = true;
				} else {
					q = q.right;
				}
			}
		} while (!flag);
	}

}
