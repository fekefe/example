package com.algorithm.example.sort.sortsenior;

import com.util.MakeNum;

/**
 * 希尔排序
 * 插入排序的升级版，
 * 比O(N2)快很多
 * 时间复杂度：O(logn*logn*n)=O(n*log2n)
 * 稳定性：不稳定
 */
public class ArraySh {


    public static void main(String[] args) {
        MakeNum mn = new MakeNum(130);
        mn.display(mn.theArray);
        ArraySh.shellSort(mn.theArray);
        mn.display(mn.theArray);
    }


    /**
     * Shell sortbasic.
     */
    public static void shellSort(long[] a) {
        int in, out;
        int nElems = a.length;
        long temp;
        int h = 1;
        while (h <= nElems / 3){
            // { 1,4,13,40,121...}
            h = h * 3 + 1;
        }
        while (h > 0) {
            for (out = h; out < nElems; out++) {
                temp = a[out];
                in = out;
                while (in > h - 1 && a[in - h] >= temp) {
                    a[in] = a[in - h];
                    in -= h;
                }
                a[in] = temp;
            }
            h = (h - 1) / 3;
        }
    }
}
