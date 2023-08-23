package graph;

import java.util.ArrayList;

public class ConnectedGraph {

    static void dfs(int vertex,ArrayList<ArrayList<Integer>> adj, boolean[] visited ) {
        visited[vertex]=true;
        for ( int vert : adj.get(vertex)) {
            if ( !visited[vert])
                dfs(vert,adj,visited);
        }
    }

    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
        ArrayList<ArrayList<Integer>> adjLs = new ArrayList<>();
        for (int i=1;i<=V;i++)
            adjLs.add(new ArrayList<Integer>());
        //Converting 0's and 1's to adjacency list of values
        for (int i=0;i<V;i++) {
            for (int j=0;j<V;j++) {
                if ( adj.get(i).get(j)==1 && i!=j) {
                    adjLs.get(i).add(j);
                    adjLs.get(j).add(i);
                }
            }
        }
        boolean[] visited = new boolean[V+1];
        int count=0;
        for (int i=0; i<V;i++) {
            if (!visited[i]) {
                count++;
                dfs(i,adjLs,visited);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] aj =new int[][]{{1, 0, 1},{0, 1, 0}, {1, 0, 1}};
        int V=3;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i=0;i<V;i++) {
            adj.add(new ArrayList<Integer>());
        }

        for (int i=0;i<V;i++) {
            for (int j=0;j<V;j++) {
                adj.get(i).add(aj[i][j]);
            }
        }


        System.out.println(numProvinces(adj,V));
    }

}
