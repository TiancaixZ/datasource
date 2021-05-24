package com.javadatasource.sort;

/**
 * @program: datasource
 * @description: 学生类
 * @author: Chen2059
 * @create: 2021-05-25
 **/
public class Student implements Comparable<Student>{
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.age - o.getAge();
    }
}
