package DataStructures.Graphs;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph_BFS {
    private int v;
    private LinkedList[] adj;

    public Graph_BFS(int v) {
        this.v = v;
        this.adj = new LinkedList[v];
        for(int i=0;i<v;i++){
            adj[i] = new LinkedList<>();
        }
    }
    void addEdge(int v,int w){
        adj[v].add(w);
    }
    // BFS
    public void bfs(int s){
        boolean [] vis = new boolean[v];
        LinkedList<Integer> queue = new LinkedList<>();
        vis[s] = true;
        queue.add(s);

        while (queue.size()!=0){
            s = queue.poll();
            System.out.print(s + "-> ");
            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()){
                int n = i.next();
                if(!vis[n]){
                    vis[n] = true;
                    queue.add(n);
                }
            }

        }

    }

    public static void main(String[] args) {
        Graph_BFS g = new Graph_BFS(4);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,2);
        g.addEdge(2,0);
        g.addEdge(2,3);
        g.addEdge(3,3);
        g.bfs(2);
    }

}
