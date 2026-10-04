import java.util.*;

public class Function181 {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    static int findMinimumNodeLevel(Node root) {

        if (root == null) {
            return -1;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        int level = 0;
        int minLevel = 0;
        int minNodes = Integer.MAX_VALUE;

        while (!queue.isEmpty()) {

            int size = queue.size();

            // Check if current level has fewer nodes
            if (size < minNodes) {
                minNodes = size;
                minLevel = level;
            }

            // Process current level
            for (int i = 0; i < size; i++) {

                Node current = queue.poll();

                if (current.left != null) {
                    queue.add(current.left);
                }

                if (current.right != null) {
                    queue.add(current.right);
                }
            }

            level++;
        }

        System.out.println("Minimum Number of Nodes: " + minNodes);
        System.out.println("Level with Minimum Nodes: " + minLevel);

        return minLevel;
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

        root.right.right.left = new Node(7);

        findMinimumNodeLevel(root);
    }
}