package com.javadatasource.sort;

/**
 * @program: datasource
 * @description: Sheellsort
 * @author: Chen2059
 * @create: 2021-06-04
 **/
public class Shell {
    /**
     * 对数组a进行排序
     * @param a
     */
    public static void sort(Comparable[] a){
        int h = 1;
        while(h < a.length / 2){
            h = 2 * h + 1;
        }
        while(h >= 1){
            for (int i = h; i < a.length; i++) {
                for(int j = i; j >= h; j -= h){
                    if (greater(a[j-h],a[j])){
                        exch(a,j-h,j);
                    } else {
                        break;
                    }
                }

            }

             h = h / 2;
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
