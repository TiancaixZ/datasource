package com.javadatasource.test;

import com.javadatasource.linear.SequenceList;

/**
 * @program: datasource
 * @description: SequenceList Test
 * @author: Chen2059
 * @create: 2021-06-18
 **/
public class SequenceListTest {
    public static void main(String[] args) {
        SequenceList<String> sl = new SequenceList<String>(10);

        sl.insert("姚明");
        sl.insert("科比");
        sl.insert("麦迪");
        sl.insert(1,"詹姆斯");
        sl.insert(2,"詹斯");
        System.out.println(2 + " " + sl.get(2));
        System.out.println(sl.remove(0));
        sl.clear();
        System.out.println(sl.length());

    }
}
