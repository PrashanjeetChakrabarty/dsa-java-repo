
import java.util.*;

public class Function188 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static void spiralOrder(Node root) {

        if (root == null) {
            return;
        }

        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();

        stack1.push(root);

        while (!stack1.isEmpty() || !stack2.isEmpty()) {

            // Print the current level from left to right
            while (!stack1.isEmpty()) {

                Node current = stack1.pop();
                System.out.print(current.data + " ");

                if (current.left != null) {
                    stack2.push(current.left);
                }

                if (current.right != null) {
                    stack2.push(current.right);
                }
            }

            System.out.println();

            // Print the next level from right to left
            while (!stack2.isEmpty()) {

                Node current = stack2.pop();
                System.out.print(current.data + " ");

                if (current.right != null) {
                    stack1.push(current.right);
                }

                if (current.left != null) {
                    stack1.push(current.left);
                }
            }

            if (!stack2.isEmpty() || !stack1.isEmpty()) {
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {

        /*
                1
               / \
              2   3
             / \ / \
            4  5 6  7
        */

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        spiralOrder(root);
    }
}