package Mine.sort;

public class MergeSort {
    private static int[] assist;

    //对数据进行排序
    public static void sort(int[] a) {
        //初始化辅助数组
        assist = new int[a.length];
        //定义一个lo变量，和hi变量，
        int lo = 0;
        int hi = a.length - 1;
        //调用重载方法方程数组a中，从索引lo和最大索引hi进行排序
        sort(a, lo, hi);
    }

    //对数组索引lo对数组索引hi进行排序
    public static void sort(int[] a, int lo, int hi) {
        //做安全性校验
        if (hi <= lo) {
            return;
        }
        //对数据进行分组
        int mid = lo + (hi - lo) / 2;
        //分别对每个数组进行排序
        sort(a, lo, mid);
        sort(a, mid + 1, hi);
        //再把两个数据中的数据进行归并
        merge(a, lo, mid, hi);
    }

    //合并
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
                new ArrayIndexOutOfBoundsException("越界");
            }
        }

        for (int index = lo; index <= hi; index++) {
            a[index] = assist[index];
        }
    }

}
