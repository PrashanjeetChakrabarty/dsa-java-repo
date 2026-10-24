import java.util.*;

public class Function194 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static void countNodesAtEachLevel(
            Node root, int level, List<Integer> counts) {

        if (root == null) {
            return;
        }

        // Create a count entry for a new level
        if (level == counts.size()) {
            counts.add(0);
        }

        // Increment the count for this level
        counts.set(level, counts.get(level) + 1);

        // Visit left and right subtrees
        countNodesAtEachLevel(root.left, level + 1, counts);
        countNodesAtEachLevel(root.right, level + 1, counts);
    }

    static int findMaximumNodesAtAnyLevel(Node root) {

        if (root == null) {
            return 0;
        }

        List<Integer> counts = new ArrayList<>();

        countNodesAtEachLevel(root, 0, counts);

        int maxNodes = 0;

        for (int count : counts) {
            maxNodes = Math.max(maxNodes, count);
        }

        return maxNodes;
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

        System.out.println(
            "Maximum Nodes at Any Level: "
            + findMaximumNodesAtAnyLevel(root)
        );
    }
}