package com.sort.sortbasic;

import com.util.ArrayUtils;
import com.util.MakeNum;
import org.junit.Test;

/**
 * 冒泡排序
 * 两个循环，一个判断，判断小就向前移动一个
 * 时间复杂度：O(n^2)
 * 稳定性：稳定
 * 比较次数O(N2)
 * 交换次数O(N2)
 */
public class ArrayBub {

	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
		MakeNum mn = new MakeNum(10);
		mn.display(mn.theArray);
		ArrayBub.bubbleSort(mn.theArray);
		mn.display(mn.theArray);
	}

	/**
	 * 冒泡排序
	 * 优化版：已经排序过的最后为，不再比较
	 * 两个循环，一个判断
	 *
	 * @param a the a
	 */
	public static void bubbleSort(long[] a) {
		int nElems = a.length;
		for (int i = nElems - 1; i >= 1; i--) {
			for (int j = 0; j < i; j++) {
				if (a[j] > a[j + 1]) {
					ArrayUtils.swap(a, j, j + 1);
				}
				MakeNum.display1(a);
			}
		}
	}

	/**
	 * 冒泡排序
	 * 原始版本
	 *
	 * @param a
	 */
	public static void bubbleSort2(long[] a) {
		// int out, in;
		int nElems = a.length;
		for (int i = 0; i < nElems - 1; i++) {
			for (int j = 0; j < nElems - 1; j++) {
				if (a[j] > a[j + 1]) {
					ArrayUtils.swap(a, j, j + 1);
				}
				MakeNum.display1(a);
			}
		}
	}

	@Test
	public void test() {
		// long[] a = {8, 7, 6, 2, 1};
		long[] a = {7, 8, 2, 1, 6};
		ArrayBub.bubbleSort(a);
	}

}
