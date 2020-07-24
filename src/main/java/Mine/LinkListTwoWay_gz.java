package Mine;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;
import java.util.function.Consumer;

public class LinkListTwoWay_gz<T> implements Iterable {
    private Node<T> head;
    private Node<T> last;
    private int N;

    public LinkListTwoWay_gz() {
        this.head = new Node(null, null, null);
        this.last = new Node(null, null, null);
        this.N = 0;
    }

    public void clear() {
        this.head.nextNode = null;
        this.last.preNode = null;
        this.N = 0;
    }

    public boolean isEmpty() {
        return N > 0 ? false : true;
    }

    public int length() {
        return N;
    }

    public T getFirst() {
        if (isEmpty()) {
            return null;
        }
        return (T) head.nextNode;
    }

    public T getLast() {
        if (isEmpty()) {
            return null;
        }
        return (T) last;
    }


    public void add(T t) {
        if (t == null) {
            throw new NullPointerException();
        }
        if (N == 0) {
            Node node = new Node(t, head, null);
            last = node;
            head.nextNode = last;
            N++;
        } else {
            Node node = new Node(t, last, null);
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
        Node preNode = head;
        Node nextNode = null;
        Node indexNode = new Node(t, null, null);
        for (int i = 0; i < index; i++) {
            preNode = preNode.nextNode;
        }
        nextNode = preNode.nextNode;
        if (index == 0) {
            preNode = head;
        }
        if (preNode != null && nextNode != null) {
            preNode.nextNode = indexNode;
            nextNode.preNode = indexNode;
            indexNode.preNode = preNode;
            indexNode.nextNode = nextNode;
            N++;
        }
        toString();
    }

    public T get(int index) {
        if (index < 0) {
            index = 0;
        } else if (index > N - 1) {
            index = N - 1;
        }
        Node node = head.nextNode;
        for (int i = 0; i < index; i++) {
            node = node.nextNode;
        }
        return (T) node.item;
    }

    public T remove(int index) {
        if (index < 0) {
            index = 0;
        } else if (index > N - 1) {
            index = N - 1;
        }
        Node itemNode;
        Node preNode = head;
        Node nextNode;
        for (int i = 0; i < index; i++) {
            preNode = preNode.nextNode;
        }
        itemNode = preNode.nextNode;
        nextNode = itemNode.nextNode;
        preNode.nextNode = nextNode;
        nextNode.preNode = preNode;
        N--;
        toString();
        return (T) itemNode.item;
    }

    public int indexOf(T t) {
        if (t == null) {
            throw new NullPointerException();
        }
        Node node = head.nextNode;
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
        Node node = head;
        for (int i = 0; i < N; i++) {
            if (node.nextNode != null) {
                node = node.nextNode;
            }
            if (node.item != null) {
                str += node.item;
            }
        }
        System.out.println(str);
        System.out.println(str);
        return super.toString();
    }

    @NotNull
    @Override
    public Iterator iterator() {
        return null;
    }

    private class gzIterator implements Iterator {
        private Node n;

        public gzIterator() {
            this.n = head;
        }

        @Override
        public boolean hasNext() {
            return n.nextNode == null ? false : true;
        }

        @Override
        public Object next() {
            n = n.nextNode;
            return n;
        }
    }
}
