package com.javadatasource.test;

/**
 * @program: datasource
 * @description: CircleListCheck Test
 * @author: Chen2059
 * @create: 2021-06-25
 **/
public class CircleListCheckTest {
    public static void main(String[] args) throws Exception {
        Node<String> first = new Node<String>("aa", null);
        Node<String> second = new Node<String>("bb", null);
        Node<String> third = new Node<String>("cc", null);
        Node<String> fourth = new Node<String>("dd", null);
        Node<String> fifth = new Node<String>("ee", null);
        Node<String> six = new Node<String>("ff", null);
        Node<String> seven = new Node<String>("gg", null);

        //完成结点之间的指向
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = six;
        six.next = seven;
        //产生环
        seven.next = third;

        //查找环的入口结点
        boolean circle = isCircle(first);
        System.out.println("first链表中是否有环" + circle);
    }

    /**
     * 判断链表中是否有环
     * @param first
     * @return
     */
    private static boolean isCircle(Node<String> first) {
        Node<String> slow = first;
        Node<String> fast = first;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast.equals(slow)){
                return true;
            }
        }

        return false;
    }


    //结点类
    private static class Node<T> {
        //存储数据
        T item;
        //下一个结点
        Node next;

        public Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }
    }
}
