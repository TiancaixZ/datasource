package com.javadatasource.linear;

import java.util.Iterator;

/**
 * @program: datasource
 * @description: Queue
 * @author: Chen2059
 * @create: 2021-06-18
 **/
public class Queue<T> implements Iterable<T> {
    //记录首结点
    private Node head;
    //当前栈的元素个数
    private int N;
    //记录最后一个结点
    private Node last;

    //内部结点类
    private class Node {
        //存储数据
        public T item;
        //指向下一个结点
        public Node next;

        public Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }
    }

    //创建Queue对象
    public Queue() {
        this.head = new Node(null,null);
        this.last = null;
        this.N = 0;
    }

    //判断队列是否为空，是返回true，否返回false
    public boolean isEmpty(){
        return N == 0;
    }

    //获取队列中元素的个数
    public int size(){
        return N;
    }

    //从队列中拿出一个元素
    public T dequeue(){
        if(isEmpty()){
            return null;
        }

        Node oldFirst = head.next;
        head.next = oldFirst.next;
        N--;
        if (isEmpty()){
            last = null;
        }

        return oldFirst.item;
    }

    //往队列中插入一个元素
    public void enqueue(T t){
        if(last == null){
            last = new Node(t, null);
            head.next = last;
        } else {
            Node oldlast = last;
            oldlast.next = new Node(t, null);
            last = oldlast.next;
        }
        N++;
    }

    @Override
    public Iterator<T> iterator() {
        return new QIterator();
    }

    private class QIterator implements Iterator<T>{
        private Node n = head;

        @Override
        public boolean hasNext() {
            return n.next != null;
        }

        @Override
        public T next() {
            Node node = n.next;
            n = n.next;
            return node.item;
        }
    }


}
