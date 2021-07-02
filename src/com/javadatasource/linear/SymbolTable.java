package com.javadatasource.linear;

import com.sun.jdi.Value;

import java.security.Key;

/**
 * @program: datasource
 * @description: SymbolTableTest
 * @author: Chen2059
 * @create: 2021-06-30
 **/
public class SymbolTable<Key, Value> {
    //记录首结点
    private Node head;
    //记录符号表中键值对的个数
    private int N;

    //内部结点类
    private class Node {
        //存储键
        public Key key;
        //存储值
        public Value value;
        //存储下一个结点
        public Node next;

        //创建Node对象
        public Node(Key key, Value value, Node next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

    //创建SymbolTable对象
    public SymbolTable() {
        this.head = new Node(null,null,null);
        this.N = 0;
    }

    //获取符号表的大小
    public int size(){
        return N;
    }

    //根据键key，找对应的值
    public Value get(Key key){
        Node node = this.head;
        while(node.next != null){
            node = node.next;
            if(node.key.equals(key)){
                return node.value;
            }
        }
        return null;
    }

    //向符号表中插入一个键值对
    public void put(Key key,Value value){
        Node node = this.head;
        while(node.next != null){
            node =node.next;
            if(node.key.equals(key)){
                node.value = value;
                return;
            }
        }

        Node oldFirst = head.next;
        Node newFirst = new Node(key, value, oldFirst);
        head.next = newFirst;
        N++;
    }

    //删除键为key的键值对
    public void delete(Key key){
        Node node = head;
        while(node.next != null){
            if(node.next.key.equals(key)){
                node.next = node.next.next;
                N--;
                return;
            }
            node = node.next;
        }
    }
}
