package com.gz.ds.graph;

import com.gz.ds.list.Node;
import com.gz.ds.list.queue.Queue;

public class Digraph {
    private int V;
    private int E;
    private Queue<Integer>[] adj;

    public Digraph(int v) {
        this.V = v;
        this.E = 0;
        adj = new Queue[v];
        for (int i = 0; i < v; i++) {
            Queue<Integer> queue = new Queue<>();
            adj[i] = queue;
        }
    }

    public int V() {
        return V;
    }

    public int E() {
        return E;
    }

    public void addEdge(int v, int w) {
        adj[v].in(new Node<>(w));
        E++;
    }

    public Queue<Integer> adj(int v) {
        return adj[v];
    }

    private Digraph reverse() {
        Digraph d = new Digraph(V);
        for (int i = 0; i < d.adj.length; i++) {
            for (Integer o : d.adj(i)) {
                d.addEdge(o,i);
            }
        }
        return d;
    }
}
