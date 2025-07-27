package graphs;

import java.util.*;

public class FindIfPathExistAdjMatrix {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        // Create and populate the adjacency matrix
        boolean[][] adjacencyMatrix = new boolean[n][n];
        for (int[] edge : edges) {
            int from = edge[0];
            int to = edge[1];
            adjacencyMatrix[from][to] = true;
            adjacencyMatrix[to][from] = true; // because the graph is undirected
        }

        boolean[] visited = new boolean[n];
        return dfs(adjacencyMatrix, visited, source, destination, n);
    }

    private boolean dfs(boolean[][] adjacencyMatrix, boolean[] visited, int current, int destination, int n) {
        if (current == destination) {
            return true;
        }

        visited[current] = true;

        for (int neighbor = 0; neighbor < n; neighbor++) {
            if (adjacencyMatrix[current][neighbor] && !visited[neighbor]) {
                if (dfs(adjacencyMatrix, visited, neighbor, destination, n)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean validPathUsingBfs(int n, int[][] edges, int source, int destination) {
        boolean[][] graph = new boolean[n][n];
        for (int[] edge : edges) {
            int from = edge[0];
            int to = edge[1];

            graph[from][to] = true;
            graph[to][from] = true;
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);

        boolean[] visited = new boolean[n];

        while (!queue.isEmpty()) {
            int curr = queue.remove();
            if (curr == destination) return true;

            for (int neighbour = 0; neighbour < n; neighbour++) {
                if (graph[curr][neighbour] == true && !visited[neighbour]) {
                    queue.add(neighbour);
                    visited[neighbour] = true;
                }
            }
        }
        return false;
    }

}

