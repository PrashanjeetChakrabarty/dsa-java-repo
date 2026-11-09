public class Function206 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static int findMaximumLeaf(Node root) {

        // Base case
        if (root == null) {
            return Integer.MIN_VALUE;
        }

        // Check if the current node is a leaf
        if (root.left == null && root.right == null) {
            System.out.print(root.data + " ");
            return root.data;
        }

        // Find maximum in left and right subtrees
        int leftMax = findMaximumLeaf(root.left);
        int rightMax = findMaximumLeaf(root.right);

        return Math.max(leftMax, rightMax);
    }

    public static void main(String[] args) {

        Node root = new Node(10);

        root.left = new Node(20);
        root.right = new Node(30);

        root.left.left = new Node(40);
        root.left.right = new Node(50);

        root.right.right = new Node(60);

        System.out.print("Leaf Nodes: ");

        int maximum = findMaximumLeaf(root);

        System.out.println("\nMaximum Leaf Node: " + maximum);
    }
}