package graphs;

import java.util.ArrayList;
import java.util.Scanner;

public class GraphRepresentation {
    static class Edge {
        private int source;
        private int neighbour;
        private int weight;

        Edge(int source, int neighbour, int weight) {
            this.source = source;
            this.neighbour = neighbour;
            this.weight = weight;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int vertices = input.nextInt();
//        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[vertices];
//        ArrayList<Edge>[] graph = (ArrayList<Edge>[]) new ArrayList[vertices];
        for (int i = 0; i < vertices; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 3, 15));

    }
}
