import java.util.*;

public class Function156 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static int maxWidth(Node root) {

        if (root == null) {
            return 0;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        int maxWidth = 0;

        while (!queue.isEmpty()) {

            // Number of nodes at current level
            int levelSize = queue.size();

            maxWidth = Math.max(maxWidth, levelSize);

            for (int i = 0; i < levelSize; i++) {

                Node current = queue.poll();

                if (current.left != null) {
                    queue.add(current.left);
                }

                if (current.right != null) {
                    queue.add(current.right);
                }
            }
        }

        return maxWidth;
    }

    public static void main(String[] args) {

        /*
                 1
                / \
               2   3
              / \   \
             4   5   6
                / \
               7   8
        */

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.right = new Node(6);

        root.left.right.left = new Node(7);
        root.left.right.right = new Node(8);

        int width = maxWidth(root);

        System.out.println("Maximum Width of Binary Tree: " + width);
    }
}