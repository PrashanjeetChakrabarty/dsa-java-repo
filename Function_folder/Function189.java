
import java.util.*;

public class Function189 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static boolean isLeaf(Node node) {
        return node.left == null && node.right == null;
    }

    static void addLeftBoundary(Node root, List<Integer> result) {
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

    static void addLeaves(Node root, List<Integer> result) {
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

    static void addRightBoundary(Node root, List<Integer> result) {
        Node current = root.right;
        List<Integer> temp = new ArrayList<>();

        while (current != null) {
            if (!isLeaf(current)) {
                temp.add(current.data);
            }

            if (current.right != null) {
                current = current.right;
            } else {
                current = current.left;
            }
        }

        // Reverse the right boundary
        for (int i = temp.size() - 1; i >= 0; i--) {
            result.add(temp.get(i));
        }
    }

    static List<Integer> boundaryTraversal(Node root) {
        List<Integer> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        // Add root once
        if (!isLeaf(root)) {
            result.add(root.data);
        } else {
            result.add(root.data);
            return result;
        }

        addLeftBoundary(root, result);
        addLeaves(root, result);
        addRightBoundary(root, result);

        return result;
    }

    public static void main(String[] args) {

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(boundaryTraversal(root));
    }
}