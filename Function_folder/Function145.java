import java.util.*;

public class Function145 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static void flatten(Node root) {

        if (root == null) {
            return;
        }

        // Flatten left and right subtrees
        flatten(root.left);
        flatten(root.right);

        // Store the right subtree
        Node rightSubtree = root.right;

        // Move left subtree to right
        root.right = root.left;

        // Remove left pointer
        root.left = null;

        // Find the end of the new right subtree
        Node current = root;

        while (current.right != null) {
            current = current.right;
        }

        // Attach original right subtree
        current.right = rightSubtree;
    }

    static void printFlattenedTree(Node root) {

        Node current = root;

        System.out.print("Flattened Tree: ");

        while (current != null) {
            System.out.print(current.data + " ");

            current = current.right;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        /*
                 1
                / \
               2   5
              / \   \
             3   4   6
        */

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(5);

        root.left.left = new Node(3);
        root.left.right = new Node(4);

        root.right.right = new Node(6);

        flatten(root);

        printFlattenedTree(root);
    }
}