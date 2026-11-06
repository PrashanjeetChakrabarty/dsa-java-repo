public class Function202 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static int countTwoChildNodes(Node root) {

        // Base case
        if (root == null) {
            return 0;
        }

        int count = 0;

        // Check if both children exist
        if (root.left != null && root.right != null) {
            System.out.println(root.data);
            count = 1;
        }

        // Recursively count in left and right subtrees
        count += countTwoChildNodes(root.left);
        count += countTwoChildNodes(root.right);

        return count;
    }

    public static void main(String[] args) {

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.right = new Node(6);

        root.left.right.left = new Node(7);
        root.left.right.right = new Node(8);

        System.out.println("Nodes With Two Children:");

        int result = countTwoChildNodes(root);

        System.out.println("Total Count: " + result);
    }
}