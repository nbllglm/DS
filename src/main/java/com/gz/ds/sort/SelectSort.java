package com.gz.ds.sort;

public class SelectSort {
    public static void sort(int[] data) {
        int index = 0;
        for (int i = 0; i < data.length-1; i++) {
            int min = data[i];
            for (int j = i; j < data.length; j++) {
                if (data[j] <= min) {
                    min = data[j];
                    index=j;
                }
            }
            int temp=data[i];
            data[i]=data[index];
            data[index]=temp;
        }
        String str = "";
        for (int k = 0; k < data.length; k++) {
            str = str + data[k] + " ";
        }
        System.out.println(str);
    }
}
