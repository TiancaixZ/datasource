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

        sl.insert(0,"姚明");
        sl.insert(1,"科比");
        sl.insert(2,"麦迪");
        sl.insert(3,"詹姆斯");
        sl.insert(4,"卡特");

        System.out.println(sl.capacity());

        sl.insert(5,"aa");
        System.out.println(sl.capacity());
        sl.insert(5,"aa");
        sl.insert(5,"aa");
        sl.insert(5,"aa");
        sl.insert(5,"aa");
        sl.insert(5,"aa");
        System.out.println(sl.capacity());

        sl.remove(1);
//        sl.remove(1);
//        sl.remove(1);
//        sl.remove(1);
//        sl.remove(1);
//        sl.remove(1);
//        sl.remove(1);
        sl.clear();
        System.out.println("=======");
       
        System.out.println(sl.capacity());

    }
}
