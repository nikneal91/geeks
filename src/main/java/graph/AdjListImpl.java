package graph;

import java.util.ArrayList;
import java.util.List;

public class AdjListImpl {

    private static void addEdge(List<List<Integer>> graph, int u, int v) {
        graph.get(u).add(v);
        graph.get(v).add(u);
    }


    public static void main(String[] args) {
        int vertex = 5;
        List<List<Integer>> graph = new ArrayList<>(vertex);
        for ( int i =0 ; i< vertex; i++) {
            graph.add(new ArrayList<>());
        }
        addEdge(graph, 0,1);
        addEdge(graph, 0,2);
        addEdge(graph, 1,2);
        addEdge(graph, 1,3);

        printGraph(graph);
    }

    private static void printGraph(List<List<Integer>> graph) {
     for ( int i =0 ; i < graph.size(); i++) {
         for ( int j =0 ; j< graph.get(i).size();j++) {
             System.out.print(" " + graph.get(i).get(j));
         }
         System.out.println();
     }
    }
}
