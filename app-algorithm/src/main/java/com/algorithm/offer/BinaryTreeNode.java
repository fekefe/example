package com.algorithm.offer;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author gaoquan on 2018/1/10
 */
public class BinaryTreeNode {
	
	int val;
	BinaryTreeNode left;
	BinaryTreeNode right;
	
	public BinaryTreeNode() {
	}
	
	public BinaryTreeNode(int val) {
		this.val = val;
	}
	
	@Override
	public String toString() {
		// 层序遍历
		String result = "";
		BinaryTreeNode node = this;
		Queue<BinaryTreeNode> queue = new ArrayBlockingQueue<>(100);
		while (node != null) {
			result += node.val + ",";
			if (node.left != null) {
				queue.offer(node.left);
			}
			if (node.right != null) {
				queue.offer(node.right);
			}
			node = queue.poll();
		}
		return result;
	}
	
}
