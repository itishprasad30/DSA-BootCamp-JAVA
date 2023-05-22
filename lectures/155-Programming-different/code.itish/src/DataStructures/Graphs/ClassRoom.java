package DataStructures.Graphs;

import java.util.ArrayList;
import java.util.Arrays;

public class ClassRoom {
    static class Edge{
        int src;
        int dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void main(String[] args) {
        int v = 4;
        ArrayList<Edge> [] graph = new ArrayList[v];
        createGraph(graph);
        //print 2's neighbour

        for(int i=0;i<graph[1].size();i++){
            Edge e = graph[1].get(i);
            System.out.println(e.dest + " ");
        }

    }

    public static void  createGraph(ArrayList<Edge> graph[]){
        for(int i =0; i<graph.length;i++){
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,2));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,2));


    }

}
