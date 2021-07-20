package com.javadatasource.sort;

/**
 * @program: datasource
 * @description: Quick
 * @author: Chen2059
 * @create: 2021-07-03
 **/
public class Quick {

    //创建Quick对象
    public Quick() {
    }

    //对数组内的元素进行排序
    public static void sort(Comparable[] a){


    }

    //对数组a中从索引lo到索引hi之间的元素 进行排序
    private static void sort(Comparable[] a, int lo, int hi){

    }

    //对数组a中，从索引 lo到索引 hi之间的元 素进行分组，并返回分组界限对应的索引
    public static int partition(Comparable[] a,int lo,int hi){
        return 0;
    }

    //判断v是否小于w
    private static boolean less(Comparable v,Comparable w){
        return v.compareTo(w) < 0;
    }

    //交换a数组中，索引i和索引j处的值
    private static void exch(Comparable[] a,int i,int j){
        Comparable temp = a[j];
        a[j] = a[i];
        a[i] = temp;
    }
}
