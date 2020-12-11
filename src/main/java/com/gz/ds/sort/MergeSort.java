package com.gz.ds.sort;

public class MergeSort {
    private static int[] assist;

    //
    public static void sort(int[] a) {
        //��ʼ����������
        assist = new int[a.length];
        //����һ��lo��������hi������
        int lo = 0;
        int hi = a.length - 1;
        //�������ط�����������a�У�������lo���������hi��������
        sort(a, lo, hi);
    }

    //����������lo����������hi��������
    public static void sort(int[] a, int lo, int hi) {
        //����ȫ��У��
        if (hi <= lo) {
            return;
        }
        //�����ݽ��з���
        int mid = lo + (hi - lo) / 2;
        //�ֱ��ÿ�������������
        sort(a, lo, mid);
        sort(a, mid + 1, hi);
        //�ٰ����������е����ݽ��й鲢
        merge(a, lo, mid, hi);
    }

    //�ϲ�
    public static void merge(int[] a, int lo, int mid, int hi) {
        int indexPoint = lo;
        int leftPoint = lo;
        int rightpoint = mid + 1;
        for (int i = indexPoint; i <= hi; i++) {
            try {
                if (leftPoint >= mid + 1) {
                    assist[indexPoint++] = a[rightpoint++];
                } else if (rightpoint >= hi + 1) {
                    assist[indexPoint++] = a[leftPoint++];
                } else {
                    if (a[leftPoint] <= a[rightpoint]) {
                        assist[indexPoint++] = a[leftPoint++];
                    } else {
                        assist[indexPoint++] = a[rightpoint++];
                    }
                }
            } catch (Exception e) {
                new ArrayIndexOutOfBoundsException("Խ��");
            }
        }

        for (int index = lo; index <= hi; index++) {
            a[index] = assist[index];
        }
    }

}
