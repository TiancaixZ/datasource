package com.javadatasource.test;

import com.javadatasource.linear.Stack;

/**
 * @program: datasource
 * @description: Stack Test
 * @author: Chen2059
 * @create: 2021-06-25
 **/
public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");
        for (String s : stack) {
            System.out.println(s);
        }

        System.out.println("====================");

        String pop = stack.pop();
        System.out.println("弹出的元素："+pop);
        System.out.println(stack.size());
    }
}
