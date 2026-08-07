import java.util.*;

public class Function119 {

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

    // Bellman-Ford Algorithm
    public static void bellmanFord(List<Edge> edges, int vertices, int source) {

        int[] distance = new int[vertices];

        Arrays.fill(distance, Integer.MAX_VALUE);

        distance[source] = 0;

        // Relax all edges V-1 times
        for (int i = 1; i < vertices; i++) {

            for (Edge edge : edges) {

                if (distance[edge.source] != Integer.MAX_VALUE &&
                    distance[edge.source] + edge.weight < distance[edge.destination]) {

                    distance[edge.destination] =
                            distance[edge.source] + edge.weight;
                }
            }
        }

        // Check for negative weight cycle
        for (Edge edge : edges) {

            if (distance[edge.source] != Integer.MAX_VALUE &&
                distance[edge.source] + edge.weight < distance[edge.destination]) {

                System.out.println("Negative Weight Cycle Detected!");
                return;
            }
        }

        System.out.println("\nShortest Distances:");

        for (int i = 0; i < vertices; i++) {

            System.out.println(source + " -> " + i + " = " + distance[i]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int vertices = sc.nextInt();

        System.out.print("Enter number of edges: ");
        int edgesCount = sc.nextInt();

        List<Edge> edges = new ArrayList<>();

        System.out.println("Enter source destination weight:");

        for (int i = 0; i < edgesCount; i++) {

            int source = sc.nextInt();
            int destination = sc.nextInt();
            int weight = sc.nextInt();

            edges.add(new Edge(source, destination, weight));
        }

        System.out.print("Enter source vertex: ");
        int source = sc.nextInt();

        bellmanFord(edges, vertices, source);

        sc.close();
    }
}