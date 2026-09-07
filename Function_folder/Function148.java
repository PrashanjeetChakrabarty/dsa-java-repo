import java.util.*;

public class Function148 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static boolean isMirror(Node left, Node right) {

        // Both nodes are null
        if (left == null && right == null) {
            return true;
        }

        // One node is null and the other is not
        if (left == null || right == null) {
            return false;
        }

        // Values must be equal
        if (left.data != right.data) {
            return false;
        }

        // Left's left must match right's right
        // Left's right must match right's left
        return isMirror(left.left, right.right)
                && isMirror(left.right, right.left);
    }

    static boolean isSymmetric(Node root) {

        if (root == null) {
            return true;
        }

        return isMirror(root.left, root.right);
    }

    public static void main(String[] args) {

        /*
                 1
                / \
               2   2
              / \ / \
             3  4 4  3
        */

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(2);

        root.left.left = new Node(3);
        root.left.right = new Node(4);

        root.right.left = new Node(4);
        root.right.right = new Node(3);

        if (isSymmetric(root)) {
            System.out.println("Symmetric");
        } else {
            System.out.println("Not Symmetric");
        }
    }
}