package com.javadatasource.test;

import com.javadatasource.sort.Bubble;
import com.javadatasource.sort.Student;

import java.util.Arrays;

/**
 * @program: datasource
 * @description: 测试冒泡排序
 * @author: Chen2059
 * @create: 2021-05-27
 **/
public class TestBubbleSort {

    /**
     *  测试冒泡排序 bubllesort
     * @param args
     */
    public static void main(String[] args) {

        Integer[] a = {13, 12, 1, 33, 344, 11};

        Bubble.sort(a);

        System.out.println(Arrays.toString(a));
    }



}
