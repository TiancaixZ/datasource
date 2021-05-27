package com.javadatasource.test;

import com.javadatasource.sort.Student;

/**
 * @program: datasource
 * @description: 测试简单排序
 * @author: Chen2059
 * @create: 2021-05-25
 **/
public class TestCompareSort {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("test");
        student.setAge(18);

        Student student2 = new Student();
        student2.setName("test2");
        student2.setAge(12);


        System.out.println(getMax(student, student2));
        System.out.println("你好");

    }

    public static Comparable getMax(Comparable c1, Comparable c2){
        int result = c1.compareTo(c2);
        if(result >=0){
            return c1;
        } else {
            return c2;
        }
    }
}
