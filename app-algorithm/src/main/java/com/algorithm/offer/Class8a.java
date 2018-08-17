package com.algorithm.offer;

import org.junit.Test;

/**
 * 旋转数组的给定一个指定的数字n，让我们从数组中找出它的位置
 * 题目：把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。给定一个指定的数字n，让我们从数组中找出它的位置。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，输入1，返回位置3
 * @author gaoquan on 2018/1/25
 */
public class Class8a {
	/*
     之后给定一个指定的数字n，让我们从数组中找出它的位置
     在这里我们不妨在观察一下这个数组的特性。
     当我们选取一个拐点，将这个数组进行选择的时候，我们可以发现，从数组的中间元素开始，可以将这个数组划分为两个子数组。
     并且必然有一边的数组是有序的集合。{4,5,6,7,8,9,1,2,3}，该例中，middle元素为8，我们发现了他的左边元素为{4,5,6,7}是一个有序的集合。
     如果我们要查找的元素恰好在这个有序的数组内，那么只需要利用二分查找，便可以很快地找出这个元素。
     当然，我们需要一个条件来判断该元素是否在这个集合中。例：我们现在要查找的数为n
      if(n<array[middle]&&n>array[low])
       如果我们当前查找的数，小于middle元素，并且大于左边最小的元素。其实就可以理解为左边的数组是有序的了。
       我们就可以在左边集合中进行查找；反之，我们需要在右侧数组中查找该元素。
	 */
	
	
	@Test
	public void test1() {
		int[] array =
				// {2, 3, 4, 5, 1};
				// {3, 4, 5, 1, 2};
				// {4, 5, 1, 2, 3};
				{5, 1, 2, 3, 4};
		int n = 1;
		System.out.println(this.findElement(array, n));
	}
	
	public int findElement(int[] array, int x) {
		// write code here
		int first = 0;
		int last = array.length - 1;
		int middle;
		while (first <= last) {
			middle = (first + last) / 2;
			if (array[middle] == x) {
				return middle;
			} else if (x > array[middle]) {
				//第一个条件防止数组没有旋转的情况
				if (array[first] > array[middle] && x > array[last]) {
					last = middle - 1;
				} else {
					first = middle + 1;
				}
			} else {
				//第一个条件防止数组没有旋转的情况
				if (array[first] < array[middle] && x < array[first]) {
					first = middle + 1;
				} else {
					last = middle - 1;
				}
			}
		}
		return -1;
	}
	
	
}
































