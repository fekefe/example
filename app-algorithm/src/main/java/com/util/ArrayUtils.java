package com.util;

/**
 * 数组工具
 */
public class ArrayUtils {
    /**
     * 数组调换
     *
     * @param a   the a
     * @param one the one
     * @param two the two
     */
    public static void swap(long[] a, int one, int two) {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }

}
