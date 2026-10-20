
import java.util.*;

public class Function192 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static class Pair {
        Node node;
        int hd;

        Pair(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    static void printHorizontalDistances(Node root) {

        if (root == null) {
            return;
        }

        Queue<Pair> queue = new LinkedList<>();

        queue.add(new Pair(root, 0));

        while (!queue.isEmpty()) {

            Pair pair = queue.poll();

            Node current = pair.node;
            int hd = pair.hd;

            System.out.println(
                "Node " + current.data + " -> HD " + hd
            );

            if (current.left != null) {
                queue.add(new Pair(current.left, hd - 1));
            }

            if (current.right != null) {
                queue.add(new Pair(current.right, hd + 1));
            }
        }
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

        printHorizontalDistances(root);
    }
}
