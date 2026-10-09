
import java.util.*;

public class Function185 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static void findLeftmostAtEachLevel(Node root) {

        if (root == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        int level = 0;

        while (!queue.isEmpty()) {

            int size = queue.size();

            // First node of this level is the leftmost
            Node leftmost = queue.peek();

            System.out.println(
                "Level " + level +
                " Leftmost Node: " + leftmost.data
            );

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

        findLeftmostAtEachLevel(root);
    }
}