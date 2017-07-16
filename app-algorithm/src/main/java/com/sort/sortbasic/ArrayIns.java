package com.sort.sortbasic;

import com.util.MakeNum;

/**
 * 插入排序
 * 局部有序，取出无序的那个，向前比较，比其小，其向后移动一个位置
 * 时间复杂度：O(n^2)
 * 稳定性：稳定
 * 比冒泡快一倍，比选择快一点
 */
public class ArrayIns {


    public static void main(String[] args) {
        MakeNum mn = new MakeNum(100);
        mn.display(mn.theArray);
        ArrayIns.insertSort(mn.theArray);
        mn.display(mn.theArray);
    }

    /**
     * Insert sortbasic.
     */
    public static void insertSort(long[] a) {
        int out, in;
        int nElems = a.length;
        for (out = 1; out < nElems; out++) {
            long temp = a[out];
            in = out;
            while (in > 0 && a[in - 1] >= temp) {
                a[in] = a[in - 1];
                --in;
            }
            a[in] = temp;
        }
    }



    /**
     * The entry point of application.
     *
     * @param args the input arguments

    public static void main(String[] args) {
        display(a);
        // insertSort();
        shellSort();
        display(a);
    }     */
}
