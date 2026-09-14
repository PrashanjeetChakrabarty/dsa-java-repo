import java.util.*;

public class Function158 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static boolean hasPathSum(Node root, int targetSum) {

        // Empty tree
        if (root == null) {
            return false;
        }

        // Subtract current node's value
        targetSum -= root.data;

        // If leaf node, check whether sum becomes zero
        if (root.left == null && root.right == null) {
            return targetSum == 0;
        }

        // Check left and right subtree
        return hasPathSum(root.left, targetSum)
                || hasPathSum(root.right, targetSum);
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

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter target sum: ");
        int targetSum = sc.nextInt();

        if (hasPathSum(root, targetSum)) {
            System.out.println("Path with given sum exists.");
        } else {
            System.out.println("Path with given sum does not exist.");
        }

        sc.close();
    }
}