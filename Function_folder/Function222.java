public class Function222 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static int countEqualNodes(Node root, int k) {

        // Base case
        if (root == null) {
            return 0;
        }

        int count = 0;

        // Check if node value equals k
        if (root.data == k) {
            System.out.print(root.data + " ");
            count = 1;
        }

        // Traverse left and right subtrees
        count += countEqualNodes(root.left, k);
        count += countEqualNodes(root.right, k);

        return count;
    }

    public static void main(String[] args) {

        Node root = new Node(5);

        root.left = new Node(3);
        root.right = new Node(5);

        root.left.left = new Node(5);
        root.left.right = new Node(7);

        root.right.right = new Node(5);

        int k = 5;

        System.out.println("Target: " + k);
        System.out.print("Nodes Equal to " + k + ": ");

        int result = countEqualNodes(root, k);

        System.out.println("\nTotal Count: " + result);
    }
}