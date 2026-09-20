import java.util.*;

public class Function168 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static boolean isFull(Node root) {

        // Empty tree is considered full
        if (root == null) {
            return true;
        }

        // Leaf node
        if (root.left == null && root.right == null) {
            return true;
        }

        // Node has exactly one child
        if (root.left == null || root.right == null) {
            return false;
        }

        // Both children exist
        return isFull(root.left) && isFull(root.right);
    }

    public static void main(String[] args) {

        /*
                 1
                / \
               2   3
              / \
             4   5
        */

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        if (isFull(root)) {
            System.out.println("Binary Tree is Full.");
        } else {
            System.out.println("Binary Tree is Not Full.");
        }
    }
}