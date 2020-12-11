package com.gz.ds.graph;

import com.gz.ds.list.Node;
import com.gz.ds.list.queue.Queue;

public class Graph {
    public int V;//顶点数量
    public int E;//边的数量
    private Queue<Integer>[] adj;//邻接表

    public static void main(String[] args) {
        Graph graph = new Graph(3);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 0);
        graph.addEdge(2, 0);
        graph.addEdge(1, 2);
        graph.addEdge(2, 1);
        System.out.println(graph.E());
    }

    public Graph(int v) {
        this.V = v;
        this.E = 0;
        adj = new Queue[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new Queue<>();
        }
    }

    public int V() {
        return V;
    }

    public int E() {
        //去重
//        ArrayList<Integer> bian = new ArrayList<>();
//        for (int i = 0; i < adj.length; i++) {
//            Queue_gz<Integer> gz = adj[i];
//            int size = gz.N;
//            for (int j = 0; j < size; j++) {
//                int a = gz.out().item + i;
//                if (!bian.contains(a)) {
//                    bian.add(a);
//                }
//            }
//        }
//        return bian.size();
        return E;
    }

    public void addEdge(int v, int e) {
        adj[v].in(new Node<Integer>(v));
        adj[e].in(new Node<Integer>(e));
        E++;
    }

    public Queue<Integer> adj(int V) {
        return adj[V];
    }


}
