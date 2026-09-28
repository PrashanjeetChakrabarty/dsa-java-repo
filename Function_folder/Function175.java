import java.util.Scanner;

public class Function175 {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    static int countInternalNodes(Node root) {

        // Empty tree
        if (root == null) {
            return 0;
        }

        // Leaf node
        if (root.left == null && root.right == null) {
            return 0;
        }

        // Current node is internal
        return 1 + countInternalNodes(root.left)
                 + countInternalNodes(root.right);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

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

        int result = countInternalNodes(root);

        System.out.println("Number of Internal Nodes: " + result);

        sc.close();
    }
}