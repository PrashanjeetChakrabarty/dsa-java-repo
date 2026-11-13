public class Function210 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static int countEvenNodes(Node root) {

        // Base case
        if (root == null) {
            return 0;
        }

        int count = 0;

        // Check if the node contains an even value
        if (root.data % 2 == 0) {
            System.out.print(root.data + " ");
            count = 1;
        }

        // Traverse left and right subtrees
        count += countEvenNodes(root.left);
        count += countEvenNodes(root.right);

        return count;
    }

    public static void main(String[] args) {

        Node root = new Node(10);

        root.left = new Node(5);
        root.right = new Node(8);

        root.left.left = new Node(4);
        root.left.right = new Node(7);

        root.right.right = new Node(6);

        System.out.print("Even Nodes: ");

        int result = countEvenNodes(root);

        System.out.println("\nTotal Even Nodes: " + result);
    }
}