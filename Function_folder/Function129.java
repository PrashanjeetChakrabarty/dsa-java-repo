import java.util.Scanner;

public class Function129 {

    static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    // Insert into BST
    public static Node insert(Node root, int value) {

        if (root == null) {
            return new Node(value);
        }

        if (value < root.data) {
            root.left = insert(root.left, value);
        }
        else if (value > root.data) {
            root.right = insert(root.right, value);
        }

        return root;
    }

    // Returns height if balanced, -1 otherwise
    public static int checkHeight(Node root) {

        if (root == null) {
            return 0;
        }

        int leftHeight = checkHeight(root.left);

        if (leftHeight == -1) {
            return -1;
        }

        int rightHeight = checkHeight(root.right);

        if (rightHeight == -1) {
            return -1;
        }

        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }

        return 1 + Math.max(leftHeight, rightHeight);
    }

    // Function to check balance
    public static boolean isBalanced(Node root) {

        return checkHeight(root) != -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Node root = null;

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        System.out.println("Enter values:");

        for (int i = 0; i < n; i++) {
            root = insert(root, sc.nextInt());
        }

        if (isBalanced(root)) {
            System.out.println("Binary Tree is Height-Balanced");
        }
        else {
            System.out.println("Binary Tree is NOT Height-Balanced");
        }

        sc.close();
    }
}