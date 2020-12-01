package com.gz.mine.list.Linklist;

import com.gz.mine.list.Node;
import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

public class LinkListTwoWay<T> implements Iterable {
    private final Node<T> head;
    private Node<T> last;
    private int N;

    public LinkListTwoWay() {
        this.head = new Node<T>(null, null, null);
        this.last = new Node<T>(null, null, null);
        this.N = 0;
    }

    public void clear() {
        this.head.nextNode = null;
        this.last.preNode = null;
        this.N = 0;
    }

    public boolean isEmpty() {
        return N <= 0;
    }

    public int length() {
        return N;
    }

    public Node<T> getFirst() {
        if (isEmpty()) {
            return null;
        }
        return head.nextNode;
    }

    public Node<T> getLast() {
        if (isEmpty()) {
            return null;
        }
        return last;
    }


    public void add(T t) {
        if (t == null) {
            throw new NullPointerException();
        }
        if (N == 0) {
            Node<T> node = new Node<T>(t, head, null);
            last = node;
            head.nextNode = last;
            N++;
        } else {
            Node<T> node = new Node<T>(t, last, null);
            last.nextNode = node;
            last = node;
            N++;
        }
        toString();
    }

    public void insert(int index, T t) {
        if (t == null) {
            throw new NullPointerException();
        }
        if (index < 0) {
            index = 0;


        } else if (index > N - 1) {
            add(t);
            return;
        }
        Node<T> preNode = head;
        Node<T> nextNode = null;
        Node<T> indexNode = new Node<T>(t, null, null);
        for (int i = 0; i < index; i++) {
            preNode = preNode.nextNode;
        }
        nextNode = preNode.nextNode;
        if (nextNode != null) {
            preNode.nextNode = indexNode;
            nextNode.preNode = indexNode;
            indexNode.preNode = preNode;
            indexNode.nextNode = nextNode;
            N++;
        }
        toString();
    }

    public Node<T> get(int index) {
        if (index < 0) {
            index = 0;
        } else if (index > N - 1) {
            index = N - 1;
        }
        Node<T> node = head.nextNode;
        for (int i = 0; i < index; i++) {
            node = node.nextNode;
        }
        return node;
    }

    public Node<T> remove(int index) {
        if (index < 0) {
            index = 0;
        } else if (index > N - 1) {
            index = N - 1;
        }
        Node<T> itemNode;
        Node<T> preNode = head;
        Node<T> nextNode;
        for (int i = 0; i < index; i++) {
            preNode = preNode.nextNode;
        }
        itemNode = preNode.nextNode;
        nextNode = itemNode.nextNode;
        preNode.nextNode = nextNode;
        nextNode.preNode = preNode;
        N--;
        toString();
        return itemNode;
    }

    public int indexOf(T t) {
        if (t == null) {
            throw new NullPointerException();
        }
        Node<T> node = head.nextNode;
        for (int i = 0; i < N; i++) {
            if (t.equals(node.item)) {
                System.out.println(i);
                return i;
            }
            node = node.nextNode;
        }
        System.out.println(-1);
        return -1;
    }


    @Override
    public String toString() {
        String str = "";
        Node<T> node = head;
        for (int i = 0; i < N; i++) {
            if (node.nextNode != null) {
                node = node.nextNode;
            }
            if (node.item != null) {
                str += node.item;
            }
        }
        System.out.println(str);
        return str;
    }

    @NotNull
    @Override
    public Iterator iterator() {
        return null;
    }

    private class gzIterator implements Iterator {
        private Node<T> n;

        public gzIterator() {
            this.n = head;
        }

        @Override
        public boolean hasNext() {
            return n.nextNode != null;
        }

        @Override
        public Object next() {
            n = n.nextNode;
            return n;
        }
    }
}
