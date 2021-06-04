package com.javadatasource.test;

import com.javadatasource.sort.Shell;

import java.util.Arrays;

/**
 * @program: datasource
 * @description: TestShellsort
 * @author: Chen2059
 * @create: 2021-06-04
 **/
public class TestShellSort {
    public static void main(String[] args) {
        Integer[] a = {9,1,2,5,7,4,8,6,3,5};
        Shell.sort(a);

        System.out.println(Arrays.toString(a));
    }
}
