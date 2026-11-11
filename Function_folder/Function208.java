public class Function208 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static int findMaximumInternal(Node root) {

        // Base case
        if (root == null) {
            return Integer.MIN_VALUE;
        }

        // Check if the node is an internal node
        if (root.left == null && root.right == null) {
            return Integer.MIN_VALUE;
        }

        System.out.print(root.data + " ");

        // Find maximum in left and right subtrees
        int leftMax = findMaximumInternal(root.left);
        int rightMax = findMaximumInternal(root.right);

        return Math.max(root.data, Math.max(leftMax, rightMax));
    }

    public static void main(String[] args) {

        Node root = new Node(10);

        root.left = new Node(20);
        root.right = new Node(30);

        root.left.left = new Node(40);
        root.left.right = new Node(50);

        root.right.right = new Node(60);

        System.out.print("Internal Nodes: ");

        int maximum = findMaximumInternal(root);

        System.out.println("\nMaximum Internal Node: " + maximum);
    }
}