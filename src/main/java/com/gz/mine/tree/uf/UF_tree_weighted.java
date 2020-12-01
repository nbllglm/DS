package com.gz.mine.tree.uf;

import java.util.Arrays;

public class UF_tree_weighted {
    public int[] elements;//[i]值是父节点
    public int count;
    public int[] size;


    public UF_tree_weighted(int sz) {
        elements = new int[sz];
        size = new int[sz];
        this.count = sz;
        for (int i = 0; i < sz; i++) {
            elements[i] = i;
            size[i] = 1;
        }
    }

    public int count() {
        return count;
    }

    public boolean connected(int A, int B) {
        return find(A) == find(B);
    }

    public void union(int A, int B) {
        if (!connected(A, B)) {
            if (size[A] >= size[B]) {
                elements[B] = elements[A];
                size[A]+=size[B];
            } else {
                elements[A] = elements[B];
                size[B]+=size[A];
            }
            count--;
        }
    }

    public int find(int x) {
        int temp = elements[x];
        if (temp == x) {
            return temp;
        } else {
            size[x]++;
            find(temp);
        }
        return -1;
    }

    @Override
    public String toString() {
        return "UF_tree_weighted{" +
                "elements=" + Arrays.toString(elements) +
                ", count=" + count +
                ", size=" + Arrays.toString(size) +
                '}';
    }
}
