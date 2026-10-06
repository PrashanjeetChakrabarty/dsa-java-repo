import java.util.*;

public class Function183 {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    static void findMaximumAtEachLevel(Node root) {

        if (root == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        int level = 0;

        while (!queue.isEmpty()) {

            int size = queue.size();

            // Start with the smallest possible integer
            int max = Integer.MIN_VALUE;

            for (int i = 0; i < size; i++) {

                Node current = queue.poll();

                if (current.data > max) {
                    max = current.data;
                }

                if (current.left != null) {
                    queue.add(current.left);
                }

                if (current.right != null) {
                    queue.add(current.right);
                }
            }

            System.out.println(
                "Level " + level + " Maximum: " + max
            );

            level++;
        }
    }

    public static void main(String[] args) {

        /*
                1
               / \
              2   3
             / \   \
            4   5   6
               /
              7
        */

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.right = new Node(6);

        root.left.right.left = new Node(7);

        findMaximumAtEachLevel(root);
    }
}