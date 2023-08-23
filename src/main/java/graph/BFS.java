package graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class BFS {

    private static void addEdge(List<List<Integer>> graph, int u, int v) {
        graph.get(u).add(v);
        graph.get(v).add(u);
    }


    private static void printGraph(List<List<Integer>> graph) {
        for (int i = 0; i < graph.size(); i++) {
            for (int j = 0; j < graph.get(i).size(); j++) {
                System.out.print(" " + graph.get(i).get(j));
            }
            System.out.println();
        }
    }


    private static List<List<Integer>> setUpGrpah(int ver) {
        int vertex = ver;
        List<List<Integer>> graph = new ArrayList<>(vertex);
        for (int i = 0; i < vertex; i++) {
            graph.add(new ArrayList<>());
        }
        addEdge(graph, 0, 1);
        addEdge(graph, 0, 2);
        addEdge(graph, 1, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 3, 4);
       // printGraph(graph);
        return graph;
    }

    public static void main(String[] args) {
        List<List<Integer>> graph = setUpGrpah(5);
        boolean visited[] = new boolean[5];
        printBFS(graph,5,0);


    }

    private static void printBFS(List<List<Integer>> graph, int i, int source) {
        boolean[] visited = new boolean[i];
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(source);
        while (!queue.isEmpty()) {
            int aj = queue.poll();
            if(visited[aj]==false) {
                System.out.print(" "+aj);
                visited[aj]=true;
                List<Integer> adj = graph.get(aj);
                queue.addAll(adj);
                }
        }
    }
}



