package com.javadatasource.linear;

import java.util.Iterator;

/**
 * @program: datasource
 * @description: Tow Way Link List
 * @author: Chen2059
 * @create: 2021-06-22
 **/
public class TowWayLinkList<T> implements Iterable<T> {
    //记录首结点
    private Node head;
    //记录尾结点
    private Node last;
    //记录链表的长度
    private int N;

    //结点
    private class Node {
        //存储数据
        private T item;
        //指向下一个结点
        private Node next;
        //指向上一个结点
        private Node pre;

        public Node(T item, Node next, Node pre) {
            this.item = item;
            this.next = next;
            this.pre = pre;
        }

    }

    //创建TowWayLinkList对象
    public TowWayLinkList() {
        last = null;
        head = new Node(null,null,null);
        N = 0;
    }

    //****
    //空置线性表
    public void clear(){
        head.next = null;
        head.pre = null;
        head.item = null;
        Node n = last.pre;
        while(n != null){
            n.next = null;
            n.item = null;
            n = n.pre;
        }
        N =0;
    }

    //判断线性表是否为空，是返回true，否返回false
    public boolean isEmpty(){
        return N == 0;
    }

    //获取线性表中元素的个数
    public int length(){
        return N;
    }

    //读取并返回线性表中的第i个元素的值
    public T get(int i){
        if(i <0 || i > N){
            throw new RuntimeException("位置不合法");
        }

        Node n = this.head;
        for (int index = 0; index < i; index++) {
            if(n.next != null){
                n = n.next;
            } else {
                throw new RuntimeException("不存在元素");
            }
        }
        return n.item;
    }

    //往线性表中添加一个元素
    public void insert(T t){
        if(last == null){
            last = new Node(t, head, null);
            head.next = last;
        } else {
            Node newNode = new Node(t, last, null);
            last.next = newNode;
            last = newNode;
        }
        N++;
    }

    //在线性表的第i个元素之前插入一个值为t的数据元素
    public void insert(int i, T t){
        if(i <0 || i > N){
            throw new RuntimeException("位置不合法");
        }
        Node n = this.head;
        for (int index = 0; index < i; index++) {
            n = n.next;
        }
        Node curr = n.next;
        Node newNode = new Node(t, n, curr);
        curr.pre = newNode;
        n.next = newNode;
        N++;
    }

    //删除并返回线性表中第i个数据元素
    public T remove(int i){
        if(i <0 || i > N){
            throw new RuntimeException("位置不合法");
        }
        Node n = this.head;
        for (int index = 0; index < i; index++) {
            n = n.next;
        }
        Node curr = n.next;
        Node curr_next = curr.next;

        n.next = curr_next;
        curr_next.pre = n;

        N--;
        return  curr.item;
    }

    //返回线性表中首次出现的指定的数据元素的位序号，若不存在，则 返回-1
    public int indexOf(T t){
        Node n =head;
        int index = 0;
        while(n.next != null){
            index++;
            n = n.next;
            if(n.next.equals(t)){
                return  index;
            }
        }
        return -1;
    }

    //获取第一个元素
    public T getFirst(){
        return isEmpty() ? null : head.next.item;
    }

    //获取最后一个元素
    public T getLast(){
        return isEmpty() ? null : last.item;
    }

    @Override
    public Iterator<T> iterator() {
        return new TIterator();
    }

    private class TIterator implements Iterator{
        private Node n = head;

        @Override
        public boolean hasNext() {
            return n.next != null;
        }

        @Override
        public Object next() {
            return n.next.item;
        }
    }

}
