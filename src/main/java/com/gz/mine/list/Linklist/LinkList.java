package com.gz.mine.list.Linklist;


import com.gz.mine.list.Node;
import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

public class LinkList<T> implements Iterable {
    //
    private final Node<T> head;
    //
    private int N;

    public LinkList() {
        this.head = new Node<T>(null, null);
        this.N = 0;
    }

    public void clear() {
        head.nextNode = null;
    }

    public boolean isEmpty() {
        return N <= 0;
    }

    public int length() {
        return Math.max(N, 0);
    }

    public Node<T> get(int index) {
        Node<T> node = head;
        for (int i = 0; i <= index; i++) {
            if (node.nextNode != null) {
                node = node.nextNode;
            } else {
                return null;
            }
        }
        return node;
    }

    public void insert(T t) {
        if (t == null) {
            throw new NullPointerException();
        }
        Node<T> node = head;
        while (node.nextNode != null) {
            node = node.nextNode;
        }
        node.nextNode = new Node<T>(t, null);
        N++;
    }

    public void insert(int index, T t) {
        if (t == null) {
            throw new NullPointerException();
        }
        if (index < 0) {
            index = 0;
        } else if (index >= N) {
            insert(t);
            return;
        }
        Node<T> nodePreIndex = get(index - 1);
        if (nodePreIndex != null) {
            Node<T> nodeIndex = nodePreIndex.nextNode;
            Node<T> node = new Node<T>(t, null);
            nodePreIndex.nextNode = node;
            if (nodeIndex != null) {
                node.nextNode = nodeIndex;
            }
        }
        N++;
    }

    public Node<T> remove(int index) {
        if (index < 0) {
            index = 0;
        } else if (index >= N) {
            index = N - 1;
        }

        Node<T> nodePre = get(index - 1);
        Node<T> node = nodePre.nextNode;
        nodePre.nextNode = node.nextNode;
        N--;
        return node;
    }

    public int indexOf(T t) {
        Node<T> node = head;
        for (int i = 0; i < N; i++) {
            node = node.nextNode;
            if (t.equals(node.item)) {
                return i;
            }
        }
        return -1;
    }

    public void reverse() {
        Node<T> first = head.nextNode;
        head.nextNode = reverse(first);
    }

    public static int count=0;
    public Node<T> reverse(Node<T> curr) {
        count++;
        Node<T> result;
        if (curr.nextNode != null) {
            result = reverse(curr.nextNode);
            curr.nextNode.nextNode = curr;
            curr.nextNode = null;

        } else {
            result = curr;
        }
        return result;
    }

    public static void main(String[] args) {
        LinkList<Integer> linkList_gz = new LinkList<>();
        linkList_gz.insert(1);
        linkList_gz.insert(2);
        linkList_gz.insert(3);
        linkList_gz.insert(4);
        linkList_gz.toString();
        linkList_gz.reverse();
        linkList_gz.toString();
        System.out.println(count);
    }


    @Override
    public String toString() {
        String str = "";
        Node node = head;
        while (node.nextNode != null) {
            node = node.nextNode;
            str += node.item + " ";
        }
        System.out.println(str);
        return str;
    }

    @NotNull
    @Override
    public Iterator iterator() {
        return new gzIterator();
    }

    private class gzIterator implements Iterator {
        private Node<T> n;

        public gzIterator() {
            n = head;
        }

        @Override
        public boolean hasNext() {
            if (n.nextNode != null) {
                return true;
            } else {
                return false;
            }

        }

        @Override
        public Object next() {
            n = n.nextNode;
            return n.item;
        }//���� ˫��
    }
}

