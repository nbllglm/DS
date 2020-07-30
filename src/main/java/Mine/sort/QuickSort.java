package Mine.sort;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {
    public static void sort(int[] data) {
        int start = 0;
        int end = data.length - 1;
        sort(data, start, end);
    }

    public static void sort(int[] data, int start, int end) {
        if (end <= start) {
            return;
        }
        //进行分组
        int split = partition(data, start, end);
        //左边有序
        sort(data, start, split - 1);
        //右边有序
        sort(data, split + 1, end);
    }

    public static int partition(int[] data, int start, int end) {
        int split = data[start];
        ArrayList<Integer> leftData = new ArrayList<>();
        ArrayList<Integer> rightData = new ArrayList<>();
        for (int i = start + 1; i <= end; i++) {
            if (data[i] <= split) {
                leftData.add(data[i]);

            } else {
                rightData.add(data[i]);
            }
        }
        int startindex = start;
        for (int j = 0; j < leftData.size(); j++) {
            data[startindex] = leftData.get(j);
            startindex += 1;
        }
        data[startindex] = split;
        int splitindex = startindex;
        startindex += 1;
        for (int k = 0; k < rightData.size(); k++) {
            data[startindex] = rightData.get(k);
            startindex += 1;
        }
        return splitindex;
    }

}
