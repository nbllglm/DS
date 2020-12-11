package com.gz.ds.graph;

import com.gz.ds.list.Node;
import com.gz.ds.list.stack.Stack;

public class DepthFirstPaths {

    private boolean[] marked;
    private int s;
    private int[] edgeTo;

    public DepthFirstPaths(Graph graph, int s) {
        this.s = s;
        this.marked = new boolean[graph.V()];
        this.edgeTo = new int[graph.V()];
        dfs(graph, s);
    }

    public void dfs(Graph graph, int v) {
        marked[v] = true;
        for (Object o : graph.adj(v)) {
            int m = ((Node<Integer>) o).item;
            if (!marked[m]) {
                edgeTo[m] = v;
                dfs(graph, m);
            }
        }
    }

    public boolean hasPathTo(int V) {
        return marked[V];
    }

    public Stack<Integer> pathTo(int V) {
        if(!hasPathTo(V)){
            return null;
        }
        Stack<Integer> stack = new Stack<>();
        for (int a=V;a!=s;a=edgeTo[a]){
            stack.push(new Node(a));
        }
        stack.push(new Node(s));
        return stack;
    }

}
