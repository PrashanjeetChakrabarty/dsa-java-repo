import java.util.Scanner;

public class Function128 {

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

    // Find maximum depth
    public static int maxDepth(Node root) {

        if (root == null) {
            return 0;
        }

        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        return 1 + Math.max(leftDepth, rightDepth);
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

        int depth = maxDepth(root);

        System.out.println("Maximum Depth = " + depth);

        sc.close();
    }
}