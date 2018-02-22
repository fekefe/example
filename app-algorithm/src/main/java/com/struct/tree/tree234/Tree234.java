package com.struct.tree.tree234;

/**
 * 多叉树
 */
public class Tree234 {
	private Node root = new Node();

	/**
	 * 获得值得位置
	 *
	 * @param key the key
	 * @return the int
	 */
	public int find(long key) {
		Node curNode = root;
		int childNumber;
		while (true) {
			if ((childNumber = curNode.findItem(key)) != -1) {
				return childNumber;
			} else if (curNode.isLeaf()) {
				return -1;
			} else {
				curNode = getNextChild(curNode, key);
			}
		}
	}

	/**
	 * 插入
	 *
	 * @param dValue the d value
	 */
	public void insert(long dValue) {
		Node curNode = root;
		DataItem tempItem = new DataItem(dValue);
		while (true) {
			if (curNode.isFull()) {
				split(curNode);
				curNode = curNode.getParent();
				curNode = getNextChild(curNode, dValue);
			} else if (curNode.isLeaf()) {
				break;
			} else {
				curNode = getNextChild(curNode, dValue);
			}
		}
		curNode.insertItem(tempItem);
	}

	/**
	 * 分割节点，并添加子节点
	 *
	 * @param thisNode the this node
	 */
	public void split(Node thisNode) {
		DataItem itemB, itemC;
		Node parent, child2, child3;
		int itemIndex;

		itemC = thisNode.removeItem();
		itemB = thisNode.removeItem();
		child2 = thisNode.disconnectChild(2);
		child3 = thisNode.disconnectChild(3);
		Node newRight = new Node();

		if (thisNode == root) {
			root = new Node();
			parent = root;
			root.connectChild(0, thisNode);
		} else {
			parent = thisNode.getParent();
		}

		itemIndex = parent.insertItem(itemB);
		int n = parent.getNumItems();

		for (int j = n - 1; j > itemIndex; j--) {
			Node temp = parent.disconnectChild(j);
			parent.connectChild(j + 1, temp);
		}

		parent.connectChild(itemIndex + 1, newRight);

		newRight.insertItem(itemC);
		newRight.connectChild(0, child2);
		newRight.connectChild(1, child3);
	}


	/**
	 *  获得值比数据项小的子节点，如果没有返回最后一个
	 *
	 * @param theNode  the the node
	 * @param theValue the the value
	 * @return the next child
	 */
	public Node getNextChild(Node theNode, long theValue) {
		int j;
		int numItems = theNode.getNumItems();
		for (j = 0; j < numItems; j++) {
			if (theValue < theNode.getItem(j).dData) {
				return theNode.getChild(j);
			}
		}
		return theNode.getChild(j);
	}

	/**
	 * 遍历
	 */
	public void displayTree() {
		recDisplayTree(root, 0, 0);
	}


	/**
	 *
	 */
	private void recDisplayTree(Node thisNode, int level, int childNumber) {
		System.out.println("level=" + level + " child=" + childNumber + " ");
		thisNode.displayNode();

		int numItems = thisNode.getNumItems();
		for (int j = 0; j < numItems + 1; j++) {
			Node nextNode = thisNode.getChild(j);
			if (nextNode != null) {
				recDisplayTree(nextNode, level + 1, j);
			} else {
				return;
			}
		}
	}



}
