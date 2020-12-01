package com.gz.mine.graph;

import com.gz.mine.list.Node;
import com.gz.mine.list.queue.Queue;

public class BreadthFirstSearch {
    private boolean[] marked;
    private int count;
    private final Queue<Integer> wanSearch = new Queue<>();

    public BreadthFirstSearch(Graph graph, int s) {
        this.marked = new boolean[graph.V()];
        for (int i = 0; i < marked.length; i++) {
            this.marked[i] = false;
        }
        this.count = 0;
        bfs(graph, s);
    }

    public void bfs(Graph graph, int v) {
        marked[v] = true;
        wanSearch.in(new Node<>(v));
        while (!wanSearch.isEmpty()) {
            for (Object o : graph.adj(wanSearch.out().item)) {
                int m = ((Node<Integer>) o).item;
                if (!marked[m]) {
                    bfs(graph, m);
                }
            }
        }
        count++;
    }

    public boolean marked(int w) {
        return marked[w];
    }

    public int count() {
        return count;
    }
}
