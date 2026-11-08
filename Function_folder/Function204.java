public class Function204 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static long productOfLeafNodes(Node root) {

        // Base case
        if (root == null) {
            return 1;
        }

        // Check if the current node is a leaf
        if (root.left == null && root.right == null) {
            System.out.print(root.data + " ");
            return root.data;
        }

        // Calculate product of left and right subtrees
        long leftProduct = productOfLeafNodes(root.left);
        long rightProduct = productOfLeafNodes(root.right);

        return leftProduct * rightProduct;
    }

    public static void main(String[] args) {

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.right = new Node(6);

        System.out.print("Leaf Nodes: ");

        long product = productOfLeafNodes(root);

        System.out.println("\nProduct of Leaf Nodes: " + product);
    }
}