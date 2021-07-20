package com.javadatasource.priority;

/**
 * @program: datasource
 * @description: IndexMinPriorityQueue
 * @author: Chen2059
 * @create: 2021-07-06
 **/
public class IndexMinPriorityQueue<T extends Comparable<T>> {
    //记录堆中元素的个数
    private int N;
    //保存qp的逆序，pq的值作为索引，pq的索引作为值
    private int[] qp;
    //保存每个元素在items数组中的索引，pq数组需要堆有序
    private int[] pq;
    //用来存储元素的数组
    private T[] items;

    //初始化
    public IndexMinPriorityQueue(int capacity) {
        items = (T[]) new Comparable[capacity+1];
        qp = new int[capacity+1];
        pq = new int[capacity+1];
        N = 0;
    }

    //判断堆中索引i处的元素是否小于索引j处的元素
    private boolean less(int i, int j){
        return items[i].compareTo(items[j]) < 0;
    }

    //交换堆中i索引和j索引处的值
    private void exch(int i, int j){
        T temp = items[i];
        items[i] = items[j];
        items[j] = temp;
    }

    //获取队列中元素的个数
    public int size() {
        return N;
    }

    //获取队列中元素的个数
    public boolean isEmpty(){
        return N == 0;
    }

    //判断k对应的元素是否存在
    public boolean contains(int k){
        return false;
    }

    //删除队列中最小的元素,并返回该元素关联的索引

}
