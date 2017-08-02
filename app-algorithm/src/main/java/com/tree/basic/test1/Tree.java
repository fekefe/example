package com.tree.basic.test1;

/**
 * @author gaoquan on 2017/8/2.
 */
public class Tree {
	private Node root;


	public Node createtree(Integer[] a) {
		int i1 = a.length / 2 - 1;
		for (int i = 0; i < i1; i++) {

		}

		return null;
	}


	public static void main(String[] args) {
		Tree tree = new Tree();
		Integer[] a = {1, 2, 3, 4, null};
		tree.createtree(a);
	}


	public int getHeight(Node tree) {
		int deep = 0;
		if (tree != null) {
			int left = getHeight(tree.leftChild);
			int right = getHeight(tree.rightChild);
			deep = (left >= right) ? left + 1 : right + 1;
		}
		return deep;
	}


}
