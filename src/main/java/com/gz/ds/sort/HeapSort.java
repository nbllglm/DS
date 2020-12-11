package com.gz.ds.sort;

import java.util.Arrays;

public class HeapSort<T extends Comparable<T>> {
//    public static void main(String[] args) {
//        String[] arr = {"S", "O", "R", "T", "E", "X", "A", "M", "P", "L", "E"};
//        sort(arr);
//    }

    public static void sort(Comparable[] source) {
        Comparable[] heap = new Comparable[source.length + 1];
        createHeap(source, heap);
        int range = heap.length - 1;
        while (range != 1) {
            exch(heap, 1, range--);
            sink(heap, 1, range);
        }
        System.out.println(Arrays.toString(heap));
    }

    private static void createHeap(Comparable[] source, Comparable[] heap) {
        System.arraycopy(source, 0, heap, 1, source.length);
        int range = heap.length - 1;
        for (int i = (range / 2); i > 0; i--) {
            sink(heap, i, range);
        }

    }

    private static void exch(Comparable[] heap, int i, int j) {
        Comparable temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    private static void sink(Comparable[] heap, int k, int range) {
        if ((2 * k) <= range) {
            int max = 0;
            if ((2 * k + 1) <= range) {
                if (heap[2 * k].compareTo(heap[2 * k + 1]) >= 0) {
                    max = 2 * k;
                } else {
                    max = 2 * k + 1;
                }
            } else {
                max = 2 * k;
            }
            if (heap[k].compareTo(heap[max]) < 0) {
                exch(heap, k, max);
                sink(heap, max, range);
            }
        }

    }


}
