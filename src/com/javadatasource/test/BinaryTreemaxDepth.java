package com.javadatasource.test;

import com.javadatasource.linear.Queue;
import com.javadatasource.tree.BinaryTree;

/**
 * @program: datasource
 * @description: BinaryTreemaxDepth
 * @author: Chen2059
 * @create: 2021-07-02
 **/
public class BinaryTreemaxDepth {
    public static void main(String[] args) {
        BinaryTree<String, String> tree = new BinaryTree<>();
        tree.put("E", "5");
        tree.put("B", "2");
        tree.put("G", "7");
        tree.put("A", "1");
        tree.put("D", "4");
        tree.put("F", "6");
        tree.put("H", "8");
        tree.put("C", "3");

       int i = tree.maxDepth();

        System.out.println(i);
    }
}
