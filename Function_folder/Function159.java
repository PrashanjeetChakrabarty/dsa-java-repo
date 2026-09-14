import java.util.*;

public class Function159 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static void printPaths(Node root, int targetSum,
                           ArrayList<Integer> path) {

        if (root == null) {
            return;
        }

        // Add current node to path
        path.add(root.data);

        // Reduce target sum
        targetSum -= root.data;

        // If leaf and target becomes zero
        if (root.left == null &&
            root.right == null &&
            targetSum == 0) {

            for (int i = 0; i < path.size(); i++) {

                System.out.print(path.get(i));

                if (i < path.size() - 1) {
                    System.out.print(" -> ");
                }
            }

            System.out.println();
        }

        // Explore left subtree
        printPaths(root.left, targetSum, path);

        // Explore right subtree
        printPaths(root.right, targetSum, path);

        // Backtrack
        path.remove(path.size() - 1);
    }

    public static void main(String[] args) {

        /*
                 1
                / \
               2   3
              / \   \
             4   5   6
        */

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.right = new Node(6);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter target sum: ");
        int targetSum = sc.nextInt();

        ArrayList<Integer> path = new ArrayList<>();

        System.out.println("Paths with given sum:");

        printPaths(root, targetSum, path);

        sc.close();
    }
}