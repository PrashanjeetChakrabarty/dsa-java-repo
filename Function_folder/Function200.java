public class Function200 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static int sumOfInternalNodes(Node root) {

        // Base case
        if (root == null) {
            return 0;
        }

        // Check if the current node is an internal node
        if (root.left != null || root.right != null) {
            System.out.print(root.data + " ");

            return root.data
                    + sumOfInternalNodes(root.left)
                    + sumOfInternalNodes(root.right);
        }

        // Leaf nodes are not included
        return 0;
    }

    public static void main(String[] args) {

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.right = new Node(6);

        System.out.print("Internal Nodes: ");

        int sum = sumOfInternalNodes(root);

        System.out.println("\nSum of Internal Nodes: " + sum);
    }
}