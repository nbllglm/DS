package com.gz.design.oberserver;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private String AA;
    private String BB;
    private List<Observer> list = new ArrayList<>();

    public WeatherData() {
    }

    public void setData(String A, String B) {
        this.AA = A;
        this.BB = B;
        notifyObsserver();
    }

    @Override
    public void regsisterObsserver(Observer o) {
        if (!list.contains(o)) {
            list.add(o);
        }
    }

    @Override
    public void removeObsserver(Observer o) {
        if (list.contains(o)) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).equals(o)) {
                    list.remove(i);
                }
            }
        }
    }

    @Override
    public void notifyObsserver() {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).update(AA, BB);
        }
    }
}
