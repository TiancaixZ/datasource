package com.javadatasource.linear;

import java.util.Iterator;

/**
 * @program: datasource
 * @description: Stack
 * @author: Chen2059
 * @create: 2021-06-25
 **/
public class Stack<T> implements Iterable<T>{
    //当前栈的元素个数
    private int N;
    //记录首结点
    private Node head;

    public Stack() {
        this.N = 0;
        this.head = new Node(null,null);
    }

    //内部结点类
    private class Node {
        public T item;
        public Node next;

        public Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }
    }

    //判断栈是否为空，是返回true，否返回false
    public boolean isEmpty() {
        return N == 0;
    }

    //获取栈中元素的个数
    public int size() {
        return N;
    }

    //弹出栈顶元素
    public T pop(){
        Node oldNext = head.next;
        if(oldNext == null){
            return null;
        }
        head.next = head.next.next;
        N--;
        return oldNext.item;
    }

    //向栈中压入元素t
    public void push(T t){
        Node oldNext = head.next;
        Node node = new Node(t, oldNext);
        head.next = node;
        N++;
    }

    @Override
    public Iterator<T> iterator() {
        return new SItrator();
    }

    private class SItrator implements Iterator<T>{
        private Node n = head;

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
