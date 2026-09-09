import java.util.*;

public class Function149 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static class Result {
        boolean isSumTree;
        int sum;

        Result(boolean isSumTree, int sum) {
            this.isSumTree = isSumTree;
            this.sum = sum;
        }
    }

    static Result checkSumTree(Node root) {

        // Empty tree
        if (root == null) {
            return new Result(true, 0);
        }

        // Leaf node
        if (root.left == null && root.right == null) {
            return new Result(true, root.data);
        }

        // Check left subtree
        Result left = checkSumTree(root.left);

        // Check right subtree
        Result right = checkSumTree(root.right);

        // Current node must equal sum of left and right subtrees
        boolean currentValid =
                left.isSumTree &&
                right.isSumTree &&
                root.data == left.sum + right.sum;

        // Total sum of current subtree
        int totalSum = root.data + left.sum + right.sum;

        return new Result(currentValid, totalSum);
    }

    public static void main(String[] args) {

        /*
                 26
                /  \
              10    16
             / \   / \
            4   6 8   8
        */

        Node root = new Node(26);

        root.left = new Node(10);
        root.right = new Node(16);

        root.left.left = new Node(4);
        root.left.right = new Node(6);

        root.right.left = new Node(8);
        root.right.right = new Node(8);

        Result result = checkSumTree(root);

        if (result.isSumTree) {
            System.out.println("Sum Tree");
        } else {
            System.out.println("Not a Sum Tree");
        }
    }
}