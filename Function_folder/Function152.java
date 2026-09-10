import java.util.*;

public class Function152 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static Node findSuccessor(Node root, int key) {

        Node successor = null;

        while (root != null) {

            if (key < root.data) {
                // Current node can be a successor
                successor = root;

                // Look for a smaller possible successor
                root = root.left;

            } else if (key > root.data) {

                // Successor must be on the right
                root = root.right;

            } else {

                // Node found

                // If right subtree exists,
                // successor is the smallest node there
                if (root.right != null) {

                    Node current = root.right;

                    while (current.left != null) {
                        current = current.left;
                    }

                    successor = current;
                }

                break;
            }
        }

        return successor;
    }

    public static void main(String[] args) {

        /*
                 20
                /  \
              10    30
             / \    / \
            5  15  25  35
        */

        Node root = new Node(20);

        root.left = new Node(10);
        root.right = new Node(30);

        root.left.left = new Node(5);
        root.left.right = new Node(15);

        root.right.left = new Node(25);
        root.right.right = new Node(35);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter node value: ");
        int key = sc.nextInt();

        Node successor = findSuccessor(root, key);

        if (successor == null) {
            System.out.println("Inorder Successor does not exist.");
        } else {
            System.out.println("Inorder Successor: " + successor.data);
        }

        sc.close();
    }
}