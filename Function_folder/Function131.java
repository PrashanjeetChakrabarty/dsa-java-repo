import java.util.Scanner;

public class Function131 {

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

    // Invert binary tree
    public static Node invertTree(Node root) {

        if (root == null) {
            return null;
        }

        // Invert left and right subtrees
        Node left = invertTree(root.left);
        Node right = invertTree(root.right);

        // Swap
        root.left = right;
        root.right = left;

        return root;
    }

    // Inorder traversal
    public static void inorder(Node root) {

        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
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

        System.out.print("Original Inorder: ");
        inorder(root);

        System.out.println();

        root = invertTree(root);

        System.out.print("Inverted Inorder: ");
        inorder(root);

        System.out.println();

        sc.close();
    }
}