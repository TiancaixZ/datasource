package com.javadatasource.linear;

/**
 * @program: datasource
 * @description: Node
 * @author: Chen2059
 * @create: 2021-06-21
 **/
public class Node<T> {
    //存储数据
    public T item;
    //指向下一个结点
    public Node<T> next;

    public Node(T item, Node<T> next) {
        this.item = item;
        this.next = next;
    }
}
