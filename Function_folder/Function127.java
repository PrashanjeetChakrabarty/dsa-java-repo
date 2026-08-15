import java.util.*;

public class Function127 {

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

    // Zigzag Level Order Traversal
    public static void zigzagTraversal(Node root) {

        if (root == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();

        queue.offer(root);

        boolean leftToRight = true;

        while (!queue.isEmpty()) {

            int size = queue.size();

            int[] level = new int[size];

            for (int i = 0; i < size; i++) {

                Node current = queue.poll();

                int index;

                if (leftToRight) {
                    index = i;
                } else {
                    index = size - 1 - i;
                }

                level[index] = current.data;

                if (current.left != null) {
                    queue.offer(current.left);
                }

                if (current.right != null) {
                    queue.offer(current.right);
                }
            }

            for (int value : level) {
                System.out.print(value + " ");
            }

            System.out.println();

            leftToRight = !leftToRight;
        }
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

        System.out.println("Zigzag Level Order:");

        zigzagTraversal(root);

        sc.close();
    }
}