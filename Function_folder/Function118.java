import java.util.*;

public class Function118 {

    static class Edge {

        int vertex;
        int weight;

        Edge(int vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }
    }

    public static void dijkstra(ArrayList<ArrayList<Edge>> graph, int source) {

        int V = graph.size();

        int[] distance = new int[V];

        Arrays.fill(distance, Integer.MAX_VALUE);

        distance[source] = 0;

        PriorityQueue<Edge> pq =
                new PriorityQueue<>((a, b) -> a.weight - b.weight);

        pq.offer(new Edge(source, 0));

        while (!pq.isEmpty()) {

            Edge current = pq.poll();

            int u = current.vertex;

            for (Edge neighbor : graph.get(u)) {

                int v = neighbor.vertex;
                int weight = neighbor.weight;

                if (distance[u] + weight < distance[v]) {

                    distance[v] = distance[u] + weight;

                    pq.offer(new Edge(v, distance[v]));
                }
            }
        }

        System.out.println("\nShortest Distances:");

        for (int i = 0; i < V; i++) {

            System.out.println(source + " -> " + i + " = " + distance[i]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int V = sc.nextInt();

        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        System.out.print("Enter number of edges: ");
        int E = sc.nextInt();

        System.out.println("Enter source destination weight:");

        for (int i = 0; i < E; i++) {

            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();

            graph.get(u).add(new Edge(v, w));
            graph.get(v).add(new Edge(u, w)); // Undirected Graph
        }

        System.out.print("Enter source vertex: ");
        int source = sc.nextInt();

        dijkstra(graph, source);

        sc.close();
    }
}