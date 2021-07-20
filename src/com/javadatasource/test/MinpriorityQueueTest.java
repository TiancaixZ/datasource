package com.javadatasource.test;

import com.javadatasource.priority.MinPriorityQueue;

/**
 * @program: datasource
 * @description: MinPriorityQueueTest
 * @author: Chen2059
 * @create: 2021-07-06
 **/
public class MinpriorityQueueTest {
    public static void main(String[] args) {
        String[] arr = {"G","F", "E", "D","C","B", "A"};
        MinPriorityQueue<String> queue = new MinPriorityQueue<>(20);
        for (String s : arr) {
            queue.insert(s);
        }
        System.out.println(queue.size());
        String del;
        while(!queue.isEmpty()){
            del = queue.delMin();
            System.out.println(del);
        }
    }
}
