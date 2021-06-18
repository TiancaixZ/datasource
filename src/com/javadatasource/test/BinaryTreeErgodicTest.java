package com.javadatasource.test;

import com.javadatasource.tree.BinaryTree;
import sun.misc.Queue;

/**
 * @program: datasource
 * @description: BinaryTree Ergodic Test
 * @author: Chen2059
 * @create: 2021-06-18
 **/
public class BinaryTreeErgodicTest {
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

        Queue<String> queue = tree.preErgodic();

    }
}
