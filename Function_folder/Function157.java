import java.util.*;

public class Function157 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static void printPaths(Node root, ArrayList<Integer> path) {

        if (root == null) {
            return;
        }

        // Add current node to path
        path.add(root.data);

        // If leaf node, print the complete path
        if (root.left == null && root.right == null) {

            for (int i = 0; i < path.size(); i++) {

                System.out.print(path.get(i));

                if (i < path.size() - 1) {
                    System.out.print(" -> ");
                }
            }

            System.out.println();
        }

        // Traverse left subtree
        printPaths(root.left, path);

        // Traverse right subtree
        printPaths(root.right, path);

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

        ArrayList<Integer> path = new ArrayList<>();

        System.out.println("Root-to-Leaf Paths:");

        printPaths(root, path);
    }
}