package Mine;

import Example.SeqList;

import java.util.ArrayList;
import java.util.List;

public class Josephus_gz {
    protected SeqList data;
    protected List<String> printList = new ArrayList<>();
    protected String start;
    protected int step;

    private int index2;


    public Josephus_gz(SeqList data, String start, int step) {
        this.data = data;
        this.start = start;
        this.step = step;
    }

    public void doLogic1() {
        printList.clear();
        if (data == null && data.size() < 1) {
            throw new NullPointerException();
        }
        int index = data.search(start);
        int count = 1;
        while (!data.isEmpty()) {
            if (count % step == 0) {
                printList.add((String) data.get(index));
                data.remove(index);
                count = 1;
                index -= 1;
            } else {
                count += 1;
            }
            if (index == data.size() - 1) {
                index = 0;
            } else {
                index += 1;
            }
        }
        String str2 = "(";
        for (int i = 0; i < printList.size(); i++) {
            str2 += printList.get(i).toString();
            if (i != printList.size() - 1) {
                str2 += ",";
            }
        }
        str2 += ")";
        System.out.println(str2);
    }

    public void doLogic2(int index) {
        if (data.size() == 1) {
            printList.add((String) data.get(0));
            String str2 = "(";
            for (int i = 0; i < printList.size(); i++) {
                str2 += printList.get(i).toString();
                if (i != printList.size() - 1) {
                    str2 += ",";
                }
            }
            str2 += ")";
            System.out.println(str2);
        } else {
            int index2 = (index + step - 1) % data .size();
            printList.add((String) data.get(index2));
            data.remove(index2);
            doLogic2(index2);
        }
    }
}
