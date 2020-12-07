package com.gz.design.memento;

public class Memento {
    private int vi;
    private int def;

    public Memento(int vi, int def) {
        this.vi = vi;
        this.def = def;
    }

    public int getVi() {
        return vi;
    }

    public void setVi(int vi) {
        this.vi = vi;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
