import java.util.*;

public class Function179 {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    static int findMinimumSumLevel(Node root) {

        if (root == null) {
            return -1;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        int level = 0;
        int minLevel = 0;
        int minSum = Integer.MAX_VALUE;

        while (!queue.isEmpty()) {

            int size = queue.size();
            int sum = 0;

            for (int i = 0; i < size; i++) {

                Node current = queue.poll();

                sum += current.data;

                if (current.left != null) {
                    queue.add(current.left);
                }

                if (current.right != null) {
                    queue.add(current.right);
                }
            }

            if (sum < minSum) {
                minSum = sum;
                minLevel = level;
            }

            level++;
        }

        System.out.println("Minimum Sum: " + minSum);
        System.out.println("Level with Minimum Sum: " + minLevel);

        return minLevel;
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

        findMinimumSumLevel(root);
    }
}