import java.util.*;

public class Function160 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static int countPaths(Node root, int targetSum) {

        if (root == null) {
            return 0;
        }

        // Subtract current node value
        targetSum -= root.data;

        // If leaf node, check the remaining sum
        if (root.left == null && root.right == null) {
            return targetSum == 0 ? 1 : 0;
        }

        // Count valid paths in both subtrees
        int leftCount = countPaths(root.left, targetSum);
        int rightCount = countPaths(root.right, targetSum);

        return leftCount + rightCount;
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

        int count = countPaths(root, targetSum);

        System.out.println("Number of Paths: " + count);

        sc.close();
    }
}