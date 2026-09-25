import java.util.*;

public class Function172 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static boolean areMirror(Node root1, Node root2) {

        // Both nodes are null
        if (root1 == null && root2 == null) {
            return true;
        }

        // One is null and the other is not
        if (root1 == null || root2 == null) {
            return false;
        }

        // Values must be equal
        if (root1.data != root2.data) {
            return false;
        }

        // Cross-check the subtrees
        return areMirror(root1.left, root2.right)
                && areMirror(root1.right, root2.left);
    }

    public static void main(String[] args) {

        /*
            Tree 1:

                    1
                   / \
                  2   3
                 / \
                4   5
        */

        Node root1 = new Node(1);

        root1.left = new Node(2);
        root1.right = new Node(3);

        root1.left.left = new Node(4);
        root1.left.right = new Node(5);


        /*
            Tree 2:

                    1
                   / \
                  3   2
                     / \
                    5   4
        */

        Node root2 = new Node(1);

        root2.left = new Node(3);
        root2.right = new Node(2);

        root2.right.left = new Node(5);
        root2.right.right = new Node(4);


        if (areMirror(root1, root2)) {
            System.out.println("Trees are Mirror Images.");
        } else {
            System.out.println("Trees are Not Mirror Images.");
        }
    }
}