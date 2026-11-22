public class Function220 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static int countGreaterThan(Node root, int k) {

        // Base case
        if (root == null) {
            return 0;
        }

        int count = 0;

        // Check if node value is greater than k
        if (root.data > k) {
            System.out.print(root.data + " ");
            count = 1;
        }

        // Traverse left and right subtrees
        count += countGreaterThan(root.left, k);
        count += countGreaterThan(root.right, k);

        return count;
    }

    public static void main(String[] args) {

        Node root = new Node(10);

        root.left = new Node(5);
        root.right = new Node(8);

        root.left.left = new Node(4);
        root.left.right = new Node(7);

        root.right.right = new Node(12);

        int k = 5;

        System.out.println("Target: " + k);
        System.out.print("Nodes Greater Than " + k + ": ");

        int result = countGreaterThan(root, k);

        System.out.println("\nTotal Count: " + result);
    }
}