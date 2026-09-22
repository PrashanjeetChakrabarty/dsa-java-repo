import java.util.*;

public class Function169 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    // Find the depth of the leftmost path
    static int findDepth(Node root) {

        int depth = 0;

        while (root != null) {
            depth++;
            root = root.left;
        }

        return depth;
    }

    static boolean isPerfect(Node root, int depth, int level) {

        // Empty tree
        if (root == null) {
            return true;
        }

        // Leaf node
        if (root.left == null && root.right == null) {
            return depth == level + 1;
        }

        // Internal node with only one child
        if (root.left == null || root.right == null) {
            return false;
        }

        // Check both subtrees
        return isPerfect(root.left, depth, level + 1)
                && isPerfect(root.right, depth, level + 1);
    }

    public static void main(String[] args) {

        /*
                 1
                / \
               2   3
              / \ / \
             4  5 6  7
        */

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int depth = findDepth(root);

        if (isPerfect(root, depth, 0)) {
            System.out.println("Binary Tree is Perfect.");
        } else {
            System.out.println("Binary Tree is Not Perfect.");
        }
    }
}