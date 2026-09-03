import java.util.*;

public class Function144 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static Node head = null;
    static Node prev = null;

    static void convertToDLL(Node root) {

        if (root == null) {
            return;
        }

        // Convert left subtree
        convertToDLL(root.left);

        // First visited node becomes head
        if (prev == null) {
            head = root;
        } else {
            // Connect current node with previous node
            root.left = prev;
            prev.right = root;
        }

        // Move previous pointer
        prev = root;

        // Convert right subtree
        convertToDLL(root.right);
    }

    static void printDLL(Node head) {

        Node current = head;

        System.out.print("Doubly Linked List: ");

        while (current != null) {
            System.out.print(current.data + " ");

            if (current.right != null) {
                System.out.print("<-> ");
            }

            current = current.right;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
                 10
                /  \
               5    15
              / \     \
             2   7     20
        */

        Node root = new Node(10);

        root.left = new Node(5);
        root.right = new Node(15);

        root.left.left = new Node(2);
        root.left.right = new Node(7);

        root.right.right = new Node(20);

        convertToDLL(root);

        printDLL(head);

        sc.close();
    }
}