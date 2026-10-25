import java.util.ArrayList;
import java.util.List;

public class Function195 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static void sumAtEachLevel(Node root, int level, List<Integer> sums) {
        if (root == null) {
            return;
        }

        // If this level is encountered for the first time
        if (level == sums.size()) {
            sums.add(0);
        }

        // Add the current node's value to its level's sum
        sums.set(level, sums.get(level) + root.data);

        // Visit left and right subtrees using DFS
        sumAtEachLevel(root.left, level + 1, sums);
        sumAtEachLevel(root.right, level + 1, sums);
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

        sumAtEachLevel(root, 0, sums);

        for (int i = 0; i < sums.size(); i++) {
            System.out.println("Level " + i + " Sum: " + sums.get(i));
        }
    }
}