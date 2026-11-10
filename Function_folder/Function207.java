public class Function207 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static int findMinimumLeaf(Node root) {

        // Base case
        if (root == null) {
            return Integer.MAX_VALUE;
        }

        // Check if the current node is a leaf
        if (root.left == null && root.right == null) {
            System.out.print(root.data + " ");
            return root.data;
        }

        // Find minimum in left and right subtrees
        int leftMin = findMinimumLeaf(root.left);
        int rightMin = findMinimumLeaf(root.right);

        return Math.min(leftMin, rightMin);
    }

    public static void main(String[] args) {

        Node root = new Node(10);

        root.left = new Node(20);
        root.right = new Node(30);

        root.left.left = new Node(40);
        root.left.right = new Node(50);

        root.right.right = new Node(60);

        System.out.print("Leaf Nodes: ");

        int minimum = findMinimumLeaf(root);

        System.out.println("\nMinimum Leaf Node: " + minimum);
    }
}