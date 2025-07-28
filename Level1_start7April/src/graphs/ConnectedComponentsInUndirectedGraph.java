package graphs;

import java.util.*;

public class ConnectedComponentsInUndirectedGraph {

    class Solution {
        public ArrayList<ArrayList<Integer>> getComponents(int V, int[][] edges) {
            // resultant list
            ArrayList<ArrayList<Integer>> result = new ArrayList<>();

            ArrayList<Integer>[] AdjList = new ArrayList[V];
            for (int i = 0; i < V; i++) {
                AdjList[i] = new ArrayList<>();
            }
            for (int[] edge : edges) {
                int u = edge[0], v = edge[1];
                AdjList[u].add(v);
                AdjList[v].add(u);
            }

            boolean[] visited = new boolean[V];
            for (int i = 0; i < V; i++) {
                if (!visited[i]) {
                    ArrayList<Integer> path = new ArrayList<>();
                    path.add(i);
                    dfs(AdjList, visited, result, i, path);
                    result.add(path);
                }
            }
            return result;
        }

        private static void dfs(ArrayList<Integer>[] AdjList, boolean[] visited, ArrayList<ArrayList<Integer>> result, int current, ArrayList<Integer> path) {

            visited[current] = true;

            for (int neighbour : AdjList[current]) {
                if (!visited[neighbour]) {
                    path.add(neighbour);
                    dfs(AdjList, visited, result, neighbour, path);
                }
            }

        }
    }
}
