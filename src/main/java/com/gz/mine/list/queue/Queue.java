package com.gz.mine.list.queue;

import com.gz.mine.list.Node;
import org.jetbrains.annotations.NotNull;

import java.util.Iterator;
import java.util.function.Consumer;

public class Queue<T> implements Iterable<T> {
    private final Node<T> first = new Node(null, null);
    private final Node<T> last = new Node(null, null);
    public int N;

    public static void main(String[] args) {
        Queue<Integer> queue_ = new Queue<>();
        queue_.in(new Node<Integer>(1, null));
        queue_.in(new Node<Integer>(2, null));
        queue_.in(new Node<Integer>(3, null));
        queue_.in(new Node<Integer>(4, null));
        queue_.toString();
        System.out.println(queue_.out());
        queue_.toString();
        System.out.println(queue_.out());
        queue_.toString();
        System.out.println(queue_.out());
        queue_.toString();
        System.out.println(queue_.out());
        queue_.toString();
    }

    public boolean isEmpty() {
        return N > 0;
    }

    public int size() {
        return N;
    }

    public Node<T> out() {
        Node<T> node = first;
        Node<T> out = null;
        last.nextNode = null;
        while (node.nextNode != null) {
            if (node.nextNode.nextNode == null) {
                out = new Node(node.nextNode.item, node.nextNode.nextNode);
                node.nextNode = null;
                break;
            }
            node = node.nextNode;
        }
        last.nextNode = node;
        N--;
        return out;
    }

    public void in(Node<T> n) {
        if (N == 0) {
            first.nextNode = n;
            last.nextNode = n;
        } else {
            Node<T> node = first.nextNode;
            first.nextNode = n;
            n.nextNode = node;
        }
        N++;
    }

    @Override
    public String toString() {
        String str = "( ";
        Node<T> node = first.nextNode;
        while (node != null) {
            str = str + node + "  ";
            node = node.nextNode;
        }
        str += ")  N==" + N;
        System.out.println(str);
        return str;
    }


    @NotNull
    @Override
    public Iterator<T> iterator() {
        return new QIterator();
    }

    private class QIterator implements Iterator<T> {
        private Node<T> node;

        public QIterator() {
            node = first;
        }

        @Override
        public boolean hasNext() {
            return node.nextNode != last;
        }

        @Override
        public T next() {
            node = node.nextNode;
            return node.item;
        }
    }
}
