package com.sort.sortbasic;

import com.util.ArrayUtils;
import com.util.MakeNum;
import org.junit.Test;

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
	/*
7 8 6 2 1 	1 7 6 2 8
6 8 7 2 1
2 8 7 6 1
1 8 7 6 2

1 7 8 6 2 	1 2 6 7 8
1 6 8 7 2
1 2 8 7 6


1 2 7 8 6 	1 2 6 7 8
1 2 6 8 7



1 2 6 7 8 	1 2 6 7 8



循环10次，交换10次	循环10次，交换2次
	*/
	@Test
	public void test() {
		long[] a = {8, 7, 6, 2, 1};
		// long[] a = {7, 8, 2, 1, 6};
		ArraySel.selectionSort2(a);
	}

	/**
	 * 选择排序
	 * 优化版
	 *
	 * @param a
	 */
	public static void selectionSort(long[] a) {
		int forTimes = 0;
		int swapTimes = 0;
		int min;
		int nElems = a.length;
		for (int i = 0; i < nElems - 1; i++) {
			min = i;
			for (int j = i + 1; j < nElems; j++) {
				forTimes++;
				if (a[j] < a[min]) {
					min = j;
				}
			}
			if (i != min) {
				ArrayUtils.swap(a, i, min);
				swapTimes++;
			}
			MakeNum.display1(a);
		}
		System.out.println("循环" + forTimes + "次，交换" + swapTimes + "次");
	}

	/**
	 * 选择排序
	 * 原始版
	 *
	 * @param a
	 */
	public static void selectionSort2(long[] a) {
		int forTimes = 0;
		int swapTimes = 0;
		int nElems = a.length;
		for (int i = 0; i < nElems - 1; i++) {
			for (int j = i + 1; j < nElems; j++) {
				forTimes++;
				if (a[i] > a[j]) {
					ArrayUtils.swap(a, i, j);
					swapTimes++;
				}
				MakeNum.display1(a);
			}
		}
		System.out.println("循环" + forTimes + "次，交换" + swapTimes + "次");
	}
}
