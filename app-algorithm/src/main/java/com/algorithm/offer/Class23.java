package com.algorithm.offer;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * 从上到下打印二叉树（树的层序遍历）
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/1/25
 */
public class Class23 {
	/*
	 	  8
		/   \
	   6     10
	  / \    / \
 	 5   7  9  11
	 */
	
	public static void main(String[] args) {
		BinaryTreeNode node8 = new BinaryTreeNode(8);
		BinaryTreeNode node6 = new BinaryTreeNode(6);
		BinaryTreeNode node10 = new BinaryTreeNode(10);
		BinaryTreeNode node5 = new BinaryTreeNode(5);
		BinaryTreeNode node7 = new BinaryTreeNode(7);
		BinaryTreeNode node9 = new BinaryTreeNode(9);
		BinaryTreeNode node11 = new BinaryTreeNode(11);
		
		node8.left = node6;
		node8.right = node10;
		
		node6.left = node5;
		node6.right = node7;
		
		node10.left = node9;
		node10.right = node11;
		
		printTree(node8);
	}
	
	public static void printTree(BinaryTreeNode node) {
		Queue<BinaryTreeNode> queue = new ArrayBlockingQueue<>(100);
		while (node != null) {
			System.out.print(node.val + ",");
			if (node.left != null) {
				queue.offer(node.left);
			}
			if (node.right != null) {
				queue.offer(node.right);
			}
			node = queue.poll();
		}
	}
}
