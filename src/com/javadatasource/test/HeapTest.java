package com.javadatasource.test;

import com.javadatasource.heap.Heap;

/**
 * @program: datasource
 * @description: Heap Test
 * @author: Chen2059
 * @create: 2021-07-02
 **/
public class HeapTest {
//    public static void main(String[] args) {
////        Heap<String> heap = new Heap<>(10);
////        heap.insert("S");
////        heap.insert("G");
////        heap.insert("I");
////        heap.insert("E");
////        heap.insert("N");
//////        heap.insert("H");
//////        heap.insert("O");
//////        heap.insert("A");
//////        heap.insert("T");
//////        heap.insert("P");
//////        heap.insert("R");
////
////        String del;
////        while ((del = heap.delMax()) != null){
////            System.out.println(del + ",");
////        }
//
//    }
public static void main(String[] args) throws ClassNotFoundException {
    Heap<String> heap = new Heap<String>(20);
    heap.insert("A");
    heap.insert("B");
    heap.insert("C");
    heap.insert("D");
    heap.insert("E");
    heap.insert("F");
    heap.insert("G");

    String del;
    while((del=heap.delMax())!=null){
        System.out.print(del+",");
    }

}
}
