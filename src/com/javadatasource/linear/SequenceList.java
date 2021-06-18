package com.javadatasource.linear;

import java.util.Iterator;

/**
 * @program: datasource
 * @description: SequenceList
 * @author: Chen2059
 * @create: 2021-06-18
 **/
public class SequenceList<T> implements Iterable<T>{
    //存储元素的数组
    private T[] eles;
    //当前线性表的长度
    private int N;

    //创建容量为capacity的SequenceList对象
    public SequenceList(int capacity) {
        eles = (T[]) new Object[capacity];
        N=0;
    }

    //空置线性表
    public void clear(){
        this.N=0;
    }

    //判断线性表是否为空，是返回true，否返回false
    public boolean isEmpty(){
        return N == 0;
    }

    //获取线性表中元素的个数
    public int length() {
        return N;
    }

    //读取并返回线性表中的第i个元素的值
    public T get(int i){
        if(i < 0 || i>= N){
            throw new RuntimeException("当前元素不存在！");
        }

        return eles[i];
    }

    //向线性表中添加一个元素t
    public void insert(T t){
        if(N == eles.length){
            //throw new RuntimeException("当前列表已满");
            resize(eles.length*2);
        }
        eles[N++] = t;
    }

    //在线性表的第i个元素之前插入一个值为t的数据元素
    public void insert(int i,T t){
        if(i < 0 || i> N){
            throw new RuntimeException("插入位置不合法");
        }
        if(N == eles.length){
            //throw new RuntimeException("当前列表已满");
            resize(eles.length*2);
        }
        for (int index = N; index > 1; index--) {
            eles[index] = eles[index-1];
        }
        eles[i] = t;
        N++;
    }

    //删除并返回线性表中第i个数据元素
    public T remove(int i){
        if(i < 0 || i>= N){
            throw new RuntimeException("当前要删除的元素不存在");
        }
        T t = eles[i];
        for (int index = i; index < eles.length - 1; index++) {
            eles[index] = eles[index+1];
        }
        N--;

        if(N >0 && N < eles.length/4){
            resize(eles.length/2);
        }

        return t;
    }

    //返回线性表中首次出现的指定的数据元素的位序号，若不存在，则返 回-1
    public int indexOf(T t){
        if(t == null){
            throw new RuntimeException("查找的元素不合法");
        }

        for (int i = 0; i < N; i++) {
            if (eles[i].equals(t)){
                return i;
            }
        }

        return -1;
    }

    public int capacity(){
        return eles.length;
    }

    //改变容量
    private void resize(int newSize) {
        T[] temp = eles;
        eles = (T[]) new Object[newSize];
        for (int i = 0; i < N; i++) {
            eles[i] = temp[i];
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new SIterator();
    }

    private class SIterator implements Iterator{
        private int cur;

        public SIterator() {
            this.cur = 0;
        }

        @Override
        public boolean hasNext() {
            return cur < N;
        }

        @Override
        public Object next() {
            return eles[cur++];
        }
    }
}
