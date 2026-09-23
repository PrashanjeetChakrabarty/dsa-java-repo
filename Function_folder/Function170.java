import java.util.*;

public class Function170 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static void mirror(Node root) {

        if (root == null) {
            return;
        }

        // Swap left and right children
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;

        // Mirror left subtree
        mirror(root.left);

        // Mirror right subtree
        mirror(root.right);
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

        System.out.print("Original Inorder: ");
        inorder(root);

        System.out.println();

        mirror(root);

        System.out.print("Mirror Inorder: ");
        inorder(root);

        System.out.println();
    }
}