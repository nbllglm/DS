package com.gz.design.memento;

import java.util.HashMap;

public class caretaker {
    private HashMap<String, Memento> hashMap;

    public caretaker() {
        hashMap = new HashMap<>();
    }

    public void setmemento(Gamer gamer) {
        hashMap.put(gamer.getName(), gamer.save());
    }

    public Memento getmemento(Gamer gamer) {
        return hashMap.get(gamer.getName());
    }
}
