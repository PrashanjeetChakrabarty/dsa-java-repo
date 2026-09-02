import java.util.*;

public class Function142 {

    static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    static int preorderIndex = 0;

    // Build tree
    public static Node buildTree(
            int[] preorder,
            int[] inorder,
            int start,
            int end,
            HashMap<Integer, Integer> map) {

        if (start > end) {
            return null;
        }

        // First element in preorder is the root
        int rootValue = preorder[preorderIndex++];

        Node root = new Node(rootValue);

        // Find root position in inorder
        int rootIndex = map.get(rootValue);

        // Build left subtree
        root.left = buildTree(
                preorder,
                inorder,
                start,
                rootIndex - 1,
                map
        );

        // Build right subtree
        root.right = buildTree(
                preorder,
                inorder,
                rootIndex + 1,
                end,
                map
        );

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

    // Preorder traversal
    public static void preorder(Node root) {

        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");

        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        int[] preorder = new int[n];
        int[] inorder = new int[n];

        System.out.println("Enter Preorder:");

        for (int i = 0; i < n; i++) {
            preorder[i] = sc.nextInt();
        }

        System.out.println("Enter Inorder:");

        for (int i = 0; i < n; i++) {
            inorder[i] = sc.nextInt();
        }

        // Store inorder positions
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(inorder[i], i);
        }

        preorderIndex = 0;

        Node root = buildTree(
                preorder,
                inorder,
                0,
                n - 1,
                map
        );

        System.out.println("Constructed Tree:");

        System.out.print("Inorder: ");
        inorder(root);

        System.out.println();

        System.out.print("Preorder: ");
        preorder(root);

        System.out.println();

        sc.close();
    }
}