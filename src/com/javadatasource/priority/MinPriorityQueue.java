package com.javadatasource.priority;

/**
 * @program: datasource
 * @description: MinPriorityQueue
 * @author: Chen2059
 * @create: 2021-07-06
 **/
public class MinPriorityQueue<T extends Comparable<T>> {
    //用来存储元素的数组
    private T[] itmes;
    //记录堆中元素的个数
    private int N;

    //初始化
    public MinPriorityQueue(int capacity) {
        itmes = (T[]) new Comparable[capacity + 1];
        N = 0;
    }

    //判断堆中索引i处的元素是否小于索引j处的元素
    private boolean less(int i,int j){
        return itmes[i].compareTo(itmes[j]) < 0;
    }

    //交换堆中i索引和j索引处的值
    private void exch(int i,int j){
        T temp = itmes[i];
        itmes[i] = itmes[j];
        itmes[j] = temp;
    }

    //获取队列中元素的个数
    public int size(){
        return N;
    }

    //判断队列是否为空
    public boolean isEmpty() {
        return N == 0;
    }

    //删除队列中最小的元素,并返回这个最小元素
    public T delMin(){
        T min = itmes[1];
        exch(1,N);
        itmes[N] = null;
        N--;
        sink(1);
        return min;
    }

    //往队列中插入一个元素
    public void insert(T t){
        itmes[++N] = t;
        swim(N);
    }

    //使用上浮算法，使索引k处的元素能在堆中处于一个正确的位置
    private void swim(int k){
        while(k > 1){
            if (less(k,k/2)){
                exch(k, k/2);
            }
            k = k/2;
        }
    }

    //使用下沉算法，使索引k处的元素能在堆中处于一个正确的位置
    private void sink(int k){
        while(2 * k <= N){
            int min = 2*k;
            if(2 *k +1 <= N && !less(min,2*k+1)){
                min = 2*k+1;
            }
            if(less(k,min)){
                break;
            }
            exch(min, k);
            k = min;
        }
    }

}
