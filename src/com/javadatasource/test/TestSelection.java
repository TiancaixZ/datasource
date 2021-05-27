package com.javadatasource.test;

import com.javadatasource.sort.Selection;

import java.util.Arrays;

/**
 * @program: datasource
 * @description: 测试选择排序API
 * @author: Chen2059
 * @create: 2021-05-27
 **/
public class TestSelection {
    public static void main(String[] args) {
        Integer[] a = {8,2,4,6};

        Selection.sort(a);

        System.out.println(Arrays.toString(a));

    }
}
