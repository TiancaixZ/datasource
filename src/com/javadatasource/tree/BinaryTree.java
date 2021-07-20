package com.javadatasource.tree;


import com.javadatasource.linear.Queue;

/**
 * @program: datasource
 * @description:
 * @author: Chen2059
 * @create: 2021-07-01
 **/
public class BinaryTree<Key extends Comparable<Key>, Value> {
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

        //构造方法
        public Node(Key key, Value value, Node left, Node right) {
            this.left = left;
            this.right = right;
            this.key = key;
            this.value = value;
        }
    }

    //记录根结点
    private Node root;
    //记录树中元素的个数
    private int N;

    //初始化
    public BinaryTree() {
        this.N = 0;
        this.root = null;
    }

    //获取树中元素的个数
    public int size() {
        return N;
    }

    //向树中插入一个键值对
    public void put(Key key,Value value){
       root = put(root, key, value);
    }

    //给指定树x上，添加键一个键值对，并返回添加后的新树
    private Node put(Node x, Key key, Value value){
        if(x == null){
            N++;
            return new Node(key, value,null, null);
        }
        int cmp = key.compareTo(x.key);
        if(cmp > 0){
            x.right = put(x.right, key, value);
        } else if(cmp < 0){
            x.left = put(x.left,key, value);
        } else {
            x.value = value;
        }

        return x;
    }

    //根据key，从树中找出对应的值
    public Value get(Key key){
       return get(root,key);
    }

    //从指定的树x中，找出key对应的值
    private Value get(Node x, Key key){
        if(x == null){
            return null;
        }
        if(key.compareTo(x.key) < 0){
            return get(x.left, key);
        }
        if(key.compareTo(x.key) > 0){
            return get(x.right ,key);
        }
        if(key.compareTo(x.key) == 0){
            return x.value;
        }

        return null;
    }

    //根据key，删除树中对应的键值对
    public void delete(Key key){
        root = delete(root,key);
    }

    //删除指定树x上的键为key的键值对，并返回删除后的新树
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

    //找出树中最小的键
    public Key min(){
        return min(root).key;
    }

    //找出指定树x中，最小键所在的结点
    private Node min(Node x){
        if (x.right != null){
            return min(x.right);
        } else {
            return x;
        }
    }

    //找出树中最大的键
    public Key max(){
        return max(root).key;
    }

    //找出指定树x中，最大键所在的结点
    public Node max(Node x){
        if(x.right != null){
            return max(x.right);
        } else {
            return x;
        }
    }

    //使用前序遍历，获取整个树中的所有键
    public Queue<Key> preErgodic(){
        Queue<Key> queue = new Queue<>();
        preErgodic(root, queue);
        return queue;
    }

    //使用前序遍历，把指定树x中的所有键放入到keys队列中
    private void preErgodic(Node x,Queue<Key> keys){
        if(x != null){
            return;
        }
        keys.enqueue(x.key);
        if(x.left != null){
            preErgodic(x.left, keys);
        }
        if(x.right != null){
            preErgodic(x.right, keys);
        }


    }

    //使用中序遍历，获取整个树中的所有键
    public Queue<Key> midErgodic(){
        Queue<Key> keys = new Queue<>();
        midErgodic(root,keys);
        return keys;
    }

    //使用中序遍历，把指定树x中的所有键放入到keys队列中
    private void midErgodic(Node x,Queue<Key> keys){
        if(x == null){
            return;
        }
        if(x.left != null){
            midErgodic(x.left, keys);
        }
        keys.enqueue(x.key);
        if(x.right != null){
            midErgodic(x.right, keys);
        }
    }

    //使用后序遍历，获取整个树中的所有键
    public Queue<Key> afterErgodic(){
        Queue<Key> keys = new Queue<>();
        afterErgodic(root, keys);
        return keys;
    }

    //使用后序遍历，把指定树x中的所有键放入到keys队列中
    private void afterErgodic(Node x,Queue<Key> keys){
        if(x == null){
            return;
        }
        if(x.left != null){
            afterErgodic(x.left, keys);
        }
        if(x.right != null){
            afterErgodic(x.right, keys);
        }
        keys.enqueue(x.key);

    }

    //使用层序遍历，获取整个树中的所有键
    public Queue<Key> layerErgodic(){
        Queue<Key> keys = new Queue<>();
        Queue<Node> nodes = new Queue<>();

        nodes.enqueue(root);

        while(!nodes.isEmpty()){
            Node x = nodes.dequeue();
            keys.enqueue(x.key);
            if(x.left != null){
                nodes.enqueue(x.left);
            }
            if(x.right != null){
                nodes.enqueue(x.right);
            }
        }
        return keys;
    }

    //计算整个树的最大深度
    public int maxDepth(){
        return maxDepth(root);
    }

    // 计算指定树x的最大深度
    private int maxDepth(Node x){
        if(x == null){
            return 0;
        }

        int max = 0;
        int maxL = 0;
        int maxR = 0;
        if(x.left != null){
            maxL = maxDepth(x.right);
        }
        if(x.right != null){
            maxR = maxDepth(x.left);
        }
        return maxL > maxR ? maxL+1 : maxR+1;
    }
}
