import java.util.*;

public class Function161 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    // Returns distance from current node to target.
    // -1 means target is not present in this subtree.
    static int findNodes(Node root, int target, int k) {

        if (root == null) {
            return -1;
        }

        // Target node found
        if (root.data == target) {
            printDown(root, k);
            return 0;
        }

        // Search in left subtree
        int leftDistance = findNodes(root.left, target, k);

        if (leftDistance != -1) {

            int distanceFromRoot = leftDistance + 1;

            // Root is exactly k distance from target
            if (distanceFromRoot == k) {
                System.out.print(root.data + " ");
            }

            // Search the opposite subtree
            int remainingDistance = k - distanceFromRoot - 1;

            if (remainingDistance >= 0) {
                printDown(root.right, remainingDistance);
            }

            return distanceFromRoot;
        }

        // Search in right subtree
        int rightDistance = findNodes(root.right, target, k);

        if (rightDistance != -1) {

            int distanceFromRoot = rightDistance + 1;

            // Root is exactly k distance from target
            if (distanceFromRoot == k) {
                System.out.print(root.data + " ");
            }

            // Search the opposite subtree
            int remainingDistance = k - distanceFromRoot - 1;

            if (remainingDistance >= 0) {
                printDown(root.left, remainingDistance);
            }

            return distanceFromRoot;
        }

        return -1;
    }

    // Print nodes k levels below the current node
    static void printDown(Node root, int k) {

        if (root == null || k < 0) {
            return;
        }

        if (k == 0) {
            System.out.print(root.data + " ");
            return;
        }

        printDown(root.left, k - 1);
        printDown(root.right, k - 1);
    }

    public static void main(String[] args) {

        /*
                 3
                / \
               5   1
              / \ / \
             6  2 0  8
               / \
              7   4
        */

        Node root = new Node(3);

        root.left = new Node(5);
        root.right = new Node(1);

        root.left.left = new Node(6);
        root.left.right = new Node(2);

        root.right.left = new Node(0);
        root.right.right = new Node(8);

        root.left.right.left = new Node(7);
        root.left.right.right = new Node(4);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter target node: ");
        int target = sc.nextInt();

        System.out.print("Enter distance K: ");
        int k = sc.nextInt();

        System.out.print("Nodes at distance " + k + ": ");

        int distance = findNodes(root, target, k);

        if (distance == -1) {
            System.out.println("Target node not found.");
        } else {
            System.out.println();
        }

        sc.close();
    }
}