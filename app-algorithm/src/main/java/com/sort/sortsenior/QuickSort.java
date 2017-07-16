package com.sort.sortsenior;

import com.util.MakeNum;

/**
 * 快速排序
 * @author Administrator
 * 时间复杂度：将原始序列无限按二分法分解则复杂度为logn,遍历时low--->high则为n，所以O(logn*n)=O(nlogn)
 * 稳定性：不稳定
 */
public class QuickSort {

	private static long[] a;

	public QuickSort(long[] t) {
		a = t;
	}

	public static void main(String[] args) {
		MakeNum mn = new MakeNum(100);
		QuickSort qs = new QuickSort(mn.theArray);
		mn.display(a);
		qs.quickSort();
		mn.display(a);
	}

	public void quickSort() {
		recQuickSort(0, a.length - 1);
	}

	private void recQuickSort(int left, int right) {
		if (right - left <= 0) {
			return;
		} else {
			long pivot = a[right];
			int patition = partitionIt(left, right, pivot);
			recQuickSort(left, patition - 1);
			recQuickSort(patition + 1, right);
		}
	}

    private int partitionIt(int left, int right, long pivot) {
		int leftPtr = left - 1;
		int rightPtr = right;
		while (true) {
			while (a[++leftPtr] < pivot)
				;
			while (rightPtr > 0 && a[--rightPtr] > pivot)
				;
			if (leftPtr >= rightPtr) {
				break;
			} else {
				swap(leftPtr, rightPtr);
			}
		}
		swap(leftPtr, right);
		return leftPtr;
	}

    private void swap(int dex1, int dex2) {
		long temp;
		temp = a[dex1];
		a[dex1] = a[dex2];
		a[dex2] = temp;
	}
}
