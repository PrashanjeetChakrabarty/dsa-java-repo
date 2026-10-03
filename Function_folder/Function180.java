import java.util.*;

public class Function180 {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    static int findMaximumNodeLevel(Node root) {

        if (root == null) {
            return -1;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        int level = 0;
        int maxLevel = 0;
        int maxNodes = 0;

        while (!queue.isEmpty()) {

            int size = queue.size();

            // Check if current level has more nodes
            if (size > maxNodes) {
                maxNodes = size;
                maxLevel = level;
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

        System.out.println("Maximum Number of Nodes: " + maxNodes);
        System.out.println("Level with Maximum Nodes: " + maxLevel);

        return maxLevel;
    }

    public static void main(String[] args) {

        /*
                1
               / \
              2   3
             / \   \
            4   5   6
        */

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.right = new Node(6);

        findMaximumNodeLevel(root);
    }
}