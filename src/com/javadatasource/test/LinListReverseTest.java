package com.javadatasource.test;

import com.javadatasource.linear.LinkList;

/**
 * @program: datasource
 * @description: LinkLIst Reverse Test
 * @author: Chen2059
 * @create: 2021-06-23
 **/
public class LinListReverseTest {
    public static void main(String[] args) {
        LinkList<Integer> list = new LinkList<>();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);

        for (Integer i : list) {
            System.out.println(i + "   ");
        }

        System.out.println();
        System.out.println("================");
        list.reverse();
        for (Integer i : list) {
            System.out.println(i + "   ");
        }
    }
}
