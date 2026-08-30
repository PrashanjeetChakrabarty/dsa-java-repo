import java.util.Scanner;

public class Function141 {

    static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    static int maxSum;

    // Returns maximum gain from this node to one side
    public static int maxGain(Node root) {

        if (root == null) {
            return 0;
        }

        int leftGain = Math.max(0, maxGain(root.left));
        int rightGain = Math.max(0, maxGain(root.right));

        // Path passing through current node
        int currentPath =
                root.data + leftGain + rightGain;

        maxSum = Math.max(maxSum, currentPath);

        // Return only one side to the parent
        return root.data + Math.max(leftGain, rightGain);
    }

    public static int maxPathSum(Node root) {

        maxSum = Integer.MIN_VALUE;

        maxGain(root);

        return maxSum;
    }

    public static void main(String[] args) {

        /*
                 -10
                 /  \
                9    20
                    /  \
                   15   7
        */

        Node root = new Node(-10);

        root.left = new Node(9);
        root.right = new Node(20);

        root.right.left = new Node(15);
        root.right.right = new Node(7);

        System.out.println(
            "Maximum Path Sum = " + maxPathSum(root)
        );
    }
}