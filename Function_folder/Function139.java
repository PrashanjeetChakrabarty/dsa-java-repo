import java.util.*;

public class Function139 {

    static class Node {

        int data;
        Node left;
        Node right;

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

    // Vertical Order Traversal
    public static void verticalOrder(Node root) {

        if (root == null) {
            return;
        }

        TreeMap<Integer, List<Integer>> map = new TreeMap<>();

        Queue<Pair> queue = new LinkedList<>();

        queue.offer(new Pair(root, 0));

        while (!queue.isEmpty()) {

            Pair current = queue.poll();

            Node node = current.node;
            int hd = current.hd;

            map.putIfAbsent(hd, new ArrayList<>());

            map.get(hd).add(node.data);

            if (node.left != null) {
                queue.offer(
                    new Pair(node.left, hd - 1)
                );
            }

            if (node.right != null) {
                queue.offer(
                    new Pair(node.right, hd + 1)
                );
            }
        }

        // Print columns from left to right
        for (List<Integer> column : map.values()) {

            for (int value : column) {
                System.out.print(value + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        /*
                  1
                /   \
               2     3
              / \   / \
             4   5 6   7
        */

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Vertical Order:");

        verticalOrder(root);
    }
}