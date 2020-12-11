package com.gz.ds.question;

import com.gz.ds.list.arraylist.SequenceList;

import java.util.ArrayList;
import java.util.List;

public class Josephus_gz {
    protected SequenceList data;
    protected List<String> printList = new ArrayList<>();
    protected int step;

    public Josephus_gz(SequenceList data, int step) {
        this.data = data;
        this.step = step;
    }

    public void doLogic2(int index) {
        if (data.length() == 1) {
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
            int index2 = (index + step - 1) % data.length();
            printList.add((String) data.get(index2));
            data.remove(index2);
            doLogic2(index2);
        }
    }
}
