package com.gz.design.memento;

public class Gamer {
    private String name;
    private int vi;
    private int def;

    public Gamer(String name) {
        this.name = name;
    }

    public Memento save() {
        return new Memento(vi, def);
    }

    public void restore(Memento memento) {
        this.vi = memento.getVi();
        this.def = memento.getDef();
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

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Gamer{" +
                "name='" + name + '\'' +
                ", vi=" + vi +
                ", def=" + def +
                '}';
    }
}
