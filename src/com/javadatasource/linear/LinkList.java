package com.javadatasource.linear;

import java.util.Iterator;

/**
 * @program: datasource
 * @description: Linkist
 * @author: Chen2059
 * @create: 2021-06-21
 **/
public class LinkList<T> implements Iterable<T>{
    //记录首结点
    private Node head;
    //记录链表的长度
    private int N;

    private class Node {
        //存储数据
        T item;
        //指向下一个结点
         Node next;

        public Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }
    }

    public LinkList() {
        head = new Node(null ,null);
        N = 0;
    }

    //空置线性表
    public void clear() {
        head.next =null;
        head = null;
        N = 0;
    }

    //判断线性表是否为空，是返回true，否返回false
    public boolean isEmpty() {
        return N == 0;
    }

    //获取线性表中元素的个数
    public int length() {
        return N;
    }

    //读取并返回线性表中的第i个元素的值
    public T get(int i){
        if(i >= N && i < 0){
            throw new RuntimeException("位置不合法");
        }

        Node n = head.next;
        for (int index = 0; index < i; index++) {
            n = n.next;
        }
        return n.item;
    }

    //往线性表中添加一个元素
    public void insert(T t){
        Node n = head;
        while(n.next != null){
            n = n.next;
        }
        Node newNode = new Node(t, null);
        n.next = newNode;
        N++;
    }

    //在线性表的第i个元素之前插入一个值为t的数据元素
    public void insert(int i,T t){
        if(i < 0 || i >= N){
            throw new RuntimeException("位置不合法！");
        }

        Node n = head;
        for (int index = 0; index <= i-1; index++) {
            n = n.next;
        }
        Node cur = n.next;
        Node newNode = new Node(t, cur);
        n.next = newNode;
        N++;
    }

    //删除指定位置i处的元素，并返回被删除的元素
    public  T remove(int i){
        if(i < 0 || i >= N){
            throw new RuntimeException("位置不合法！");
        }

        Node n = head;
        for (int index = 0; index <= i-1; index++) {
            n = n.next;
        }
        Node curr = n.next;
        n.next = curr.next;
        N--;
        return curr.item;
    }

    //查找元素t在链表中第一次出现的位置
    public int indexOf(T t){
        Node h = head;
        for (int i = 0; h.next!= null; i++) {
            h = h.next;
            if(h.item.equals(t)){
                return i;
            }
        }

        return -1;
    }

    //对整个链表反转
    public void reverse(){
        if(N == 0){
            return;
        }
        reverse(head.next);
    }

    //*****
    //反转链表中的某个结点curr,并把反转后的curr结点返回
    public Node reverse(Node curr){
        if(curr.next ==null){
            head.next = curr;
            return curr;
        }

        Node pre = reverse(curr.next);
        pre.next = curr;
        curr.next = null;
        return curr;
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator();
    }

    private  class ListIterator implements Iterator<T>{
        private Node n;

        public ListIterator() {
            this.n = head;
        }

        @Override
        public boolean hasNext() {
            return n.next != null;
        }

        @Override
        public T next() {
            n = n.next;
            return n.item;
        }
    }
}
