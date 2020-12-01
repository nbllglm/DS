package com.gz.mine.tree.uf;

import java.util.Arrays;

public class UF {
    public int[] eleAndGroup;//记录节点元素和该元素所在分组的标识
    public int count;//分组个数


    public static void main(String[] args) {
        UF uu=new UF(6);
        uu.union(1,3);
        System.out.println(uu.toString());
    }

    public UF(int N) {
        this.eleAndGroup = new int[N];
        for (int i = 0; i < N; i++) {
            eleAndGroup[i] = i;
        }
        count = N;
    }

    //获取分组个数
    public int count() {
        return count;
    }

    //判断两个元素是否在同一个分组
    public boolean connected(int p, int q) {
        return find(p) == find(q);

    }

    //返回分组标识符
    public int find(int p) {
        return eleAndGroup[p];
    }

    //把两个元素所在分组合并
    public void union(int p, int q) {
        if (!connected(p, q)) {
            int pp = eleAndGroup[p];
            int qq = eleAndGroup[q];
            for (int i = 0; i < eleAndGroup.length; i++) {
                if (eleAndGroup[i] == pp) {
                    eleAndGroup[i] = qq;
                }
            }
            count--;
        }
    }

    @Override
    public String toString() {
        return "UF{" +
                "eleAndGroup=" + Arrays.toString(eleAndGroup) +
                ", count=" + count +
                '}';
    }
}
