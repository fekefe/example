package com.sort.sortbasic;

import com.util.ArrayUtils;
import com.util.MakeNum;

/**
 * 选择排序
 * 两个循环，一个判断，判断找到大的才向前移动
 * 时间复杂度：O(n^2)
 * 稳定性：不稳定
 * 比较次数O(N2)
 * 交换次数O(N)
 */
public class ArraySel {


	public static void main(String[] args) {
		MakeNum mn = new MakeNum(10);
		mn.display(mn.theArray);
		ArraySel.selectionSort2(mn.theArray);
		mn.display(mn.theArray);
	}

	/**
	 * 选择排序
	 * 优化版
	 *
	 * @param a
	 */
	public static void selectionSort(long[] a) {
		int min;
		int nElems = a.length;
		for (int i = 0; i < nElems - 1; i++) {
			min = i;
			for (int j = i + 1; j < nElems; j++) {
				if (a[j] < a[min]) {
					min = j;
				}
			}
			if (i != min) {
				ArrayUtils.swap(a, i, min);
			}
		}
	}

	/**
	 * 选择排序
	 * 原始版
	 *
	 * @param a
	 */
	public static void selectionSort2(long[] a) {
		int nElems = a.length;
		for (int i = 0; i < nElems - 1; i++) {
			for (int j = i + 1; j < nElems; j++) {
				if (a[i] > a[j]) {
					ArrayUtils.swap(a, i, j);
				}
			}
		}
	}
}
