package com.algorithm.offer;

import org.junit.Test;

/**
 * 剑指offer面试题6：重建二叉树
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 * 假设输入的前序遍历和中序遍历结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建出二叉树并输出他的根节点。
 * <p>
 * 题目：输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建出下图的二叉树并输出他的根节点。
 * <p>        1
 * <p>     /   \
 * <p>    2     3
 * <p>  /      / \
 * <p>4       5   6
 * <p> \        /
 * <p> 7        8
 * @author ggh on 2018/1/9
 */
public class Class6 {
	
	BinaryTreeNode treeFromBuild(int[] in, int[] pe, int peNum, int length) {
		
		if (length < 1 || peNum > in.length) {
			return null;
		}
		BinaryTreeNode node = new BinaryTreeNode();
		node.val = pe[peNum];
		int i = 0;
		for (; i < length; i++) {
			if (in[i] == pe[peNum]) {
				break;
			}
		}
		// left
		node.left = this.treeFromBuild(in, pe, peNum + 1, i);
		// right
		int i1 = peNum + i + 1;
		int i2 = 8 - (i + 1);
		node.right = this.treeFromBuild(in, pe, i1, i2);
		return node;
	}
	
	
	@Test
	public void test1() {
		int[] pre = {1, 2, 4, 7, 3, 5, 6, 8};
		int[] in = {4, 7, 2, 1, 5, 3, 8, 6};
		
		BinaryTreeNode node = this.treeFromBuild(in, pre, 0, 8);
		printTree(node);
	}
	
	
	//中序遍历递归打印
	public void printTree(BinaryTreeNode node) {
		if (node != null) {
			printTree(node.left);
			System.out.print(node.val + " ");
			printTree(node.right);
		}
	}
}
