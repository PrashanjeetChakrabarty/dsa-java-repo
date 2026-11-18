public class Function216 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static int countZeroNodes(Node root) {

        // Base case
        if (root == null) {
            return 0;
        }

        int count = 0;

        // Check if the value is zero
        if (root.data == 0) {
            System.out.print(root.data + " ");
            count = 1;
        }

        // Traverse left and right subtrees
        count += countZeroNodes(root.left);
        count += countZeroNodes(root.right);

        return count;
    }

    public static void main(String[] args) {

        Node root = new Node(10);

        root.left = new Node(0);
        root.right = new Node(8);

        root.left.left = new Node(4);
        root.left.right = new Node(0);

        root.right.right = new Node(0);

        System.out.print("Zero-Valued Nodes: ");

        int result = countZeroNodes(root);

        System.out.println("\nTotal Zero Nodes: " + result);
    }
}