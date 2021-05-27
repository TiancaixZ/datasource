package com.javadatasource.sort;

/**
 * @program: datasource
 * @description: 冒泡排序API
 * @author: Chen2059
 * @create: 2021-05-26
 **/
public class Bubble {

    public Bubble() {
    }

    /**
     * 对数组a进行排序
     * @param a
     */
    public static void sort(Comparable[] a){
        for (int i = a.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (greater(a[j], a[j+1])){
                    exh(a,j,j+1);
                }
            }
        }

    }

    /**
     * 判断 a是大于b
     * @param a
     * @param b
     * @return
     */
    private static boolean greater(Comparable a, Comparable b){
        int result = a.compareTo(b);
        if(result >=0){
            return true;
        } else {
            return false;
        }
    }

    /**
     * 交换a数组中的索引i和索引j的值
     * @param a
     * @param i
     * @param j
     */
    private static void exh(Comparable[] a,int i, int j){
        Comparable temp = a[j];
        a[i] = a[j];
        a[j] = temp;

    }
}
