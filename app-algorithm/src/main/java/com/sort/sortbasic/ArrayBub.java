package com.sort.sortbasic;

import com.util.ArrayUtils;
import com.util.MakeNum;

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
     * 两个循环，一个判断
     *
     * @param a the a
     */
    public static void bubbleSort(long[] a) {
        int out, in;
        int nElems = a.length;
        for (out = nElems - 1; out > 1; out--) {
			for (in = 0; in < out; in++) {
                if (a[in] > a[in + 1]) {
                    ArrayUtils.swap(a, in, in + 1);
                }
            }
        }
    }

}
