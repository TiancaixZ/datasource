package com.javadatasource.heap;

/**
 * @program: datasource
 * @description: Heapsort
 * @author: Chen2059
 * @create: 2021-07-03
 **/
public class Heapsort {

    //对source数组中的数据从小到大排序
    public static void sort(Comparable[] source){
        Comparable[] heap = new Comparable[source.length + 1];
        createHeadp(source, heap);

        int N= heap.length - 1;

        while(N!=1){
            exch(heap, 1, N);
            N--;
            sink(heap,1,N);
        }

        System.arraycopy(heap,1,source,0,source.length);
    }

    //根据原数组 source，构造出堆heap
    private static void createHeadp(Comparable[] source, Comparable[] heap){
        System.arraycopy(source,0,heap,1,source.length);
        for (int i = source.length / 2; i > 0; i--) {
             sink(heap, i,heap.length-1);
        }
    }

    //判断heap堆中索引i处的元素是否小于索引j处的元素
    private static boolean less(Comparable[] heap, int i, int j){
        return heap[i].compareTo(heap[j]) < 0;
    }

    //交换heap堆中i索引和j索引处的值
    private static void exch(Comparable[] heap, int i, int j){
        Comparable temp = heap[i];
        heap[j] = heap[i];
        heap[i] = temp;
    }

    //在heap堆中，对target处的 元素做下沉，范围是0~range
    private static void sink(Comparable[] heap, int target, int range){
        while (2*target <= range){
            int max = 2*target;
            if (2*target+1 <= range){
                if (less(heap, 2*target, 2*target+1)){
                    max= 2*target+1;
                }
            }

            if (less(heap, target, max)){
                exch(heap, target, max);
            }

            target=max;
        }
    }

}
