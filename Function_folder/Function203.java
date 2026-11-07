public class Function203 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static int sumOfLeafNodes(Node root) {

        if (root == null) {
            return 0;
        }

        // Check if the node is a leaf
        if (root.left == null && root.right == null) {
            return root.data;
        }

        return sumOfLeafNodes(root.left)
                + sumOfLeafNodes(root.right);
    }

    static int sumOfInternalNodes(Node root) {

        if (root == null) {
            return 0;
        }

        // Check if the node is an internal node
        if (root.left != null || root.right != null) {
            return root.data
                    + sumOfInternalNodes(root.left)
                    + sumOfInternalNodes(root.right);
        }

        return 0;
    }

    public static void main(String[] args) {

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.right = new Node(6);

        int leafSum = sumOfLeafNodes(root);
        int internalSum = sumOfInternalNodes(root);

        int difference = Math.abs(leafSum - internalSum);

        System.out.println("Sum of Leaf Nodes: " + leafSum);
        System.out.println("Sum of Internal Nodes: " + internalSum);
        System.out.println("Difference: " + difference);
    }
}