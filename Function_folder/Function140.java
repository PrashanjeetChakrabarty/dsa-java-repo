import java.util.*;

public class Function140 {

    static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    // Add left boundary excluding leaves
    public static void addLeftBoundary(
            Node root, List<Integer> result) {

        Node current = root.left;

        while (current != null) {

            if (!isLeaf(current)) {
                result.add(current.data);
            }

            if (current.left != null) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
    }

    // Add all leaf nodes
    public static void addLeaves(
            Node root, List<Integer> result) {

        if (root == null) {
            return;
        }

        if (isLeaf(root)) {
            result.add(root.data);
            return;
        }

        addLeaves(root.left, result);
        addLeaves(root.right, result);
    }

    // Add right boundary in reverse
    public static void addRightBoundary(
            Node root, List<Integer> result) {

        List<Integer> rightBoundary = new ArrayList<>();

        Node current = root.right;

        while (current != null) {

            if (!isLeaf(current)) {
                rightBoundary.add(current.data);
            }

            if (current.right != null) {
                current = current.right;
            } else {
                current = current.left;
            }
        }

        // Reverse order
        for (int i = rightBoundary.size() - 1;
             i >= 0;
             i--) {

            result.add(rightBoundary.get(i));
        }
    }

    // Check leaf
    public static boolean isLeaf(Node node) {

        return node != null &&
               node.left == null &&
               node.right == null;
    }

    // Boundary traversal
    public static List<Integer> boundaryTraversal(Node root) {

        List<Integer> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        // Root
        if (!isLeaf(root)) {
            result.add(root.data);
        }

        // Left boundary
        addLeftBoundary(root, result);

        // Leaves
        addLeaves(root, result);

        // Right boundary
        addRightBoundary(root, result);

        return result;
    }

    public static void main(String[] args) {

        /*
                  1
                /   \
               2     3
              / \   / \
             4   5 6   7
                / \
               8   9
        */

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        root.left.right.left = new Node(8);
        root.left.right.right = new Node(9);

        List<Integer> result =
                boundaryTraversal(root);

        System.out.println("Boundary Traversal:");

        for (int value : result) {
            System.out.print(value + " ");
        }
    }
}