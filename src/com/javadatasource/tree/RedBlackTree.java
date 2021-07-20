package com.javadatasource.tree;

/**
 * @program: datasource
 * @description:Black-Red Tree
 * @author: Chen2059
 * @create: 2021-07-20
 **/
public class RedBlackTree<Key extends Comparable<Key>, Value> {
    //记录根结点
    private Node root;
    //记录树中元素的个数
    private int N;
    //红色链接标识
    private static final boolean RED = true;
    //黑色链接标识
    private static final boolean BLACK = false;

    //内部结点类
    private class Node {
        //记录左子结点
        public Node left;
        //记录右子结点
        public Node right;
        //存储键
        public Key key;
        //存储值
        public Value value;
        //其父结点指向它的链接的颜色
        public boolean color;

        public Node(Key key, Value value, Node left, Node right, boolean color) {
            this.left = left;
            this.right = right;
            this.key = key;
            this.value = value;
            this.color = color;
        }
    }

    /**
     * 判断当前结点的父指向链接是否为红色
     * @param x
     * @return
     */
    private boolean isRed(Node x){
        if(x == null){
            return false;
        }
        return x.color == RED;
    }

    /**
     * 获取树中元素的个数
     * @return
     */
    public int size(){
        return N;
    }

    /**
     * 左旋
     * @param h
     * @return
     */
    private Node rotateLeft(Node h){
        Node x = h.right;
        h.right = x.left;
        x.left = h;
        x.color = h.color;
        h.color = RED;
        return x;
    }

    /**
     * 右旋
     * @param h
     * @return
     */
    private Node rotateRight(Node h){
        Node x = h.left;
        h.left = x.right;
        x.right = h;
        x.color = h.color;
        h.color = RED;
        return x;
    }

    /**
     * 颜色反转,相当于完成拆分4-结点
     * @param h
     */
    private void ﬂipColors(Node h){
        h.color = RED;
        h.left.color = BLACK;
        h.right.color = BLACK;
    }

    /**
     * 在整个树上完成插入操作
     * @param key
     * @param val
     */
    public void put(Key key, Value val){
        root = put(root, key, val);
        root.color= BLACK;
    }

    /**
     * 在指定树中，完成插入操作,并返回添加元素后新的树
     * @param h
     * @param key
     * @param val
     * @return
     */
    private Node put(Node h, Key key, Value val){
        if(h == null){
            N++;
            return new Node(key, val, null, null, RED);
        }

        int cmp = key.compareTo(h.key);
        if(cmp < 0){
            //继续寻找左子树插入
            h.left = put(h.left,key, val);
        } else if(cmp > 0){
            //继续寻找右子树插入
            h.right = put(h.right, key, val);
        } else {
            //已经有相同的结点存在，修改节点的值；
            h.value = val;
        }

        //如果当前结点的右链接是红色，左链接是黑色，需要左旋
        if(isRed(h.right) && !isRed(h.left)){
            h = rotateLeft(h);
        }
        //如果当前结点的左子结点和左子结点的左子结点都是红色链接，则需要右旋
        if(isRed(h.left) && !isRed(h.left.left)){
            h = rotateRight(h);
        }
        //如果当前结点的左链接和右链接都是红色，需要颜色变换
        if(isRed(h.left) && isRed(h.right)){
            ﬂipColors(h);
        }

        return h;
    }

    /**
     * 根据key，从树中找出对应的值
     * @param key
     * @return
     */
    public Value get(Key key){
        return get(root, key);
    }

    /**
     * 从指定的树x中，找出key对应的值
     * @param x
     * @param key
     * @return
     */
    private Value get(Node x, Key key){
        if (x == null) {
            return null;
        }

        int cmp = key.compareTo(x.key);
        if(cmp < 0 ){
            return get(x.left,key);
        } else if(cmp > 0){
            return get(x.right,key);
        } else {
            return x.value;
        }
    }



}
