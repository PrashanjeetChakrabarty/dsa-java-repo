public class Function218 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static int sumNegativeNodes(Node root) {

        // Base case
        if (root == null) {
            return 0;
        }

        int sum = 0;

        // Check if the value is negative
        if (root.data < 0) {
            System.out.print(root.data + " ");
            sum = root.data;
        }

        // Traverse left and right subtrees
        sum += sumNegativeNodes(root.left);
        sum += sumNegativeNodes(root.right);

        return sum;
    }

    public static void main(String[] args) {

        Node root = new Node(10);

        root.left = new Node(-5);
        root.right = new Node(8);

        root.left.left = new Node(4);
        root.left.right = new Node(-7);

        root.right.right = new Node(-6);

        System.out.print("Negative Nodes: ");

        int result = sumNegativeNodes(root);

        System.out.println("\nSum of Negative Nodes: " + result);
    }
}