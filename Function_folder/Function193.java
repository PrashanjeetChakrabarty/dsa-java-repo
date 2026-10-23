
import java.util.*;

public class Function193 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static class Pair {
        Node node;
        long index;

        Pair(Node node, long index) {
            this.node = node;
            this.index = index;
        }
    }

    static long maximumWidth(Node root) {

        if (root == null) {
            return 0;
        }

        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(root, 0));

        long maxWidth = 0;

        while (!queue.isEmpty()) {

            int size = queue.size();

            // Index of the first node in this level
            long minIndex = queue.peek().index;
            long first = 0;
            long last = 0;

            for (int i = 0; i < size; i++) {

                Pair pair = queue.poll();

                Node current = pair.node;

                // Normalize indices to keep them small
                long index = pair.index - minIndex;

                if (i == 0) {
                    first = index;
                }

                if (i == size - 1) {
                    last = index;
                }

                if (current.left != null) {
                    queue.add(
                        new Pair(current.left, 2 * index + 1)
                    );
                }

                if (current.right != null) {
                    queue.add(
                        new Pair(current.right, 2 * index + 2)
                    );
                }
            }

            long width = last - first + 1;
            maxWidth = Math.max(maxWidth, width);
        }

        return maxWidth;
    }

    public static void main(String[] args) {

        /*
                1
               / \
              2   3
             /     \
            4       7
        */

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.right.right = new Node(7);

        System.out.println(
            "Maximum Width: " + maximumWidth(root)
        );
    }
}