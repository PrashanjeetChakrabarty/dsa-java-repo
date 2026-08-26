import java.util.*;

public class Function137 {

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

    // Function to find Top View
    public static List<Integer> topView(Node root) {

        List<Integer> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        // Maintains insertion order based on horizontal distance
        TreeMap<Integer, Integer> map = new TreeMap<>();

        Queue<Pair> queue = new LinkedList<>();

        queue.offer(new Pair(root, 0));

        while (!queue.isEmpty()) {

            Pair current = queue.poll();

            Node node = current.node;
            int hd = current.hd;

            // First node at this horizontal distance
            if (!map.containsKey(hd)) {
                map.put(hd, node.data);
            }

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

        result.addAll(map.values());

        return result;
    }

    public static void main(String[] args) {

        /*
                  1
                /   \
               2     3
                \   / \
                 5 6   7
        */

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        List<Integer> result = topView(root);

        System.out.println("Top View:");

        for (int value : result) {
            System.out.print(value + " ");
        }
    }
}