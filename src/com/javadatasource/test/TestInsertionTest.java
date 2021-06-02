package com.javadatasource.test;

import com.javadatasource.sort.Insertion;

import java.util.Arrays;

/**
 * @program: datasource
 * @description: 测试插入排序API
 * @author: Chen2059
 * @create: 2021-06-02
 **/
public class TestInsertionTest {
    public static void main(String[] args) {
        Integer[] a = {4,3,2,10,12,1,5,6};

        Insertion.sort(a);

        System.out.println(Arrays.toString(a));
    }
}
