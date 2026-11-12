public class Function209 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static int findMinimumInternal(Node root) {

        // Base case
        if (root == null) {
            return Integer.MAX_VALUE;
        }

        // Ignore leaf nodes
        if (root.left == null && root.right == null) {
            return Integer.MAX_VALUE;
        }

        System.out.print(root.data + " ");

        // Find minimum in left and right subtrees
        int leftMin = findMinimumInternal(root.left);
        int rightMin = findMinimumInternal(root.right);

        return Math.min(root.data, Math.min(leftMin, rightMin));
    }

    public static void main(String[] args) {

        Node root = new Node(10);

        root.left = new Node(20);
        root.right = new Node(30);

        root.left.left = new Node(40);
        root.left.right = new Node(50);

        root.right.right = new Node(60);

        System.out.print("Internal Nodes: ");

        int minimum = findMinimumInternal(root);

        System.out.println("\nMinimum Internal Node: " + minimum);
    }
}