import java.util.*;

public class Function146 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static Node sortedArrayToBST(int[] arr, int start, int end) {

        // Base case
        if (start > end) {
            return null;
        }

        // Find middle element
        int mid = start + (end - start) / 2;

        // Middle element becomes root
        Node root = new Node(arr[mid]);

        // Build left subtree
        root.left = sortedArrayToBST(arr, start, mid - 1);

        // Build right subtree
        root.right = sortedArrayToBST(arr, mid + 1, end);

        return root;
    }

    static void preorder(Node root) {

        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");

        preorder(root.left);
        preorder(root.right);
    }

    static void inorder(Node root) {

        if (root == null) {
            return;
        }

        inorder(root.left);

        System.out.print(root.data + " ");

        inorder(root.right);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter sorted array:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Node root = sortedArrayToBST(arr, 0, n - 1);

        System.out.print("Preorder of Balanced BST: ");
        preorder(root);

        System.out.println();

        System.out.print("Inorder of BST: ");
        inorder(root);

        sc.close();
    }
}