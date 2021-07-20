package com.javadatasource.test;

import com.javadatasource.tree.RedBlackTree;

/**
 * @program: datasource
 * @description:RedBlackTree Test
 * @author: Chen2059
 * @create: 2021-07-20
 **/
public class RedBlackTreeTest {
    public static void main(String[] args) {
        RedBlackTree<Integer, String> tree = new RedBlackTree<>();

        tree.put(1,"张三");
        tree.put(2,"李四");
        tree.put(3,"王五");
        tree.put(4,"二哈");

        System.out.println(tree.get(1));
        System.out.println(tree.get(2));
        System.out.println(tree.get(3));
        System.out.println(tree.get(4));
    }



    
    
}
