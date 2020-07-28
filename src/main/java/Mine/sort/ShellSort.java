package Mine.sort;

public class ShellSort {
    public static void sort(int[] data) {
        int h = getH(data);
        while (h >= 1) {
            for (int i = h; i < data.length; i++) {
                try {
                    for (int j = data.length - h; j > 0; j = j - h) {
                        if (data[j] <= data[j - h]) {
                            int temp = data[j];
                            data[j] = data[j - h];
                            data[j - h] = temp;
                        }
                    }
                } catch (Exception e) {

                }
            }
            h = h / 2;
        }
        String str = "";
        for (
                int k = 0;
                k < data.length; k++) {
            str = str + data[k] + " ";
        }
        System.out.println(str);
    }

    private static int getH(int[] data) {
        int h = 1;
        while (h < (data.length / 2)) {
            h = 2 * h + 1;
        }
        return h;
    }
}
