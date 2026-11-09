public class Function205 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static long productOfInternalNodes(Node root) {

        // Base case
        if (root == null) {
            return 1;
        }

        // Check if the node is an internal node
        if (root.left != null || root.right != null) {

            System.out.print(root.data + " ");

            return root.data
                    * productOfInternalNodes(root.left)
                    * productOfInternalNodes(root.right);
        }

        // Leaf nodes are excluded
        return 1;
    }

    public static void main(String[] args) {

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.right = new Node(6);

        System.out.print("Internal Nodes: ");

        long product = productOfInternalNodes(root);

        System.out.println("\nProduct of Internal Nodes: " + product);
    }
}