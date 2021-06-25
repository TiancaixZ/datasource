package com.javadatasource.test;

import com.javadatasource.linear.LinkList;

/**
 * @program: datasource
 * @description: LinkList Test
 * @author: Chen2059
 * @create: 2021-06-21
 **/
public class LinkListTest {
    public static void main(String[] args) {
        LinkList<String> linkList = new LinkList<String>();
        linkList.insert( "张三");
        linkList.insert("李四");
        linkList.insert("王五");
        linkList.insert("赵六");
        for(String s : linkList){
            System.out.println(s);
        }

        System.out.println(linkList.length());
        System.out.println("===============");

        System.out.println(linkList.get(2));
        System.out.println("===============");

        String remove = linkList.remove(1);
        System.out.println(remove);
        System.out.println(linkList.length());
        System.out.println("===============");

        for(String s : linkList){
            System.out.println(s);
        }


    }
}
