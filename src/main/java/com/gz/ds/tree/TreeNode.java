package com.gz.ds.tree;

public class TreeNode<K, V> {
    public K key;
    public V value;
    public TreeNode<K, V> left = null;
    public TreeNode<K, V> right = null;
    public boolean isRed;

    public TreeNode(K key, V value) {
        this.key = key;
        this.value = value;
        this.isRed = true;
    }

    @Override
    public String toString() {
        return "TwoNode{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
