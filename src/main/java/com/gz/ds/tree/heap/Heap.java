package com.gz.ds.tree.heap;

import java.util.Arrays;

public class Heap<K extends Comparable<K>> {
    public K[] items;
    public int N;


    public Heap(int size) {
        items = (K[]) new Comparable[size + 1];
        N = 0;
    }

    public static void main(String[] args) {
        Heap<String> heap = new Heap(10);
        heap.insert("A");
        heap.insert("B");
        heap.insert("C");
        heap.insert("D");
        heap.insert("E");
        heap.insert("F");
        heap.insert("G");
        heap.toString();
        String str = null;
        while ((str = heap.delMax()) != null) {
            System.out.print(str + " ");
        }

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

    //删除堆中最大的元素并返回
    public K delMax() {
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
            if (items[k].compareTo(items[k / 2]) >= 0) {
                exch(k, k / 2);
                swim(k / 2);
            }
        }
    }

    //使用下沉算法
    public void sink(int k) {
        if ((2 * k) <= N) {
            int max = 0;
            if ((2 * k + 1) <= N) {
                if (items[2 * k].compareTo(items[2 * k + 1]) >= 0) {
                    max = 2 * k;
                } else {
                    max = 2 * k + 1;
                }
            } else {
                max = 2 * k;
            }
            if (items[k].compareTo(items[max]) < 0) {
                exch(k, max);
                sink(max);
            }
        }
    }

    @Override
    public String toString() {
        String str = "Heap{" +
                "items=" + Arrays.toString(items) +
                ", N=" + N +
                '}';
        System.out.println(str);
        return str;
    }



}
