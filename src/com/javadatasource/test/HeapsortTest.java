package com.javadatasource.test;

import com.javadatasource.heap.Heapsort;

import java.util.Arrays;

/**
 * @program: datasource
 * @description: HeapsortTest
 * @author: Chen2059
 * @create: 2021-07-03
 **/
public class HeapsortTest {
    public static void main(String[] args) {
        String[] arr = {"S", "O", "R", "T", "E", "X", "A", "M", "P", "L", "E"};
        Heapsort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
