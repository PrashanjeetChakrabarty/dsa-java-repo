import java.util.Scanner;

public class Function120 {

    static final int INF = 1000000000;

    public static void floydWarshall(int[][] graph) {

        int n = graph.length;

        for (int k = 0; k < n; k++) {

            for (int i = 0; i < n; i++) {

                for (int j = 0; j < n; j++) {

                    if (graph[i][k] != INF &&
                        graph[k][j] != INF &&
                        graph[i][k] + graph[k][j] < graph[i][j]) {

                        graph[i][j] =
                                graph[i][k] + graph[k][j];
                    }
                }
            }
        }

        // Check for negative cycle
        for (int i = 0; i < n; i++) {

            if (graph[i][i] < 0) {
                System.out.println("Negative Weight Cycle Detected!");
                return;
            }
        }

        System.out.println("\nAll-Pairs Shortest Path:");

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                if (graph[i][j] == INF) {
                    System.out.print("INF ");
                } else {
                    System.out.print(graph[i][j] + " ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int n = sc.nextInt();

        int[][] graph = new int[n][n];

        System.out.println(
                "Enter adjacency matrix " +
                "(use -1 for no direct edge):"
        );

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                int value = sc.nextInt();

                if (i == j) {
                    graph[i][j] = 0;
                }
                else if (value == -1) {
                    graph[i][j] = INF;
                }
                else {
                    graph[i][j] = value;
                }
            }
        }

        floydWarshall(graph);

        sc.close();
    }
}