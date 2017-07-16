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
        MakeNum mn = new MakeNum(100);
        mn.display(mn.theArray);
        ArraySel.selectionSort(mn.theArray);
        mn.display(mn.theArray);
    }

    public static void selectionSort(long[] a) {
        int out, in, min;
        int nElems = a.length;
        for (out = 0; out < nElems - 1; out++) {
            min = out;
            for (in = out + 1; in < nElems; in++) {
                if (a[in] < a[min]) {
                    min = in;
                }
            }
            if (out != min) {
                ArrayUtils.swap(a, out, min);
            }
        }
    }
}
