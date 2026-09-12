import java.util.*;

public class Function155 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    // Find Lowest Common Ancestor
    static Node findLCA(Node root, int x, int y) {

        if (root == null) {
            return null;
        }

        if (root.data == x || root.data == y) {
            return root;
        }

        Node leftLCA = findLCA(root.left, x, y);
        Node rightLCA = findLCA(root.right, x, y);

        if (leftLCA != null && rightLCA != null) {
            return root;
        }

        return leftLCA != null ? leftLCA : rightLCA;
    }

    // Find distance from root to target node
    static int findDistance(Node root, int target) {

        if (root == null) {
            return -1;
        }

        if (root.data == target) {
            return 0;
        }

        int leftDistance = findDistance(root.left, target);

        if (leftDistance != -1) {
            return leftDistance + 1;
        }

        int rightDistance = findDistance(root.right, target);

        if (rightDistance != -1) {
            return rightDistance + 1;
        }

        return -1;
    }

    static int findDistanceBetweenNodes(Node root, int x, int y) {

        Node lca = findLCA(root, x, y);

        if (lca == null) {
            return -1;
        }

        int distanceX = findDistance(lca, x);
        int distanceY = findDistance(lca, y);

        if (distanceX == -1 || distanceY == -1) {
            return -1;
        }

        return distanceX + distanceY;
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

        System.out.print("Enter first node: ");
        int x = sc.nextInt();

        System.out.print("Enter second node: ");
        int y = sc.nextInt();

        int distance = findDistanceBetweenNodes(root, x, y);

        if (distance == -1) {
            System.out.println("One or both nodes do not exist.");
        } else {
            System.out.println("Distance between " + x + " and " + y
                    + ": " + distance);
        }

        sc.close();
    }
}