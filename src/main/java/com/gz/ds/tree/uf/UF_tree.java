package com.gz.ds.tree.uf;

import java.util.Arrays;

public class UF_tree {
    public int[] elements;//[i]值不再是节点所在的分组，而是父节点
    public int count;

    public UF_tree(int N) {
        this.elements = new int[N];
        for (int i = 0; i < N; i++) {
            elements[i] = i;
        }
        count = N;

    }

    public int count() {
        return count;
    }

    public boolean connected(int A, int B) {
        return find(A) == find(B);
    }

    public void union(int A, int B) {
        if (!connected(A, B)) {
            elements[A] = elements[B];
            count--;
        }
    }

    public int find(int x) {
        int temp = elements[x];
        if (temp == x) {
            return temp;
        } else {
            find(temp);
        }
        return -1;
    }

    @Override
    public String toString() {
        return "UF_tree{" +
                "elements=" + Arrays.toString(elements) +
                ", count=" + count +
                '}';
    }
}

