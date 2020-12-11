package com.gz.ds.graph;

import com.gz.ds.list.Node;

public class DepthFirstSearch {
    public boolean[] marked;
    public int count;

    public DepthFirstSearch(Graph graph, int s) {
        this.marked = new boolean[graph.V()];
        this.count = 0;
        dfs(graph, s);
        String str = "";
        for (int i = 0; i < marked.length; i++) {
            if (marked[i]) {
                str += i + " ";
            }
        }
        System.out.println(str);
    }

    public void dfs(Graph graph, int v) {
        marked[v] = true;
        for (Object o : graph.adj(v)) {
            int m = ((Node<Integer>) o).item;
            if (!marked[m]) {
                dfs(graph, m);
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
