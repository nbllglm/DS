package com.gz.mine.tree.heap;

import java.util.Arrays;

public class PriorityQueue_Min<K extends Comparable> {
    public K[] items;
    public int N;

    public static void main(String[] args) {
        PriorityQueue_Min<String> priorityQueue_min = new PriorityQueue_Min(7);
        priorityQueue_min.insert("G");
        priorityQueue_min.toString();
        priorityQueue_min.insert("F");
        priorityQueue_min.toString();
        priorityQueue_min.insert("E");
        priorityQueue_min.toString();
        priorityQueue_min.insert("D");
        priorityQueue_min.toString();
        priorityQueue_min.insert("C");
        priorityQueue_min.toString();
        priorityQueue_min.insert("B");
        priorityQueue_min.toString();
        priorityQueue_min.insert("A");

        String str = null;
        while ((str = priorityQueue_min.delMin()) != null) {
            System.out.print(str + " ");
        }
    }

    public PriorityQueue_Min(int size) {
        this.items =  (K[]) new Comparable[size + 1];
        this.N = 0;
    }

    //交换两索引处值
    public void exch(int indexA, int indexB) {
        if (indexA > N || indexB > N) {
            return;
        }
        K temp = items[indexA];
        items[indexA] = items[indexB];
        items[indexB] = temp;
    }


    //删除堆中最小的元素并返回
    public K delMin() {
        toString();
        exch(1, N);
        K key = items[N--];
        sink(1);
        return key;
    }


    //往堆中插入一个元素
    public void insert(K k) {
        items[++N] = k;
        swim(N);
    }

    //使用上浮算法
    public void swim(int k) {
        if (k > 1) {
            if (items[k].compareTo(items[k / 2]) < 0) {
                exch(k, (k / 2));
                swim((k / 2));
            }
        }
    }

    //使用下沉算法
    public void sink(int k) {
        if (2 * k <= N) {
            int min = 0;
            if (2 * k + 1 <= N) {
                if (items[2 * k].compareTo(items[2 * k + 1]) < 0) {
                    min = 2 * k;
                } else {
                    min = 2 * k + 1;
                }
            } else {
                min = 2 * k;
            }
            if (items[k].compareTo(items[min]) >= 0) {
                exch(k, min);
                sink(min);
            }
        }
    }

    @Override
    public String toString() {
        String str="PriorityQueue_Min{" +
                "items=" + Arrays.toString(items) +
                ", N=" + N +
                '}';
        System.out.println(str);
        return str;
    }
}
