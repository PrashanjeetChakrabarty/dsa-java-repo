
import java.util.*;

public class Function190 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static void diagonalTraversal(Node root) {

        if (root == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {

            int size = queue.size();

            for (int i = 0; i < size; i++) {

                Node current = queue.poll();

                // Traverse along the current diagonal
                while (current != null) {

                    System.out.print(current.data + " ");

                    // Left child belongs to the next diagonal
                    if (current.left != null) {
                        queue.add(current.left);
                    }

                    // Right child stays on the same diagonal
                    current = current.right;
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        /*
                1
               / \
              2   3
             / \ / \
            4  5 6  7
        */

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        diagonalTraversal(root);
    }
}