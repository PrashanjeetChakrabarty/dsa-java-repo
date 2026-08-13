import java.util.Scanner;

public class Function125 {

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

    // Find Lowest Common Ancestor
    public static Node lowestCommonAncestor(
            Node root, int p, int q) {

        while (root != null) {

            // Both nodes are in left subtree
            if (p < root.data && q < root.data) {
                root = root.left;
            }

            // Both nodes are in right subtree
            else if (p > root.data && q > root.data) {
                root = root.right;
            }

            // They are on different sides,
            // or one of them is the current node
            else {
                return root;
            }
        }

        return null;
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

        System.out.print("Enter first node: ");
        int p = sc.nextInt();

        System.out.print("Enter second node: ");
        int q = sc.nextInt();

        Node lca = lowestCommonAncestor(root, p, q);

        if (lca != null) {
            System.out.println("Lowest Common Ancestor = "
                    + lca.data);
        }
        else {
            System.out.println("LCA not found");
        }

        sc.close();
    }
}