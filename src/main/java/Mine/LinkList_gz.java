package Mine;


import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

public class LinkList_gz<T> implements Iterable {
    //头结点
    private Node head;
    //长度
    private int N;

    public LinkList_gz() {
        this.head = new Node(null, null);
        this.N = 0;
    }

    public void clear() {
        head.nextNode = null;
    }

    public boolean isEmpty() {
        return N > 0 ? false : true;
    }

    public int length() {
        return N > 0 ? N : 0;
    }

    public T get(int index) {
        Node node = head;
        for (int i = 0; i <= index; i++) {
            if (node.nextNode != null) {
                node = node.nextNode;
            } else {
                return null;
            }
        }
        return (T) node;
    }

    public void insert(T t) {
        if (t == null) {
            throw new NullPointerException();
        }
        Node node = head;
        while (node.nextNode != null) {
            node = node.nextNode;
        }
        node.nextNode = new Node(t, null);
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
        //找到index位置前的节点
        Node nodePreIndex = (Node) get(index - 1);
        //找到index位置节点
        Node nodeIndex = nodePreIndex.nextNode;

        Node node = new Node(t, null);
        if (nodePreIndex != null) {
            nodePreIndex.nextNode = node;
        }
        if (nodeIndex != null) {
            node.nextNode = nodeIndex;
        }
        N++;
    }

    public T remove(int index) {
        if (index < 0) {
            index = 0;
        } else if (index >= N) {
            index = N - 1;
        }

        Node nodePre = (Node) get(index - 1);
        Node node = nodePre.nextNode;
        Node nodenext = node.nextNode;
        nodePre.nextNode = nodenext;
        N--;
        return (T) node;


    }

    public int indexOf(T t) {
        Node node = head;
        for (int i = 0; i < N; i++) {
            node = node.nextNode;
            if (t.equals(node.item)) {
                return i;
            }
        }
        return -1;
    }


    @Override
    public String toString() {
        String str = "";
        Node node = head;
        while (node.nextNode != null) {
            if (node.nextNode != null) {
                node = node.nextNode;
                str += node.item + " ";
            }
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
        private Node n;

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
        }//单向 双向
    }
}

