package Mine.sort;

public class BubbleSort {
    public static void sort(int[] data) {
        if (data == null) {
            throw new NullPointerException();
        }
        int temp;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length - 1; j++) {
                if (data[j] >= data[j + 1]) {
                    temp = data[j + 1];
                    data[j + 1] = data[j];
                    data[j] = temp;
                }
            }
        }
        String str = "";
        for (int i = 0; i < data.length; i++) {
            str = str + data[i] + " ";
        }
        System.out.println(str);
    }
}
