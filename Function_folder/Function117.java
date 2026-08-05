import java.util.*;

public class Function117 {

    // Function to check if all courses can be completed
    public static boolean canFinish(int numCourses, int[][] prerequisites) {

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }

        int[] indegree = new int[numCourses];

        // Build graph
        for (int[] edge : prerequisites) {

            graph.get(edge[1]).add(edge[0]);

            indegree[edge[0]]++;
        }

        Queue<Integer> queue = new LinkedList<>();

        // Add all nodes having indegree = 0
        for (int i = 0; i < numCourses; i++) {

            if (indegree[i] == 0) {
                queue.offer(i);
            }
        }

        int visited = 0;

        while (!queue.isEmpty()) {

            int current = queue.poll();

            visited++;

            for (int neighbor : graph.get(current)) {

                indegree[neighbor]--;

                if (indegree[neighbor] == 0) {
                    queue.offer(neighbor);
                }
            }
        }

        return visited == numCourses;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of courses: ");
        int courses = sc.nextInt();

        System.out.print("Enter number of prerequisite pairs: ");
        int m = sc.nextInt();

        int[][] prerequisites = new int[m][2];

        System.out.println("Enter prerequisite pairs:");

        for (int i = 0; i < m; i++) {

            prerequisites[i][0] = sc.nextInt();
            prerequisites[i][1] = sc.nextInt();
        }

        if (canFinish(courses, prerequisites)) {
            System.out.println("Possible to finish all courses.");
        } else {
            System.out.println("Not Possible.");
        }

        sc.close();
    }
}