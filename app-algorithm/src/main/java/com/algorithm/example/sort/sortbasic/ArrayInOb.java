package com.algorithm.example.sort.sortbasic;

import com.util.Person;

/**
 * 插入排序,对象
 */
public class ArrayInOb {

    public static void insertionSort(Person[] a) {
        int in, out;
        int nElems = a.length;
        for (out = 1; out < nElems; out++) {
            Person temp = a[out];
            in = out;
            while (in > 0 && a[in - 1].getLastName().compareTo(temp.getLastName()) > 0) {
                a[in] = a[in - 1];
                --in;
            }
            a[in] = temp;
        }
    }

}
