import java.util.Scanner;

public class Function123 {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    // Insert
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

    // Search
    public static boolean search(Node root, int value) {

        if (root == null) {
            return false;
        }

        if (root.data == value) {
            return true;
        }

        if (value < root.data) {
            return search(root.left, value);
        }

        return search(root.right, value);
    }

    // Find minimum node
    public static Node findMin(Node root) {

        while (root.left != null) {
            root = root.left;
        }

        return root;
    }

    // Delete
    public static Node delete(Node root, int value) {

        if (root == null) {
            return null;
        }

        if (value < root.data) {
            root.left = delete(root.left, value);
        }
        else if (value > root.data) {
            root.right = delete(root.right, value);
        }
        else {

            // Case 1: No child
            if (root.left == null && root.right == null) {
                return null;
            }

            // Case 2: One child
            if (root.left == null) {
                return root.right;
            }

            if (root.right == null) {
                return root.left;
            }

            // Case 3: Two children
            Node successor = findMin(root.right);

            root.data = successor.data;

            root.right = delete(root.right, successor.data);
        }

        return root;
    }

    // Inorder: Left Root Right
    public static void inorder(Node root) {

        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Preorder: Root Left Right
    public static void preorder(Node root) {

        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Postorder: Left Right Root
    public static void postorder(Node root) {

        if (root == null) {
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
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

        System.out.print("Inorder: ");
        inorder(root);

        System.out.println();

        System.out.print("Preorder: ");
        preorder(root);

        System.out.println();

        System.out.print("Postorder: ");
        postorder(root);

        System.out.println();

        System.out.print("Enter value to search: ");
        int searchValue = sc.nextInt();

        System.out.println(
            search(root, searchValue)
                ? "Value Found"
                : "Value Not Found"
        );

        System.out.print("Enter value to delete: ");
        int deleteValue = sc.nextInt();

        root = delete(root, deleteValue);

        System.out.print("Inorder after deletion: ");
        inorder(root);

        System.out.println();

        sc.close();
    }
}