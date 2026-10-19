
import java.util.*;

public class Function191 {

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

    static void verticalSum(Node root) {

        if (root == null) {
            return;
        }

        TreeMap<Integer, Integer> sums = new TreeMap<>();
        Queue<Pair> queue = new LinkedList<>();

        queue.add(new Pair(root, 0));

        while (!queue.isEmpty()) {

            Pair pair = queue.poll();

            Node current = pair.node;
            int hd = pair.hd;

            // Add the node value to its vertical column
            sums.put(
                hd,
                sums.getOrDefault(hd, 0) + current.data
            );

            if (current.left != null) {
                queue.add(new Pair(current.left, hd - 1));
            }

            if (current.right != null) {
                queue.add(new Pair(current.right, hd + 1));
            }
        }

        for (Map.Entry<Integer, Integer> entry : sums.entrySet()) {
            System.out.println(
                "HD " + entry.getKey() + ": " + entry.getValue()
            );
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

        verticalSum(root);
    }
}
