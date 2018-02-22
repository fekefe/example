package com.struct.tree.tree234;

/**
 * 节点类
 */
public class Node {
	private static final int ORDER = 4;
	private int numItems;
	// 父节点
	private Node parent;
	// 子节点 4位置
	private Node childArray[] = new Node[ORDER];
	// 数据项 3位置
	private DataItem itemArray[] = new DataItem[ORDER - 1];


	/**
	 * 指定位置插入子节点
	 *
	 * @param childNum the child num
	 * @param child    the child
	 */
	public void connectChild(int childNum, Node child) {
		childArray[childNum] = child;
		if (child != null) {
			child.parent = this;
		}
	}

	/**
	 * 销毁子节点
	 *
	 * @param childNum the child num
	 * @return the node
	 */
	public Node disconnectChild(int childNum) {
		Node tempNode = childArray[childNum];
		childArray[childNum] = null;
		return tempNode;
	}

	/**
	 * 获得子节点
	 *
	 * @param childNum the child num
	 * @return the child
	 */
	public Node getChild(int childNum) {
		return childArray[childNum];
	}

	/**
	 * 获得父节点
	 *
	 * @return the parent
	 */
	public Node getParent() {
		return parent;
	}

	/**
	 * 是否有子节点
	 *
	 * @return the boolean
	 */
	public boolean isLeaf() {
		return childArray[0] == null;
	}

	/**
	 * 获得数据项的个数
	 *
	 * @return the num items
	 */
	public int getNumItems() {
		return numItems;
	}

	/**
	 * 获得数据项
	 *
	 * @param index the index
	 * @return the item
	 */
	public DataItem getItem(int index) {
		return itemArray[index];
	}

	/**
	 * 是否数据项装满
	 *
	 * @return the boolean
	 */
	public boolean isFull() {
		return numItems == ORDER - 1;
	}

	/**
	 * 查找数据项的位置
	 *
	 * @param key the key
	 * @return the int
	 */
	public int findItem(long key) {
		for (int j = 0; j < ORDER - 1; j++) {
			if (itemArray[j] == null) {
				break;
			} else if (itemArray[j].dData == key) {
				return j;
			}
		}
		return -1;
	}

	/**
	 * 插入数据项
	 *
	 * @param newItem the new item
	 * @return the int
	 */
	public int insertItem(DataItem newItem) {
		numItems++;
		long newKey = newItem.dData;
		for (int j = ORDER - 2; j >= 0; j--) {
			if (itemArray[j] == null) {
				continue;
			} else {
				long itsKey = itemArray[j].dData;
				if (newKey < itsKey) {
					itemArray[j + 1] = itemArray[j];
				} else {
					itemArray[j + 1] = newItem;
					return j + 1;
				}
			}
		}
		itemArray[0] = newItem;
		return 0;
	}

	/**
	 * 移出数据项
	 *
	 * @return the data item
	 */
	public DataItem removeItem() {
		DataItem temp = itemArray[numItems - 1];
		itemArray[numItems - 1] = null;
		numItems--;
		return temp;
	}

	/**
	 * 打印
	 */
	public void displayNode() {
		for (int j = 0; j < numItems; j++) {
			itemArray[j].displayItem();
		}
		System.out.println("/");
	}


}
