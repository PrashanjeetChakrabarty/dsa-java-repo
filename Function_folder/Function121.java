import java.util.*;

public class Function121 {

    static class Edge {
        int source;
        int destination;
        int weight;

        Edge(int source, int destination, int weight) {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }
    }

    static class DSU {

        int[] parent;
        int[] rank;

        DSU(int n) {

            parent = new int[n];
            rank = new int[n];

            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
        }

        // Find with path compression
        int find(int x) {

            if (parent[x] != x) {
                parent[x] = find(parent[x]);
            }

            return parent[x];
        }

        // Union by rank
        boolean union(int a, int b) {

            int rootA = find(a);
            int rootB = find(b);

            if (rootA == rootB) {
                return false;
            }

            if (rank[rootA] < rank[rootB]) {
                parent[rootA] = rootB;
            }
            else if (rank[rootA] > rank[rootB]) {
                parent[rootB] = rootA;
            }
            else {
                parent[rootB] = rootA;
                rank[rootA]++;
            }

            return true;
        }
    }

    public static void kruskal(List<Edge> edges, int vertices) {

        // Sort edges by weight
        edges.sort((a, b) -> Integer.compare(a.weight, b.weight));

        DSU dsu = new DSU(vertices);

        int totalWeight = 0;
        int edgesUsed = 0;

        System.out.println("Edges in Minimum Spanning Tree:");

        for (Edge edge : edges) {

            if (dsu.union(edge.source, edge.destination)) {

                System.out.println(
                    edge.source + " -- " +
                    edge.destination +
                    " = " + edge.weight
                );

                totalWeight += edge.weight;
                edgesUsed++;

                if (edgesUsed == vertices - 1) {
                    break;
                }
            }
        }

        if (edgesUsed != vertices - 1) {
            System.out.println("Graph is not connected.");
            return;
        }

        System.out.println("Minimum Cost = " + totalWeight);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int vertices = sc.nextInt();

        System.out.print("Enter number of edges: ");
        int edgeCount = sc.nextInt();

        List<Edge> edges = new ArrayList<>();

        System.out.println("Enter source destination weight:");

        for (int i = 0; i < edgeCount; i++) {

            int source = sc.nextInt();
            int destination = sc.nextInt();
            int weight = sc.nextInt();

            edges.add(
                new Edge(source, destination, weight)
            );
        }

        kruskal(edges, vertices);

        sc.close();
    }
}