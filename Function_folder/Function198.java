import java.util.ArrayList;
import java.util.List;

public class Function198 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static void calculateLevelSums(
            Node root, int level, List<Integer> sums) {

        if (root == null) {
            return;
        }

        // Initialize the sum for a new level
        if (level == sums.size()) {
            sums.add(0);
        }

        // Add the current node's value to its level
        sums.set(level, sums.get(level) + root.data);

        // Traverse the left and right subtrees
        calculateLevelSums(root.left, level + 1, sums);
        calculateLevelSums(root.right, level + 1, sums);
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        List<Integer> sums = new ArrayList<>();

        calculateLevelSums(root, 0, sums);

        int minSum = sums.get(0);
        int minLevel = 0;

        System.out.println("Level Sums:");

        for (int i = 0; i < sums.size(); i++) {

            System.out.println(
                "Level " + i + " Sum: " + sums.get(i)
            );

            if (sums.get(i) < minSum) {
                minSum = sums.get(i);
                minLevel = i;
            }
        }

        System.out.println("\nMinimum Sum: " + minSum);
        System.out.println("Level with Minimum Sum: " + minLevel);
    }
}