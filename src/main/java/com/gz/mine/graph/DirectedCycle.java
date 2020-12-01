package com.gz.mine.graph;

public class DirectedCycle implements A{
    private boolean[] marked;
    private boolean hasCycle;
    private boolean[] onStack;

    public static void main(String[] args) {
        DirectedCycle directedCycle=new DirectedCycle();
        directedCycle.a(directedCycle);
    }

    @Override
    public void a(A aa) {
        System.out.println("asd");
    }
}

interface A {
    void a(A aa);
}
