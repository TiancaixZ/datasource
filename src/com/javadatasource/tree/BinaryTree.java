package com.javadatasource.tree;


/**
 * @program: datasource
 * @description: BinaryTree
 * @author: Chen2059
 * @create: 2021-06-12
 **/
public class BinaryTree<Key extends Comparable<Key>, Value> {
    private Node root;
    private int N;

    public BinaryTree() {
    }

    //Node 二叉查找树类
    private class Node {
        public Key key;
        private Value value;
        public Node left;
        public Node right;

        public Node(Key key, Value value, Node left, Node right) {
            this.key = key;
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }

    //向树中插入一个键值对
    public void put(Key key, Value value){
        N++;
        root = put(root ,key, value);
    }

    //给指定树x上，添加键一个键值对，并返回添 加后的新树
    private Node put(Node x, Key key, Value val){
        if(x == null){
            N++;
            return new Node(key, val,null, null);
        }
        int cmp = key.compareTo(x.key);
        if(cmp > 0){
            x.left = put(x.right,key, val);
        } else if(cmp < 0){
            x.right = put(x.left, key, val);
        } else {
            x.value = val;
        }

        return x;
    }

    //根据key，从树中找出对应的值
    public Value get(Key key){
        return get(root,key);
    }

    //从指定的树x中，找出key对应的值
    private Value get(Node x, Key key){
        if (x == null) {
            return null;
        }

        if(key.compareTo(x.key) > 0){
            return get(x.right,key);
        } else if(key.compareTo(x.key) < 0){
            return get(x.left, key);
        } else {
            return (Value) x.key;
        }
    }

    //根据key，删除树中对应的键值对
    public void delete(Key key){
        root = delete(root, key);
    }

    //删除指定树x上的键为key的键值对，并返回删除后的 新树
    private Node delete(Node x, Key key){
        if(x == null){
            return null;
        }
        if(key.compareTo(x.key) > 0){
            x.right = delete(x.right, key);
        } else if(key.compareTo(x.key) < 0){
            x.left = delete(x.left, key);
        } else {
            if(x.right == null){
                return x.left;
            }
            if(x.left == null){
                return x.right;
            }

            Node miniNode = x.right;
            while(miniNode.left != null){
                miniNode = miniNode.left;
            }

            Node n = x.right;
            while(n.left != null){
                if(n.left.left == null){
                    n.left = null;
                } else {
                    n = n.left;
                }
            }

            miniNode.left = x.left;
            miniNode.right = x.right;
            x = miniNode;

            N--;
        }


        return x;
    }

    //找出树中的最小的键
    public Key min(){
        return min(root).key;
    }

    //找出指定树x中，最小键所在的结点
    private Node min(Node x){
        if(x.left != null){
            return min(x.left);
        } else{
            return x;
        }
    }

    //找出树中的最大的键
    public Key max(){
        return max(root).key;
    }
    //找出指定树x中，最大键所在的结点
    private Node max(Node x){
        if(x.right != null){
            return max(x.right);
        } else{
            return x;
        }
    }

    //获取树中元素的个数
    public int size(){
        return N;
    }

}
