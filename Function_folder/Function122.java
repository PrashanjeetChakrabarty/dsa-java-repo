import java.util.*;

public class Function122 {

    static class Edge {

        int vertex;
        int weight;

        Edge(int vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }
    }

    public static int primMST(ArrayList<ArrayList<Edge>> graph) {

        int vertices = graph.size();

        boolean[] visited = new boolean[vertices];

        PriorityQueue<Edge> minHeap =
                new PriorityQueue<>(
                    (a, b) -> Integer.compare(a.weight, b.weight)
                );

        // Start from vertex 0
        minHeap.offer(new Edge(0, 0));

        int totalWeight = 0;
        int edgesUsed = 0;

        while (!minHeap.isEmpty()) {

            Edge current = minHeap.poll();

            int vertex = current.vertex;

            if (visited[vertex]) {
                continue;
            }

            visited[vertex] = true;

            totalWeight += current.weight;

            if (current.weight != 0) {
                edgesUsed++;
            }

            for (Edge neighbor : graph.get(vertex)) {

                if (!visited[neighbor.vertex]) {
                    minHeap.offer(neighbor);
                }
            }
        }

        if (edgesUsed != vertices - 1) {
            return -1;
        }

        return totalWeight;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int vertices = sc.nextInt();

        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }

        System.out.print("Enter number of edges: ");
        int edges = sc.nextInt();

        System.out.println("Enter source destination weight:");

        for (int i = 0; i < edges; i++) {

            int source = sc.nextInt();
            int destination = sc.nextInt();
            int weight = sc.nextInt();

            // Undirected graph
            graph.get(source).add(
                new Edge(destination, weight)
            );

            graph.get(destination).add(
                new Edge(source, weight)
            );
        }

        int result = primMST(graph);

        if (result == -1) {
            System.out.println("Graph is not connected.");
        } else {
            System.out.println("Minimum Spanning Tree Cost = " + result);
        }

        sc.close();
    }
}