package com.javadatasource.test;

import com.javadatasource.linear.TowWayLinkList;

/**
 * @program: datasource
 * @description: TowayLinkList Test
 * @author: Chen2059
 * @create: 2021-06-22
 **/
public class TowWayLinkListTest {
    public static void main(String[] args) {
        TowWayLinkList<String> list = new TowWayLinkList<String>();
        list.insert("0");
        list.insert("1");
        list.insert(2, "test");
        list.insert(3, "test2");

//        for (String s : list) {
//            System.out.println(s);
//        }
        System.out.println("===================");
        System.out.println(list.get(2));
        System.out.println("====================");
        System.out.println(list.remove(2));
        System.out.println(list.length());
        System.out.println("====================");
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

    }
}
