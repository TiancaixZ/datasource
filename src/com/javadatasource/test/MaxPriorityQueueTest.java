package com.javadatasource.test;

import com.javadatasource.priority.MaxPriorityQueue;

/**
 * @program: datasource
 * @description: MaxPriorityQueueTest
 * @author: Chen2059
 * @create: 2021-07-06
 **/
public class MaxPriorityQueueTest {
    public static void main(String[] args) {
        String[] arr = {"S", "O", "R", "T", "E", "X", "A", "M", "P", "L", "E"};
        MaxPriorityQueue<String> queue = new MaxPriorityQueue<>(20);
        for (String s : arr) {
            queue.insert(s);
        }

        System.out.println(queue.size());
        String del;
        while (!queue.isEmpty()){
            del = queue.delMax();
            System.out.println(del);
        }

    }
}
