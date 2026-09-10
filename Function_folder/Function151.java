import java.util.*;

public class Function151 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static int count = 0;
    static int result = -1;

    static void findKthLargest(Node root, int k) {

        if (root == null || result != -1) {
            return;
        }

        // Visit right subtree first
        findKthLargest(root.right, k);

        // Process current node
        count++;

        if (count == k) {
            result = root.data;
            return;
        }

        // Visit left subtree
        findKthLargest(root.left, k);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
                 5
                / \
               3   7
              / \   \
             2   4   8
        */

        Node root = new Node(5);

        root.left = new Node(3);
        root.right = new Node(7);

        root.left.left = new Node(2);
        root.left.right = new Node(4);

        root.right.right = new Node(8);

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        findKthLargest(root, k);

        if (result == -1) {
            System.out.println("Invalid value of k.");
        } else {
            System.out.println("Kth Largest Element: " + result);
        }

        sc.close();
    }
}