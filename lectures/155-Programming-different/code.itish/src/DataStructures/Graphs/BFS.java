package DataStructures.Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    static class Edge{
        int src;
        int dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }
    public static void createGraph(ArrayList<Edge> []graph){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,3));
        graph[1].add(new Edge(1,0));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));

        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5));

        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,5));

        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));
        graph[5].add(new Edge(5,6));

        graph[6].add(new Edge(6,5));

    }
    public static void bfs(ArrayList<Edge> graph[],int V, boolean []vis,int start){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        while (!queue.isEmpty()){
            int curr = queue.remove();
            if(vis[curr]== false){
                System.out.print(curr + " ");
                vis[curr] = true;
                for(int i=0;i<graph[curr].size();i++){
                    Edge e = graph[curr].get(i);
                    queue.add(e.dest);
                }
            }
        }

    }

    public static void main(String[] args) {
        /*
                 1 --- 3
              /        |  \
            0          |    5 -- 6
            \          |   /
              2 ------  4
         */
        int v = 7;
        ArrayList<Edge> []graph = new ArrayList[v];
        createGraph(graph);

        boolean[] vis = new boolean[v];
        for(int i=0;i<v;i++){
            if(vis[i]== false){
                bfs(graph,v,vis,i);
            }
        }

        //bfs(graph,v);
    }
}
