package graphs;

import java.util.*;

public class FindIfPathExistAdjList {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int[] edge : edges) {
            int u = edge[0], v = edge[1];
            graph.computeIfAbsent(u, value -> new ArrayList<>()).add(v);
            graph.computeIfAbsent(v, value -> new ArrayList<>()).add(u);

        }
        boolean[] visited = new boolean[n];
        return dfs(graph, visited, n, source, destination);
    }

    private static boolean dfs(Map<Integer, List<Integer>> graph, boolean[] visited, int n, int current, int destination) {
        if (current == destination) return true;
        visited[current] = true;

        for (int neighbour : graph.get(current)) {
            if (!visited[neighbour]) {
                if (dfs(graph, visited, n, neighbour, destination)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean validPathUsingBFS(int n, int[][] edges, int source, int destination) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int[] edge : edges) {
            int u = edge[0], v = edge[1];
            graph.computeIfAbsent(u, value -> new ArrayList<>()).add(v);
            graph.computeIfAbsent(v, value -> new ArrayList<>()).add(u);

        }
        boolean[] visited = new boolean[n];
        visited[source] = true;

        Queue<Integer> q = new LinkedList<>();
        q.add(source);

        while (!q.isEmpty()) {
            int curr = q.remove();
            if (curr == destination) return true;

            for (int neighbour : graph.get(curr)) {
                if (!visited[neighbour]) {
                    q.add(neighbour);
                    visited[neighbour] = true;
                }
            }
        }
        return false;
    }

}
