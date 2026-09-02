import java.util.*;

public class Function143 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static int postorderIndex;

    static Node buildTree(int[] inorder, int[] postorder,
                          int start, int end,
                          HashMap<Integer, Integer> map) {

        if (start > end) {
            return null;
        }

        // Last element of postorder is the root
        int rootValue = postorder[postorderIndex--];

        Node root = new Node(rootValue);

        // Find root position in inorder
        int rootIndex = map.get(rootValue);

        // IMPORTANT:
        // Build right subtree first
        root.right = buildTree(
                inorder,
                postorder,
                rootIndex + 1,
                end,
                map
        );

        // Then build left subtree
        root.left = buildTree(
                inorder,
                postorder,
                start,
                rootIndex - 1,
                map
        );

        return root;
    }

    static void printPreorder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        printPreorder(root.left);
        printPreorder(root.right);
    }

    static void printInorder(Node root) {
        if (root == null) {
            return;
        }

        printInorder(root.left);
        System.out.print(root.data + " ");
        printInorder(root.right);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        int[] inorder = new int[n];
        int[] postorder = new int[n];

        System.out.println("Enter inorder traversal:");
        for (int i = 0; i < n; i++) {
            inorder[i] = sc.nextInt();
        }

        System.out.println("Enter postorder traversal:");
        for (int i = 0; i < n; i++) {
            postorder[i] = sc.nextInt();
        }

        // Store positions of elements in inorder
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(inorder[i], i);
        }

        postorderIndex = n - 1;

        Node root = buildTree(
                inorder,
                postorder,
                0,
                n - 1,
                map
        );

        System.out.print("Preorder of constructed tree: ");
        printPreorder(root);

        System.out.println();

        System.out.print("Inorder of constructed tree: ");
        printInorder(root);

        sc.close();
    }
}