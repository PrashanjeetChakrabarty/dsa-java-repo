import java.util.ArrayList;
import java.util.List;

public class Function224 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    // Store all node values using DFS
    static void storeValues(Node root, List<Integer> values) {

        if (root == null) {
            return;
        }

        values.add(root.data);

        storeValues(root.left, values);
        storeValues(root.right, values);
    }

    // Find minimum difference between two distinct nodes
    static long findMinimumDifference(List<Integer> values) {

        long minDiff = Long.MAX_VALUE;

        for (int i = 0; i < values.size(); i++) {

            for (int j = i + 1; j < values.size(); j++) {

                long diff = Math.abs(
                    (long) values.get(i) - values.get(j)
                );

                minDiff = Math.min(minDiff, diff);
            }
        }

        return minDiff;
    }

    public static void main(String[] args) {

        Node root = new Node(10);

        root.left = new Node(5);
        root.right = new Node(20);

        root.left.left = new Node(2);
        root.left.right = new Node(8);

        root.right.right = new Node(30);

        List<Integer> values = new ArrayList<>();

        storeValues(root, values);

        System.out.println("Node Values: " + values);

        if (values.size() < 2) {
            System.out.println(
                "Minimum Difference: Not Possible"
            );
        } else {
            long result = findMinimumDifference(values);

            System.out.println("Minimum Difference: " + result);
        }
    }
}