package com.javadatasource.sort;

/**
 * @program: datasource
 * @description: 选择排序API
 * @author: Chen2059
 * @create: 2021-05-27
 **/
public class Selection {

    public Selection() {
    }

    /**
     * sort
     * @param a
     */
    public static void sort(Comparable[] a){
        for (int i = 0; i <a.length -2 ; i++) {
            int index = i;
            for (int j = i+1; j < a.length; j++) {
                if (greater(a[index], a[j])){
                    index = j;
                }
            }
            exh(a, i, index);
        }
    }

    /**
     *  比较相邻的两个数字大小是否相同
     * @param a
     * @param b
     * @return
     */
    private static boolean greater(Comparable a, Comparable b){
        return a.compareTo(b) > 0;
    }

    /**
     * 索引交换位置
     * @param a
     * @param i
     * @param j
     */
    private static void exh(Comparable[] a, int i, int j){
        Comparable temp = a[j];
        a[j] = a[i];
        a[i] = temp;
    }


}
