package com.javadatasource.test;

import com.javadatasource.linear.Queue;

/**
 * @program: datasource
 * @description: Queue Test
 * @author: Chen2059
 * @create: 2021-06-30
 **/
public class QueueTest {
    public static void main(String[] args) {
        Queue<String> queue = new Queue<>();
        queue.enqueue("a");
        queue.enqueue("b");
        queue.enqueue("c");
        queue.enqueue("d");

        for (String s : queue) {
            System.out.println(s + "");
        }

        System.out.println("===========");

        String dequeue = queue.dequeue();
        System.out.println(dequeue);
        System.out.println(queue.size());
    }
}
