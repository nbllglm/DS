package Mine;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;
import java.util.function.Consumer;

public class SequenceList_gz<T> implements Iterable {
    private T[] elements;
    private int N;

    public SequenceList_gz(int capacity) {
        this.elements = (T[]) new Object[capacity];
        this.N = 0;
    }

    public void clear() {
        this.N = 0;
    }

    public boolean isEmpty() {
        return N > 0 ? true : false;
    }

    public int length() {
        return N;
    }

    public T get(int index) {
        if (index > N - 1) {
            index = N - 1;
        } else if (index < 0) {
            index = 0;
        }
        return elements[index];
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
        for (int i = N; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = t;
        N++;
    }

    public void add(T t) {
        if (t == null) {
            throw new NullPointerException();
        }
        elements[N++] = t;
    }

    public T remove(int index) {
        T t = elements[index];
        for (int i = index; i < N - 1; i++) {
            elements[i] = elements[i + 1];
        }
        N--;
        return t;
    }

    public int indexOf(T t) {
        if (t == null) {
            throw new NullPointerException();
        }
        for (int i = 0; i < N; i++) {
            if (t.equals(elements[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < N; i++) {
            str += elements[i] + " ";
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
        private int cursor;

        public gzIterator() {
            this.cursor = 0;
        }

        @Override
        public boolean hasNext() {
            return cursor >= N ? false : true;
        }

        @Override
        public Object next() {
            cursor++;
            return cursor;
        }
    }
}
