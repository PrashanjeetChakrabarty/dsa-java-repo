import java.util.*;

public class Function153 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static Node findPredecessor(Node root, int key) {

        Node predecessor = null;

        while (root != null) {

            if (key > root.data) {
                // Current node can be a predecessor
                predecessor = root;

                // Look for a larger possible predecessor
                root = root.right;

            } else if (key < root.data) {

                // Predecessor must be on the left
                root = root.left;

            } else {

                // Node found

                // If left subtree exists,
                // predecessor is the largest node there
                if (root.left != null) {

                    Node current = root.left;

                    while (current.right != null) {
                        current = current.right;
                    }

                    predecessor = current;
                }

                break;
            }
        }

        return predecessor;
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

        Node predecessor = findPredecessor(root, key);

        if (predecessor == null) {
            System.out.println("Inorder Predecessor does not exist.");
        } else {
            System.out.println("Inorder Predecessor: " + predecessor.data);
        }

        sc.close();
    }
}