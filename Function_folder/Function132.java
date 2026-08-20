import java.util.Scanner;

public class Function132 {

    static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    // Check whether two trees are identical
    public static boolean areIdentical(Node root1, Node root2) {

        // Both are empty
        if (root1 == null && root2 == null) {
            return true;
        }

        // One is empty, other is not
        if (root1 == null || root2 == null) {
            return false;
        }

        // Values don't match
        if (root1.data != root2.data) {
            return false;
        }

        // Check both subtrees
        return areIdentical(root1.left, root2.left)
                && areIdentical(root1.right, root2.right);
    }

    public static void main(String[] args) {

        // Tree 1
        Node root1 = new Node(10);

        root1.left = new Node(5);
        root1.right = new Node(15);

        root1.left.left = new Node(2);
        root1.left.right = new Node(7);

        // Tree 2
        Node root2 = new Node(10);

        root2.left = new Node(5);
        root2.right = new Node(15);

        root2.left.left = new Node(2);
        root2.left.right = new Node(7);

        if (areIdentical(root1, root2)) {
            System.out.println("Trees are Identical");
        } else {
            System.out.println("Trees are NOT Identical");
        }
    }
}