import java.util.*;

public class Function167 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static boolean isComplete(Node root) {

        if (root == null) {
            return true;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        // Once a null child is found, every following node
        // in level order must also be null.
        boolean foundNull = false;

        while (!queue.isEmpty()) {

            Node current = queue.poll();

            // Left child
            if (current.left != null) {

                if (foundNull) {
                    return false;
                }

                queue.add(current.left);

            } else {
                foundNull = true;
            }

            // Right child
            if (current.right != null) {

                if (foundNull) {
                    return false;
                }

                queue.add(current.right);

            } else {
                foundNull = true;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        /*
                 1
                / \
               2   3
              / \  /
             4  5 6
        */

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);

        if (isComplete(root)) {
            System.out.println("Binary Tree is Complete.");
        } else {
            System.out.println("Binary Tree is Not Complete.");
        }
    }
}