package Mine.sort;

import java.util.ArrayList;
import java.util.List;

public class InsertSort {
    public static void sort(int[] origin) {
        List<Integer> data = new ArrayList<>();
        data.add(origin[0]);
        for (int i = 1; i < origin.length; i++) {
            int A = origin[i];
            int oldSize = data.size();
            for (int j = 0; j < data.size(); j++) {
                if (A <= data.get(j)) {
                    data.add(j, A);
                    break;
                }
            }
            int newSize = data.size();
            if (oldSize == newSize) {
                data.add(A);
            }
        }
        String str = "";
        for (int i = 0; i < data.size(); i++) {
            str = str + data.get(i) + " ";
        }
        System.out.println(str);
    }
}
