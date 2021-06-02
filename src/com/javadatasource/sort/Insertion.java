package com.javadatasource.sort;

/**
 * @program: datasource
 * @description: 插入排序AP I
 * @author: Chen2059
 * @create: 2021-06-02
 **/
public class Insertion {
    /**
     * 对数组a进行排序
     * @param a
     */
    public static void sort(Comparable[] a){
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0; j--) {
                if (greater(a[j-1],a[j])){
                    exch(a, j-1,j);
                } else {
                    break;
                }
            }
        }
    }

    /**
     * 判断V是否大于W
     * @param v
     * @param w
     * @return
     */
    public static boolean greater(Comparable v, Comparable w){
        return v.compareTo(w) > 0;
    }

    /**
     * 交换a数组中，索引i和索引j处的值
     * @param a
     * @param i
     * @param j
     */
    public static void exch(Comparable[] a, int i, int j){
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
