package com.algorithm.example.sort.sortsenior;

import com.util.ArrayUtils;
import com.util.MakeNum;

/**
 * 划分
 *
 * @author Administrator
 */
public class ArrayPar {


    public static void main(String[] args) {
        long pivot = 50;
        MakeNum mn = new MakeNum(100);
        int nElems = mn.theArray.length;
        mn.display(mn.theArray);
        ArrayPar.partitionIt(mn.theArray, 0, nElems - 1, pivot);
        mn.display(mn.theArray);
    }

    public static int partitionIt(long[] a, int left, int right, long pivot) {
        int leftPtr = left - 1;
        int rightPtr = right + 1;
        while (true) {
            while (leftPtr < right && a[++leftPtr] < pivot)
                ;
            while (rightPtr > left && a[--rightPtr] > pivot)
                ;
            if (leftPtr >= rightPtr) {
                break;
            } else {
                ArrayUtils.swap(a, leftPtr, rightPtr);
            }
        }
        return leftPtr;
    }


}
