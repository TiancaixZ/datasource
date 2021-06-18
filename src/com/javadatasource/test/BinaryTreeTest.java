package com.javadatasource.test;

import com.javadatasource.tree.BinaryTree;

/**
 * @program: datasource
 * @description: BinaryTreetTest
 * @author: Chen2059
 * @create: 2021-06-18
 **/
public class BinaryTreeTest {
    public static void main(String[] args) {
        BinaryTree<Integer, String> tree = new BinaryTree<Integer, String>();

        tree.put(1, "张三");
        tree.put(2, "李四");
        tree.put(3, "王五");
        System.out.println("put" + tree.size());

        System.out.println("get" + tree.get(2));

        tree.delete(3);
        System.out.println("delete" + tree.size());

    }
}
