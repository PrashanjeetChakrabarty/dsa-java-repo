import java.util.*;

public class Function166 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static int findMaxDepth(Node root) {

        if (root == null) {
            return 0;
        }

        Queue<Node> queue = new LinkedList<>();

        queue.add(root);

        int depth = 0;

        while (!queue.isEmpty()) {

            // Number of nodes at current level
            int levelSize = queue.size();

            // Process the entire current level
            for (int i = 0; i < levelSize; i++) {

                Node current = queue.poll();

                if (current.left != null) {
                    queue.add(current.left);
                }

                if (current.right != null) {
                    queue.add(current.right);
                }
            }

            // One complete level processed
            depth++;
        }

        return depth;
    }

    public static void main(String[] args) {

        /*
                 1
                / \
               2   3
              / \
             4   5
            /
           6
        */

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.left.left.left = new Node(6);

        int depth = findMaxDepth(root);

        System.out.println("Maximum Depth: " + depth);
    }
}