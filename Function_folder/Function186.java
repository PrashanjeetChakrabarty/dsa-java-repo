
import java.util.*;

public class Function186 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static void findRightmostAtEachLevel(Node root) {

        if (root == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        int level = 0;

        while (!queue.isEmpty()) {

            int size = queue.size();
            Node current = null;

            for (int i = 0; i < size; i++) {

                current = queue.poll();

                if (current.left != null) {
                    queue.add(current.left);
                }

                if (current.right != null) {
                    queue.add(current.right);
                }
            }

            // Last node processed is the rightmost
            System.out.println(
                "Level " + level +
                " Rightmost Node: " + current.data
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

        findRightmostAtEachLevel(root);
    }
}