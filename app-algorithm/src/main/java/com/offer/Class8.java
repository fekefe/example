package com.offer;

import org.junit.Test;

/**
 * 旋转数组的最小数字
 * 题目：把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。输入一个递增排序数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/1/25
 */
public class Class8 {
	/*
 	旋转数组的特点：
     1，旋转之后的数组可以分为两个排序的子数组，且前面的子数组的元素都大于或等于后面子数组的元素。
     2，最小或者最大元素位于两个子数组的分界

 	解题思路：在排序数组中，可以使用二分查找法进行查找
 	利用左右两个指针和中间指针元素大小关系判断中间元素是位于前面的子数组还是后面的子数组，缩小查找范围
 	需要考虑的特例：
     1，排序数组本身仍是该数组的一个旋转
     2，如果数组内有重复元素，那么有可能出现左右两指针元素与中间元素相同，无法判断中间元素属于前面子数组还是后面子数组，此时用顺序查找
     
     
     // class8a
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
		System.out.println(this.method(array));
	}
	
	public int method(int[] array) {
		int first = 0;
		int last = array.length - 1;
		int middle = (first + last) / 2;
		while (true) {
			if (middle == last) {
				return array[last];
			} else if (array[first] < array[middle] && array[last] < array[middle]) {
				first = middle;
				middle = middle + (last - first) / 2;
			} else if (array[first] > array[middle] && array[last] > array[middle]) {
				last = middle;
				middle = middle - (last - first) / 2;
			}
		}
	}
	
	
}
































