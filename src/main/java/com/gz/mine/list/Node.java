package com.gz.mine.list;

public class Node<T> {
    //
    public T item;
    //
    public Node<T> preNode;
    //
    public Node<T> nextNode;

    public Node(T item, Node<T> preNode, Node<T> nextNode) {
        this.item = item;
        this.preNode = preNode;
        this.nextNode = nextNode;
    }

    public Node(T item, Node<T> nextNode) {
        this.item = item;
        this.nextNode = nextNode;
    }

    public Node(T item) {
        this.item = item;
    }

    @Override
    public String toString() {
        String str = "Node{" +
                "item=" + item +
                '}';
        return str;
    }
}
