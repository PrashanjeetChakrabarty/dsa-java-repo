import java.util.*;

public class Function164 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static int maxSum = Integer.MIN_VALUE;

    static int findMaxPathSum(Node root) {

        if (root == null) {
            return 0;
        }

        // Maximum contribution from left subtree
        int leftSum = Math.max(0, findMaxPathSum(root.left));

        // Maximum contribution from right subtree
        int rightSum = Math.max(0, findMaxPathSum(root.right));

        // Path passing through current node
        int currentPathSum = root.data + leftSum + rightSum;

        // Update global maximum
        maxSum = Math.max(maxSum, currentPathSum);

        // Return the maximum one-sided path
        return root.data + Math.max(leftSum, rightSum);
    }

    public static void main(String[] args) {

        /*
                 -10
                 / \
                9   20
                   /  \
                  15   7
        */

        Node root = new Node(-10);

        root.left = new Node(9);
        root.right = new Node(20);

        root.right.left = new Node(15);
        root.right.right = new Node(7);

        findMaxPathSum(root);

        System.out.println("Maximum Path Sum: " + maxSum);
    }
}