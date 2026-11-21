public class Function219 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static int sumZeroNodes(Node root) {

        // Base case
        if (root == null) {
            return 0;
        }

        int sum = 0;

        // Check if the value is zero
        if (root.data == 0) {
            System.out.print(root.data + " ");
            sum = root.data;
        }

        // Traverse left and right subtrees
        sum += sumZeroNodes(root.left);
        sum += sumZeroNodes(root.right);

        return sum;
    }

    public static void main(String[] args) {

        Node root = new Node(10);

        root.left = new Node(0);
        root.right = new Node(8);

        root.left.left = new Node(4);
        root.left.right = new Node(0);

        root.right.right = new Node(0);

        System.out.print("Zero Nodes: ");

        int result = sumZeroNodes(root);

        System.out.println("\nSum of Zero Nodes: " + result);
    }
}