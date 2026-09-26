import java.util.*;

public class Function173 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    // Check whether a node exists in the tree
    static boolean exists(Node root, int target) {

        if (root == null) {
            return false;
        }

        if (root.data == target) {
            return true;
        }

        return exists(root.left, target)
                || exists(root.right, target);
    }

    // Find Lowest Common Ancestor
    static Node findLCA(Node root, int x, int y) {

        if (root == null) {
            return null;
        }

        // Current node matches one of the targets
        if (root.data == x || root.data == y) {
            return root;
        }

        // Search both subtrees
        Node left = findLCA(root.left, x, y);
        Node right = findLCA(root.right, x, y);

        // Targets found in different subtrees
        if (left != null && right != null) {
            return root;
        }

        // Return whichever subtree contains a target
        return left != null ? left : right;
    }

    public static void main(String[] args) {

        /*
                 3
                / \
               5   1
              / \ / \
             6  2 0  8
               / \
              7   4
        */

        Node root = new Node(3);

        root.left = new Node(5);
        root.right = new Node(1);

        root.left.left = new Node(6);
        root.left.right = new Node(2);

        root.right.left = new Node(0);
        root.right.right = new Node(8);

        root.left.right.left = new Node(7);
        root.left.right.right = new Node(4);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first node: ");
        int x = sc.nextInt();

        System.out.print("Enter second node: ");
        int y = sc.nextInt();

        // Verify that both nodes exist
        if (!exists(root, x) || !exists(root, y)) {
            System.out.println("One or both nodes do not exist.");
        } else {

            Node lca = findLCA(root, x, y);

            System.out.println(
                "Lowest Common Ancestor: " + lca.data
            );
        }

        sc.close();
    }
}